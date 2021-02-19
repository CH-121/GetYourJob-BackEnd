package ma.fstt.lsi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.fstt.lsi.entities.AppRole;

@RepositoryRestResource
public interface AppRoleRepository extends MongoRepository<AppRole, String>{
	AppRole findByRoleName(@Param("roleName") String roleName);
}
