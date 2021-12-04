
package mintic.usa.ciclo4.web.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.usa.ciclo4.web.modelos.Clone;
import mintic.usa.ciclo4.web.repositorios.crud.CloneCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nea
 */
@Repository
public class CloneRepository {
    
    @Autowired
    private CloneCrudRepository crud;
    
    public List<Clone> getAll(){
        return (List<Clone>) crud.findAll();
    }
    
    public Optional<Clone> getClone(int id){
        return crud.findById(id);
    }
    
    public Clone save(Clone clone){
        return crud.save(clone);
    }
    
    public void delete(int id){
        crud.deleteById(id);
    }
}
