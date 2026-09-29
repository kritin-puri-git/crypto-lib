package io.github.kritin_puri_git.crypto.hashing.model;

import io.github.kritin_puri_git.crypto.validation.Validation;

import java.util.Map;

public record HashingResultMap(
        Map<String, byte[]> hashDataMap,
        short keyId,
        short version
) {
    public HashingResultMap {
        Validation.validate(hashDataMap, "hashDataMap", this.getClass().getSimpleName());

        hashDataMap = Map.copyOf(hashDataMap);
    }

    @Override
    public Map<String, byte[]> hashDataMap(){
        return Map.copyOf(this.hashDataMap);
    }
}
