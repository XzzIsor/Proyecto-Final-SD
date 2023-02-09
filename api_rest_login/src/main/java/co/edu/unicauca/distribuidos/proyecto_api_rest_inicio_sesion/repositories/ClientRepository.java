package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.ClientEntity;

@Repository
public class ClientRepository {
    
    private ArrayList<ClientEntity> clientList;
	
	public ClientRepository()
	{
		this.clientList= new ArrayList<ClientEntity>();
		loadPrincipalClient();
	}

	
    private void loadPrincipalClient()
	{
        ClientEntity clientPrincipal= new ClientEntity("Maria Fernanda","Gomez Acosta","nosewe@gmail.com","3053297420","user1234567","password123");
        
		this.clientList.add(clientPrincipal);
	
	}
	
    public List<ClientEntity> getAll()
   {
	   System.out.println("Se ha invocando al método de listar clientes");
	   return this.clientList;	
   }


   public ClientEntity authClient(String user,String password)
   {
	   System.out.println("Se ha invocando al login");
       ClientEntity client=null;
		
		for (ClientEntity objClient : clientList) {
			if(objClient.getLogin().equals(user) && objClient.getPassword().equals(password))
			{
				client=objClient;
				break;
			}
		}
		
		return client;
	}

    public ClientEntity register(ClientEntity newClient)	
	{
		 System.out.println("Se ha invocando al registrar");
		 ClientEntity client=null;
		 if (this.clientList.add(newClient))
		 {
            client=newClient;
		 }
		 
		 return client;
	}


}
