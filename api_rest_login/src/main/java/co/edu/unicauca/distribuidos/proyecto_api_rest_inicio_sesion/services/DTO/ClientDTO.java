package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ClientDTO {
    
    @NotNull(message = "{user.name.empty}")
    @Size(min = 5, max =50)
    private String name;	
    
    @NotNull(message = "{user.lastname.empty}")
    @Size(min = 5, max =50,  message = "{user.lastname.length}")
	private String lastname;	
	
    @NotNull(message = "{user.email.empty}")
    @Email(message = "{user.email.mask}")
    private String email;
    
    @Pattern(message = "{user.telephone.pattern}",regexp="[5][0-9]{8}")
	private String cellphone;	
	
    @NotNull(message = "{user.login.empty}")
    @Size(min = 10, max =20, message = "El login debe contener entre 10 y 20 caracteres")
	private String login;
    
    @NotNull(message = "{user.password.empty}")
    @Size(min = 10, max =20, message = "La contraseña debe contener entre 10 y 20 caracteres")
	private String password; 

    public ClientDTO(){

    }

}
