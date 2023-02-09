package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class AdminDTO {

    @NotNull(message = "{user.name.empty}")
    @Size(min = 5, max =50, message = "Los nombres deben contener entre 5 y 50 caracteres")
    private String name;	
    
    @NotNull(message = "{user.lastname.empty}")
    @Size(min = 5, max =50, message = "Los nombres deben contener entre 5 y 50 caracteres")
	private String lastname;	
    
    @NotNull(message = "{user.login.empty}")
    @Size(min = 10, max =20, message = "El login debe contener entre 10 y 20 caracteres")
	private String login;

    @NotNull(message = "{user.password.empty}")
    @Size(min = 10, max =20, message = "La contrasena debe contener entre 10 y 20 caracteres")
	private String password; 
    
    public AdminDTO(){
        
    }
}
