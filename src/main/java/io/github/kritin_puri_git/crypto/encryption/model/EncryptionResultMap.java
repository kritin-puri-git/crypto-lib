package io.github.kritin_puri_git.crypto.encryption.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

import java.util.Map;

public record EncryptionResultMap(
        Map<String, byte[]> encryptedDataMap,
        short keyId,
        short version
) {
    public EncryptionResultMap{
        Validation.validate(encryptedDataMap, "encryptedDataMap", this.getClass().getSimpleName());
        encryptedDataMap = Map.copyOf(encryptedDataMap);
    }

    @Override
    public Map<String, byte[]> encryptedDataMap() {
        return Map.copyOf(this.encryptedDataMap);
    }
}
