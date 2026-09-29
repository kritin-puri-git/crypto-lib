package io.github.kritin_puri_git.crypto.encryption.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

public record EncryptionRequest(
        String plainData,
        short keyId,
        short version
) {
    public EncryptionRequest{
        Validation.validate(plainData, "plainData", this.getClass().getSimpleName());
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
    }
}