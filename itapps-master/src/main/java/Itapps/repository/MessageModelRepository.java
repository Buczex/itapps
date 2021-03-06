package Itapps.repository;

import Itapps.models.MessageModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
public interface MessageModelRepository extends CrudRepository<MessageModel, Long> {

}
