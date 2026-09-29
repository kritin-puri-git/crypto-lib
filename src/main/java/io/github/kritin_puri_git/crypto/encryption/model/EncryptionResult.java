package io.github.kritin_puri_git.crypto.encryption.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

public record EncryptionResult(
        byte[] encryptedData,
        short keyId,
        short version
) {
    public EncryptionResult{
        Validation.validate(encryptedData, "encryptedData", this.getClass().getSimpleName());
        if (keyId <= 0) {
            throw new IllegalArgumentException(
                    "keyId cannot be negative in EncryptionResult"
            );
        }
        if (version <= 0) {
            throw new IllegalArgumentException(
                    "version cannot be negative in EncryptionResult"
            );
        }

        encryptedData = encryptedData.clone();
    }
    @Override
    public byte[] encryptedData(){
        return this.encryptedData.clone();
    }

}
