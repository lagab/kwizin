package com.lagab.kwizin.repository;


import com.lagab.kwizin.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author gabriel
 * @since 11/10/2018.
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, Long> {
}
