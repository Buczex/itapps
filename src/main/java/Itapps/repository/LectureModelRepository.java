package Itapps.repository;

import Itapps.models.LectureModel;
import Itapps.models.MessageModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "lectures", path = "lectures")
public interface LectureModelRepository extends CrudRepository<LectureModel, Long> {

}
