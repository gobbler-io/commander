package io.gobbler.commander.common.node;

public interface Node<K, V> {

    K key();

    <T> T get();

    <T> T get(Class<T> type);

    V set(V value);

}
