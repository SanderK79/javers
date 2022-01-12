package org.javers.repository.mongo;

import java.util.Optional;

public class MongoRepositoryConfiguration {

  private final String snapshotCollectionName;
  private final Integer cacheSize;

  public MongoRepositoryConfiguration(String snapshotCollectionName, Integer cacheSize) {
    this.snapshotCollectionName = snapshotCollectionName;
    this.cacheSize = cacheSize;
  }

  public Optional<String> getSnapshotCollectionName() {
    return Optional.ofNullable(snapshotCollectionName);
  }

  public Optional<Integer> getCacheSize() {
    return Optional.ofNullable(cacheSize);
  }
}
