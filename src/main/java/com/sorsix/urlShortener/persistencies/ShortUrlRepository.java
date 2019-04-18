package com.sorsix.urlShortener.persistencies;

import com.sorsix.urlShortener.models.ShortUrl;
import org.springframework.data.repository.CrudRepository;

public interface ShortUrlRepository extends CrudRepository<ShortUrl, Long> {
}
