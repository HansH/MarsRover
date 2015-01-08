import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class LinkedMap<K, V> implements Map<K, V> {
	
	public static class LinkedMapEntry<K, V> implements Entry<K, V> {

		private final K key;
		private V value;
		
		public LinkedMapEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		@Override
		public K getKey() {
			return this.key;
		}

		@Override
		public V getValue() {
			return this.value;
		}

		@Override
		public V setValue(V value) {
			V old = this.value;
			this.value = value;
			return old;
		}
		
	}

	private LinkedList<Entry<K, V>> entrySet;
	
	public LinkedMap() {
		this.entrySet = new LinkedList<Entry<K, V>>();
	}
	
	@Override
	public int size() {
		return this.entrySet.size();
	}

	@Override
	public boolean isEmpty() {
		return this.entrySet.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		for (Entry<K, V> entry : this.entrySet) {
			if (entry.getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		for (Entry<K, V> entry : this.entrySet) {
			if (entry.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public V get(Object key) {
		for (Entry<K, V> entry : this.entrySet) {
			if (entry.getKey().equals(key)) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		for (Entry<K, V> entry : this.entrySet) {
			if (entry.getKey().equals(key)) {
				V old = entry.getValue();
				entry.setValue(old);
				return old;
			}
		}
		
		this.entrySet.add(new LinkedMapEntry<K, V>(key, value));
		return null;
	}

	@Override
	public V remove(Object key) {
		Iterator<Entry<K, V>> iterator = this.entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<K, V> cur = iterator.next();
			if (cur.equals(key)) {
				iterator.remove();
				return cur.getValue();
			}
		}
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		for (Entry<? extends K, ? extends V> entry : m.entrySet()) {
			this.put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public void clear() {
		this.entrySet.clear();
	}

	@Override
	public Set<K> keySet() {
		return new HashSet<K>(keyList());
	}
	
	public List<K> keyList() {
		ArrayList<K> result = new ArrayList<K>();
		for (Entry<K, V> entry : this.entrySet) {
			result.add(entry.getKey());
		}
		return result;
	}

	@Override
	public Collection<V> values() {
		ArrayList<V> result = new ArrayList<V>();
		for (Entry<K, V> entry : this.entrySet) {
			result.add(entry.getValue());
		}
		return result;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		return new HashSet<Entry<K, V>>(this.entrySet);
	}
	
	public List<Entry<K, V>> entryList() {
		return this.entrySet;
	}

}
