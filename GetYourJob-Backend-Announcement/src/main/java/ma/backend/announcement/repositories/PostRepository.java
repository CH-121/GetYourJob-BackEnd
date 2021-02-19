package ma.backend.announcement.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.backend.announcement.entities.Post;

@RepositoryRestResource(collectionResourceRel = "Post", path = "posts")
public interface PostRepository extends MongoRepository<Post, String> {

}
