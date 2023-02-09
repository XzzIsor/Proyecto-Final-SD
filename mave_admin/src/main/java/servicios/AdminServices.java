package servicios;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import models.Admin;

/*
 * @author mafemartinez
 * @author angiecgomez
 * @author juanruiz 
 */

public class AdminServices {

    /*
     * Attributes
     */

    private String url;
    private Client cliente;

    /*
     * Constructor
     */

    public AdminServices() {
        this.url = "http://localhost:5000/api/admin";
        this.cliente = ClientBuilder.newClient().register(new JacksonFeature());
    }

    /*
     * Methods
     */

    public Admin loginAdmin(String login, String password) {
        Admin admin = null;

        WebTarget target = this.cliente.target(this.url + "/" + login + "/" + password);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        admin = response.get(Admin.class);

        return admin;
    }

    public List<Admin> listAdmins() {
        List<Admin> adminList = null;

        WebTarget target = this.cliente.target(this.url);

        Invocation.Builder reponse = target.request(MediaType.APPLICATION_JSON);

        adminList = reponse.get(new GenericType<List<Admin>>() {
        });

        return adminList;
    }

    public Admin registerAdmin(Admin newAdmin) {
        Admin admin = null;

        WebTarget target = this.cliente.target(this.url);

        Entity<Admin> data = Entity.entity(newAdmin, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        admin = response.post(data, Admin.class);

        return admin;
    }

}
