package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ClientEntity {
    
    @NotNull
    @Size(min = 5,max = 50)
    private String name;	
    
    @NotNull
    @Size(min = 5,max = 50)
	private String lastname;

    @NotNull
    @Email
	private String email;	

    @Pattern(regexp = "[5][0-9]{8}")
	private String cellphone;
    
    @NotNull
    @Size(min = 10,max = 20)
	private String login;

    @NotNull
    @Size(min = 10,max = 20)
    private String password; 

    public ClientEntity(){

    }

}
