package ma.fstt.lsi.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.fstt.lsi.entities.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends MongoRepository<Employee, String>{
	List<Employee> findByUsername(@Param("username") String username);
}
