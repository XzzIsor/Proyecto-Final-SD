/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;
import models.ClientModel;
import models.Product;


public class ClientServices {

    private String url;
    private Client cliente;

    public ClientServices() {
        this.url = "http://localhost:5000/api/clients";
        this.cliente = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public ClientModel loginClient(String login, String password) {
        ClientModel client = null;

        WebTarget target = this.cliente.target(this.url + "/" + login + "/" + password);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        client = response.get(ClientModel.class);

        return client;
    }

    public ArrayList<ClientModel> listClients() {
        ArrayList<ClientModel> clientsList = null;

        WebTarget target = this.cliente.target(this.url);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON);

        clientsList = response.get(new GenericType<ArrayList<ClientModel>>() {
        });

        return clientsList;
    }

    public ClientModel registerClient(ClientModel newClient) {
        ClientModel client = null;

        WebTarget target = this.cliente.target(this.url);

        Entity<ClientModel> data = Entity.entity(newClient, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        client = response.post(data, ClientModel.class);

        return client;
    }

    public Product findProduct(String nombre) {
        Product product = null;

        WebTarget target = this.cliente.target("http://localhost:5020/api/clients/products/" + nombre);
        
        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = response.get(Product.class);

        return product;
    }
    
    public Product getAuctionProduct(){
         Product product = null;

        WebTarget target = this.cliente.target("http://localhost:5020/api/clients/auction");
        
        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = response.get(Product.class);

        return product;
    }
    
    public ArrayList<Product> listAllProducts() {
        ArrayList<Product> productList = null;

        WebTarget target = this.cliente.target("http://localhost:5020/api/clients/products");

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON);

        productList = response.get(new GenericType<ArrayList<Product>>() {
        });

        return productList;
    }

    public Product sendOffer(int offerValue, Product productAux){
        
        Product product = null;

        WebTarget target = this.cliente.target("http://localhost:5020/api/clients/offer" + "/" + offerValue);

        Entity<Product> data = Entity.entity(product, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder reponse = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = reponse.put(data, Product.class);

        return product;
    }
}
