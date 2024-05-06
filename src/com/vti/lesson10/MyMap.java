package com.vti.lesson10;

// Ex03_Q6
public class MyMap<K, V> {
	protected K key;
	protected V value;

	public MyMap(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
