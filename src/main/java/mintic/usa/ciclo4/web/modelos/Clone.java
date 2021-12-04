
package mintic.usa.ciclo4.web.modelos;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Nea
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "clone")
public class Clone {
    
    @Id
    private Integer id;
    private String brand;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
    
}
