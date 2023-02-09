package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ProductEntity {

    private Integer cod;		
	private String name;	
	private String status;	
	private int price;

    public ProductEntity()
    {

    }
}
