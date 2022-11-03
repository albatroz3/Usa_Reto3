package Project.Ciclo3.Reto3.crud;

import Project.Ciclo3.Reto3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
