package io.github.kritin_puri_git.crypto.hashing.service;

import io.github.kritin_puri_git.crypto.hashing.model.HashingResult;
import io.github.kritin_puri_git.crypto.hashing.model.HashingResultMap;

import java.util.List;
import java.util.Map;

public interface HashingService {
    boolean isLatest(short keyId, short version);
    HashingResult hash(String plainData);
    HashingResultMap hash(Map<String, String> plainDataMap);
    List<HashingResult> detailedHashCandidates(String data);
}
