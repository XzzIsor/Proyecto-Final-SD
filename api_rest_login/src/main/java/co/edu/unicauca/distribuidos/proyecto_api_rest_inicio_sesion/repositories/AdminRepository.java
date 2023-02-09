package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.models.AdminEntity;

@Repository
public class AdminRepository {
    
    private ArrayList<AdminEntity> adminList;
	
	public AdminRepository()
	{
		this.adminList= new ArrayList<AdminEntity>();
		loadPrincipalAdmin();
	}

    public List<AdminEntity> findAll()
   {
	   System.out.println("Se ha invocado al método de listar Administradores");
	   return this.adminList;	
   }

   private void loadPrincipalAdmin()
   {
	   AdminEntity adminPrincipal= new AdminEntity("Admin", "Admin", "admin", "admin");
	   this.adminList.add(adminPrincipal);
   
   }

   public AdminEntity authAdmin(String login,String contrasenia)
   {
	   System.out.println("Se ha invocado al método de de Login");
       AdminEntity admin=null;
		
		for (AdminEntity objAdmin : adminList) {
			if(objAdmin.getLogin().equals(login) && objAdmin.getPassword().equals(contrasenia))
			{
				admin=objAdmin;
				break;
			}
		}
		
		return admin;
	}

    public AdminEntity register(AdminEntity newAdmin)	
	{
		 System.out.println("Se ha invocando al método de registro");
		 AdminEntity admin=null;

		 if (this.adminList.add(newAdmin))
		 {
            admin=newAdmin;
		 }
		 
		 return admin;
	}

   

}
