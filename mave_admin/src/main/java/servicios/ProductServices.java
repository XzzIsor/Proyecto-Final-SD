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
import models.Product;
import org.glassfish.jersey.jackson.JacksonFeature;

/*
 * @author mafemartinez
 * @author angiecgomez
 * @author juanruiz 
 */

 
public class ProductServices {

    private String urlA;
    private String urlC;
    private Client cliente;

    public ProductServices() {
        this.urlA = "http://localhost:5020/api/admin/products";
        this.urlC = "http://localhost:5020/api/clients";
        this.cliente = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public ArrayList<Product> listProduct() {
        ArrayList<Product> productList = null;

        WebTarget target = this.cliente.target(this.urlA);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON);

        productList = response.get(new GenericType<ArrayList<Product>>() {
        });

        return productList;
    }
    
    public ArrayList<Product> listAllProducts() {
        ArrayList<Product> productList = null;

        WebTarget target = this.cliente.target(this.urlC +"/products");

        Invocation.Builder objPeticion = target.request(MediaType.APPLICATION_JSON);

        productList = objPeticion.get(new GenericType<ArrayList<Product>>() {
        });

        return productList;
    }


    public Product registerProduct(Product newProduct) {
        Product product = null;

        WebTarget target = this.cliente.target(this.urlA);

        Entity<Product> data = Entity.entity(newProduct, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = response.post(data, Product.class);

        return product;
    }

    
    public Product findProductByID(Integer cod) {
        Product product = null;

        WebTarget target = this.cliente.target(this.urlA + "/" + cod);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = response.get(Product.class);

        return product;
    }
    
    public Product getAuctionProduct(){
         Product product = null;

        WebTarget target = this.cliente.target(this.urlC +"/auction");
        
        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = response.get(Product.class);

        return product;
    }

    public Product updateAuctionProduct(Integer codigo,String estado,Product objProductoActualizar) {
        Product product = null;

        WebTarget target = this.cliente.target(this.urlA + "/" + codigo+ "/" + estado);

        Entity<Product> data = Entity.entity(objProductoActualizar, MediaType.APPLICATION_JSON_TYPE);

        Invocation.Builder response = target.request(MediaType.APPLICATION_JSON_TYPE);

        product = response.put(data, Product.class);

        return product;
    }
    

}
