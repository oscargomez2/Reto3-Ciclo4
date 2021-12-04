/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.usa.ciclo4.web.repositorios;

import java.util.List;
import java.util.Optional;
import mintic.usa.ciclo4.web.modelos.Order;
import mintic.usa.ciclo4.web.repositorios.crud.OrderCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nea
 */
@Repository
public class OrderRepository {
    @Autowired
    private OrderCrudRepository crud;
    
    public List<Order> getAll(){
        return (List<Order>) crud.findAll();
    }
    
    public List<Order> getByZone(String zona){
        return crud.findByZone(zona);
    }
    
    public Optional<Order> getOrder(int idOrder){
        return crud.findById(idOrder);
    }
    
    public Order save(Order order){
        return crud.save(order);
    }
    
    public void delete (Integer id){
        crud.deleteById(id);
    }
}
