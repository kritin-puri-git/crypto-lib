package io.github.kritin_puri_git.crypto.hashing.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

public record HashingData(
        byte[] hashingData,
        short keyId
) {
    public HashingData{
        Validation.validate(hashingData, "hashingData", this.getClass().getSimpleName());
        hashingData = hashingData.clone();
    }

    @Override
    public byte[] hashingData(){
        return this.hashingData.clone();
    }
}
