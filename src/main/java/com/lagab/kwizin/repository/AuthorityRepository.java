package com.lagab.kwizin.repository;


import com.lagab.kwizin.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author gabriel
 * @since 11/10/2018.
 */
@RepositoryRestResource(collectionResourceRel = "authorities", path = "authorities")
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
