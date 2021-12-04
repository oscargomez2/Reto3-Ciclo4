package mintic.usa.ciclo4.web;

import mintic.usa.ciclo4.web.repositorios.crud.CloneCrudRepository;
import mintic.usa.ciclo4.web.repositorios.crud.OrderCrudRepository;
import mintic.usa.ciclo4.web.repositorios.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto3Application implements CommandLineRunner{
    
        @Autowired
        private CloneCrudRepository cloneRepository;
        
        @Autowired
        private UserCrudRepository userRepository;
        
        @Autowired
        private OrderCrudRepository orderRepository;
        
	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}
        
        

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        cloneRepository.deleteAll();
        orderRepository.deleteAll();
    }

}

/*



*/
