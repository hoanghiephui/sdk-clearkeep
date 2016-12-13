#include <string.h>
#include <stdint.h>

#include <jni.h>
#include "curve25519-donna.h"
#include "curve_sigs.h"
#include "xeddsa.h"
#include "vxeddsa.h"

JNIEXPORT jbyteArray JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_generatePrivateKey
  (JNIEnv *env, jobject obj, jbyteArray random)
{
  uint8_t* privateKey = (uint8_t*)(*env)->GetByteArrayElements(env, random, 0);

  privateKey[0] &= 248;
  privateKey[31] &= 127;
  privateKey[31] |= 64;

  (*env)->ReleaseByteArrayElements(env, random, privateKey, 0);

  return random;
}

JNIEXPORT jbyteArray JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_generatePublicKey
  (JNIEnv *env, jobject obj, jbyteArray privateKey)
{
    static const uint8_t  basepoint[32] = {9};

    jbyteArray publicKey       = (*env)->NewByteArray(env, 32);
    uint8_t*   publicKeyBytes  = (uint8_t*)(*env)->GetByteArrayElements(env, publicKey, 0);
    uint8_t*   privateKeyBytes = (uint8_t*)(*env)->GetByteArrayElements(env, privateKey, 0);

    curve25519_donna(publicKeyBytes, privateKeyBytes, basepoint);

    (*env)->ReleaseByteArrayElements(env, publicKey, publicKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, privateKey, privateKeyBytes, 0);

    return publicKey;
}

JNIEXPORT jbyteArray JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_calculateAgreement
  (JNIEnv *env, jobject obj, jbyteArray privateKey, jbyteArray publicKey)
{
    jbyteArray sharedKey       = (*env)->NewByteArray(env, 32);
    uint8_t*   sharedKeyBytes  = (uint8_t*)(*env)->GetByteArrayElements(env, sharedKey, 0);
    uint8_t*   privateKeyBytes = (uint8_t*)(*env)->GetByteArrayElements(env, privateKey, 0);
    uint8_t*   publicKeyBytes  = (uint8_t*)(*env)->GetByteArrayElements(env, publicKey, 0);

    curve25519_donna(sharedKeyBytes, privateKeyBytes, publicKeyBytes);

    (*env)->ReleaseByteArrayElements(env, sharedKey, sharedKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, publicKey, publicKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, privateKey, privateKeyBytes, 0);

    return sharedKey;
}

JNIEXPORT jbyteArray JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_calculateSignature
  (JNIEnv *env, jobject obj, jbyteArray random, jbyteArray privateKey, jbyteArray message)
{
    jbyteArray signature       = (*env)->NewByteArray(env, 64);
    uint8_t*   signatureBytes  = (uint8_t*)(*env)->GetByteArrayElements(env, signature, 0);
    uint8_t*   randomBytes     = (uint8_t*)(*env)->GetByteArrayElements(env, random, 0);
    uint8_t*   privateKeyBytes = (uint8_t*)(*env)->GetByteArrayElements(env, privateKey, 0);
    uint8_t*   messageBytes    = (uint8_t*)(*env)->GetByteArrayElements(env, message, 0);
    jsize      messageLength   = (*env)->GetArrayLength(env, message);

    int result = xed25519_sign(signatureBytes, privateKeyBytes, messageBytes, messageLength, randomBytes);

    (*env)->ReleaseByteArrayElements(env, signature, signatureBytes, 0);
    (*env)->ReleaseByteArrayElements(env, random, randomBytes, 0);
    (*env)->ReleaseByteArrayElements(env, privateKey, privateKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, message, messageBytes, 0);

    if (result == 0) return signature;
    else             (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/AssertionError"), "Signature failed!");
}

JNIEXPORT jboolean JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_verifySignature
  (JNIEnv *env, jobject obj, jbyteArray publicKey, jbyteArray message, jbyteArray signature)
{
    uint8_t*   signatureBytes = (uint8_t*)(*env)->GetByteArrayElements(env, signature, 0);
    uint8_t*   publicKeyBytes = (uint8_t*)(*env)->GetByteArrayElements(env, publicKey, 0);
    uint8_t*   messageBytes   = (uint8_t*)(*env)->GetByteArrayElements(env, message, 0);
    jsize      messageLength  = (*env)->GetArrayLength(env, message);

    jboolean result = (curve25519_verify(signatureBytes, publicKeyBytes, messageBytes, messageLength) == 0);

    (*env)->ReleaseByteArrayElements(env, signature, signatureBytes, 0);
    (*env)->ReleaseByteArrayElements(env, publicKey, publicKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, message, messageBytes, 0);

    return result;
}

JNIEXPORT jbyteArray JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_calculateVrfSignature
  (JNIEnv *env, jobject obj, jbyteArray random, jbyteArray privateKey, jbyteArray message)
{
    jbyteArray signature       = (*env)->NewByteArray(env, 96);
    uint8_t*   signatureBytes  = (uint8_t*)(*env)->GetByteArrayElements(env, signature, 0);
    uint8_t*   randomBytes     = (uint8_t*)(*env)->GetByteArrayElements(env, random, 0);
    uint8_t*   privateKeyBytes = (uint8_t*)(*env)->GetByteArrayElements(env, privateKey, 0);
    uint8_t*   messageBytes    = (uint8_t*)(*env)->GetByteArrayElements(env, message, 0);
    jsize      messageLength   = (*env)->GetArrayLength(env, message);

    int result = vxed25519_sign(signatureBytes, privateKeyBytes, messageBytes, messageLength, randomBytes);

    (*env)->ReleaseByteArrayElements(env, signature, signatureBytes, 0);
    (*env)->ReleaseByteArrayElements(env, random, randomBytes, 0);
    (*env)->ReleaseByteArrayElements(env, privateKey, privateKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, message, messageBytes, 0);

    if (result == 0) return signature;
    else             (*env)->ThrowNew(env, (*env)->FindClass(env, "java/lang/AssertionError"), "Signature failed!");
}

JNIEXPORT jbyteArray JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_verifyVrfSignature
  (JNIEnv *env, jobject obj, jbyteArray publicKey, jbyteArray message, jbyteArray signature)
{
    uint8_t*   signatureBytes = (uint8_t*)(*env)->GetByteArrayElements(env, signature, 0);
    uint8_t*   publicKeyBytes = (uint8_t*)(*env)->GetByteArrayElements(env, publicKey, 0);
    uint8_t*   messageBytes   = (uint8_t*)(*env)->GetByteArrayElements(env, message, 0);
    jsize      messageLength  = (*env)->GetArrayLength(env, message);

    jbyteArray vrf      = (*env)->NewByteArray(env, 32);
    uint8_t*   vrfBytes = (uint8_t*)(*env)->GetByteArrayElements(env, vrf, 0);

    int result = vxed25519_verify(vrfBytes, signatureBytes, publicKeyBytes, messageBytes, messageLength);

    (*env)->ReleaseByteArrayElements(env, signature, signatureBytes, 0);
    (*env)->ReleaseByteArrayElements(env, publicKey, publicKeyBytes, 0);
    (*env)->ReleaseByteArrayElements(env, message, messageBytes, 0);
    (*env)->ReleaseByteArrayElements(env, vrf, vrfBytes, 0);

    if (result == 0) return vrf;
    else (*env)->ThrowNew(env, (*env)->FindClass(env, "com/fisil/libclearkeep/nativecrypto/VrfSignatureVerificationFailedException"), "Invalid signature");
}


JNIEXPORT jboolean JNICALL Java_com_fisil_libclearkeep_nativecrypto_NativeCryptorProvider_smokeCheck
  (JNIEnv *env, jobject obj, jint dummy)
{
    return 1;
}
