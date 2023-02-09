package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ProductDTO {
    private Integer cod;		
	private String name;	
	private String state;	
	private int value;

    public ProductDTO()
    {

    } 
}
