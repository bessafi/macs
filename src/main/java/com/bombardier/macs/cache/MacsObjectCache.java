package com.bombardier.macs.cache;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.bombardier.macs.MacsException;
import com.ibm.websphere.cache.DistributedMap;

public class MacsObjectCache {
	private static final String MACS_OBJECT_CACHE_JNDI = "services/cache/macs_object_cache";
	private static DistributedMap MACS_OBJECT_CACHE = null;

	/**
	 * 
	 * @return the object cache map managed by the application server
	 * @throws MacsException
	 *             if the cache is not found or another exception occured.
	 */
	public static DistributedMap getCacheMap() throws MacsException {
		if (MACS_OBJECT_CACHE == null) {
			synchronized (MACS_OBJECT_CACHE_JNDI) {
				if (MACS_OBJECT_CACHE == null) {
					InitialContext context = null;
					try {
						context = new InitialContext();
						MACS_OBJECT_CACHE = (DistributedMap) context.lookup(MACS_OBJECT_CACHE_JNDI);
					} catch (NamingException ne) {
						throw new MacsException(ne);
					} finally {
						if (null != context) {
							try {
								context.close();
							} catch (NamingException e) {
								// Doesn't really matter...
							}
						}
					}
				}
			}
		}
		return MACS_OBJECT_CACHE;
	}

	public static CacheItem getCacheItem(String cacheKey) {
		try {
			DistributedMap cache = getCacheMap();

			Object tmp = cache.get(cacheKey);

			return (tmp == null || !(tmp instanceof CacheItem)) ? null : (CacheItem) tmp;

		} catch (MacsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void addOrUpdateCacheItem(String cacheKey, CacheItem cacheItem) {
		try {
			DistributedMap cache = getCacheMap();
			cache.put(cacheKey, cacheItem);

		} catch (MacsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
