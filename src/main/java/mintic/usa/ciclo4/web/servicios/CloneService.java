
package mintic.usa.ciclo4.web.servicios;

import java.util.List;
import java.util.Optional;
import mintic.usa.ciclo4.web.modelos.Clone;
import mintic.usa.ciclo4.web.repositorios.CloneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nea
 */
@Service
public class CloneService {
    
    @Autowired
    private CloneRepository repository;
    
    public List<Clone> getAll(){
        return repository.getAll();
    }
    
    public Optional<Clone> getClone(int id){
        return repository.getClone(id);
    }
    
    public Clone save(Clone clone){
        if(clone.getId()==null || clone.getBrand()==null || clone.getProcesor()==null || clone.getOs()==null
                || clone.getDescription()==null || clone.getMemory()==null || clone.getHardDrive()==null                 
                || clone.getQuantity()==0 || clone.getPrice()==0 || clone.getPhotography()==null ){
            return clone;        
        }
        else {
            Optional<Clone> buscarP= repository.getClone(clone.getId());
            if(buscarP.isPresent()){
                return clone;
            }
            else{
                return repository.save(clone);
            }
        }
    }
    
    public Clone update(Clone clone){
        if(clone.getId()!=null){
            Optional<Clone> buscarClone= repository.getClone(clone.getId());
            if(buscarClone.isPresent()){
                if(clone.getBrand()!=null){
                    buscarClone.get().setBrand(clone.getBrand());
                }
                if(clone.getProcesor()!=null){
                    buscarClone.get().setProcesor(clone.getProcesor());
                }
                if(clone.getOs()!=null){
                    buscarClone.get().setOs(clone.getOs());
                }
                if(clone.getDescription()!=null){
                    buscarClone.get().setDescription(clone.getDescription());
                }
                if(clone.getMemory()!=null){
                    buscarClone.get().setMemory(clone.getMemory());
                }
                if(clone.getHardDrive()!=null){
                    buscarClone.get().setHardDrive(clone.getHardDrive());
                }
                if(clone.getPrice()!=0){
                    buscarClone.get().setPrice(clone.getPrice());
                }
                if(clone.getQuantity()!=0){
                    buscarClone.get().setQuantity(clone.getQuantity());
                }
                /*buscarClone.get().setPrice(clone.getPrice());
                buscarClone.get().setQuantity(clone.getQuantity());*/
                if(clone.getPhotography()!=null){
                    buscarClone.get().setPhotography(clone.getPhotography());
                }
                return repository.save(buscarClone.get());
            } else {
                return clone;
            }
        }
        return clone;
    }
    
    
    public boolean delete(int id){
        Boolean aBoolean = repository.getClone(id).map(clone -> {
            repository.delete(id);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
