package ma.fstt.lsi.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.fstt.lsi.entities.Enterprise;

@RepositoryRestResource
public interface EnterpriseRepository extends MongoRepository<Enterprise, String> {
	List<Enterprise> findByFunction(@Param("function") String function);
}
