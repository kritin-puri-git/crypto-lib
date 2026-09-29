package io.github.kritin_puri_git.crypto.encryption.algorithm;

import io.github.kritin_puri_git.crypto.encryption.model.EncryptionData;

public interface EncryptionAlgorithm {

    short getVersion();
    short getActiveKeyId();
    EncryptionData encrypt(String data);
    byte[] encrypt(String data, short keyId);
    String decrypt(byte[] encryptedData, short keyId);
}
