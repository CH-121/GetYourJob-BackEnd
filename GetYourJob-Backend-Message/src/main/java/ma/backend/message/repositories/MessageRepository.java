package ma.backend.message.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.backend.message.entities.AppUser;
import ma.backend.message.entities.Message;

@RepositoryRestResource(collectionResourceRel = "Message", path = "messages")
public interface MessageRepository extends MongoRepository<Message, String> {
	List<Message> findAllByFrom(AppUser user);
	List<Message> findAllByTo(AppUser user);
}
