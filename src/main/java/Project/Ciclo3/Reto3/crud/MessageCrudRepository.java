package Project.Ciclo3.Reto3.crud;

import Project.Ciclo3.Reto3.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
