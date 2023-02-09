package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.services;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.AdminDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.ClientDTO;
import java.util.List;

public interface ISessionService {
    
    public List<ClientDTO> listClient();
    public List<AdminDTO> listAdmins();			
	public ClientDTO registerClient(ClientDTO client);
    public AdminDTO registerAdmin(AdminDTO admin);	
    public ClientDTO sessionClient(String login,String password);	
    public AdminDTO sessionAdmin(String login,String password);

}
