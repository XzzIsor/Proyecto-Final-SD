package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AdminEntity {
    
    @NotNull
    @Size(min = 5,max = 50)
    private String name;	
    
    @NotNull
    @Size(min = 5,max = 50)
	private String lastname;
    	
    @NotNull
    @Size(min = 10,max = 20)
	private String login;

    @NotNull
    @Size(min = 10,max = 20)
    private String password; 

    public AdminEntity(){
        
    }
}
