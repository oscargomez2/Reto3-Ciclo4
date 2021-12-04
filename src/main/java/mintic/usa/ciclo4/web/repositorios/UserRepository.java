
package mintic.usa.ciclo4.web.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.usa.ciclo4.web.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mintic.usa.ciclo4.web.repositorios.crud.UserCrudRepository;

/**
 *
 * @author Oscar
 */
@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository crud;
    
    public List<User> getAll(){
        return (List<User>) crud.findAll();
    }
    
    public Optional<User> getUser(int idUser){
        return crud.findById(idUser);
    }
    
    public User save(User user){
        return crud.save(user);
    }
    
    public Optional<User> existe(String email){
        return crud.findByEmail(email);
    }
    
    public Optional<User> existeUser(String email, String password){
        return crud.findByEmailAndPassword(email, password);
    }
    
    public List<User> getUsersByNameOrEmail(String name, String email){
        return crud.findByNameOrEmail(name, email);
    }
    
    public void delete (Integer id){
        crud.deleteById(id);
    }
}
