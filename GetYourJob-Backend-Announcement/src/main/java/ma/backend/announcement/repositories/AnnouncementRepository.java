package ma.backend.announcement.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.backend.announcement.entities.Announcement;

@RepositoryRestResource(collectionResourceRel = "Announcement", path = "announcements")
public interface AnnouncementRepository extends MongoRepository<Announcement, String> {
	List<Announcement> findByTitle(@Param("title") String title);
}
