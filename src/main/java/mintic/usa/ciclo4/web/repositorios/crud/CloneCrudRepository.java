
package mintic.usa.ciclo4.web.repositorios.crud;

import mintic.usa.ciclo4.web.modelos.Clone;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nea
 */
public interface CloneCrudRepository extends MongoRepository<Clone, Integer> {
    
}
