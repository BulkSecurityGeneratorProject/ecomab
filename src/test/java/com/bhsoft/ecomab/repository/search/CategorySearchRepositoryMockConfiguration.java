package com.bhsoft.ecomab.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of CategorySearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class CategorySearchRepositoryMockConfiguration {

    @MockBean
    private CategorySearchRepository mockCategorySearchRepository;

}
