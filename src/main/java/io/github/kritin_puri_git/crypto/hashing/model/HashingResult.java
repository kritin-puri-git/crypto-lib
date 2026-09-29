package io.github.kritin_puri_git.crypto.hashing.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

public record HashingResult(
        byte[] hash,
        short keyId,
        short version
) {
    public HashingResult{
        Validation.validate(hash, "hash", this.getClass().getSimpleName());
        hash = hash.clone();
    }

    @Override
    public byte[] hash(){
        return this.hash.clone();
    }
}
