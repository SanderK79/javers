package org.javers.repository.mongo;

public class CollectionNameProvider {

  private static final String DEFAULT_SNAPSHOT_COLLECTION_NAME = "jv_snapshot";
  private static final int DEFAULT_CACHE_SIZE = 5_000;
  private final MongoRepositoryConfiguration configuration;

  public CollectionNameProvider(MongoRepositoryConfiguration configuration) {
    this.configuration = configuration;
  }

  String getSnapshotCollectionName() {
    return configuration.getSnapshotCollectionName().orElse(DEFAULT_SNAPSHOT_COLLECTION_NAME);
  }

  int getCacheSize() {
    return configuration.getCacheSize().orElse(DEFAULT_CACHE_SIZE);
  }
}