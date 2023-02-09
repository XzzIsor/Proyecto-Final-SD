package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.services;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.AdminEntity;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.ClientEntity;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories.AdminRepository;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories.ClientRepository;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.AdminDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.ClientDTO;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SessionServiceImpl implements ISessionService{

    @Autowired
	private ClientRepository cRepositoryAccess;

    @Autowired
	private AdminRepository aRepositoryAccess;
    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ClientDTO> listClient() {
        List<ClientEntity> clientEntity= this.cRepositoryAccess.getAll();
		List<ClientDTO> clientDTO=this.modelMapper.map(clientEntity, new TypeToken<List<ClientDTO>>() {}.getType());
		return clientDTO; 
    }


    @Override
    public ClientDTO registerClient(ClientDTO cliente) {
        ClientEntity clientEntity=this.modelMapper.map(cliente, ClientEntity.class);
		ClientEntity objClienteEntity= this.cRepositoryAccess.register(clientEntity);
		ClientDTO clientDTO=this.modelMapper.map(objClienteEntity, ClientDTO.class);
		return clientDTO;	
    }

    @Override
    public ClientDTO sessionClient(String login, String contrasenia) {
        ClientEntity objClienteEntity= this.cRepositoryAccess.authClient(login,contrasenia);
		ClientDTO clientDTO=this.modelMapper.map(objClienteEntity, ClientDTO.class);
		return clientDTO;
    }

    @Override
    public List<AdminDTO> listAdmins() {
        List<AdminEntity> adminEntity= this.aRepositoryAccess.findAll();
		List<AdminDTO> adminDTO=this.modelMapper.map(adminEntity, new TypeToken<List<AdminDTO>>() {}.getType());
		return adminDTO;
    }

    @Override
    public AdminDTO registerAdmin(AdminDTO administrador) {
        AdminEntity adminEntity=this.modelMapper.map(administrador, AdminEntity.class);
		AdminEntity objAdministradorEntity= this.aRepositoryAccess.register(adminEntity);
		AdminDTO adminDTO=this.modelMapper.map(objAdministradorEntity, AdminDTO.class);
		return adminDTO;	
    }

    @Override
    public AdminDTO sessionAdmin(String login, String contrasenia) {
        AdminEntity objAdministradorEntity= this.aRepositoryAccess.authAdmin(login,contrasenia);
		AdminDTO adminDTO=this.modelMapper.map(objAdministradorEntity, AdminDTO.class);
		return adminDTO;
    }
 
}
