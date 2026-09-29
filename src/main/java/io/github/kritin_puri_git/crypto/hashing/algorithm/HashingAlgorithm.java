package io.github.kritin_puri_git.crypto.hashing.algorithm;

import io.github.kritin_puri_git.crypto.hashing.model.HashingData;

import java.util.List;

public interface HashingAlgorithm {

    short getVersion();
    short getActiveKeyId();
    HashingData hash(String data);
    byte[] hash(String data, short keyId);
    List<HashingData> getHashCandidates(final String data);
}
