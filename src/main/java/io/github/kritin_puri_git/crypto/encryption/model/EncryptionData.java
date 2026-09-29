package io.github.kritin_puri_git.crypto.encryption.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

public record EncryptionData(
        byte[] encryptedData,
        short keyId
) {
    public EncryptionData{
        Validation.validate(encryptedData, "encryptedData", this.getClass().getSimpleName());
        encryptedData = encryptedData.clone();
    }

    @Override
    public byte[] encryptedData(){
        return this.encryptedData.clone();
    }
}
