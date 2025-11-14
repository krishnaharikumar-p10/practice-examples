package com.tech.products_service.service;

import java.util.concurrent.ConcurrentMap;

import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CacheInspectService {

    private final CacheManager cacheManager;

    public void showCache() {
        cacheManager.getCacheNames().forEach(name -> {
            System.out.println("Cache: " + name);
            ConcurrentMap<?, ?> map = (ConcurrentMap<?, ?>) cacheManager.getCache(name).getNativeCache();
            map.forEach((k, v) -> {
                Object value = v instanceof SimpleValueWrapper wrapper ? wrapper.get() : v;
                System.out.println(k + " -> " + value);
            });
        });
    }
}
