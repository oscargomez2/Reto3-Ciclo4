
package mintic.usa.ciclo4.web.repositorios.crud;

import java.util.List;
import mintic.usa.ciclo4.web.modelos.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Nea
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer>{
    @Query("{'salesMan.zone':?0}")
    public List<Order> findByZone(String zona);
}
