
package mintic.usa.ciclo4.web.repositorios.crud;

import java.util.List;
import java.util.Optional;
import mintic.usa.ciclo4.web.modelos.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Oscar
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    public Optional<User> findByEmail(String email);
    public Optional<User> findByEmailAndPassword(String email, String password);
    public List<User> findByNameOrEmail(String name, String email);
}
