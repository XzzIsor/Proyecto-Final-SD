package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.models.ProductEntity;

@Repository
public class ProductRepository {
	private ArrayList<ProductEntity> productList;
	private ArrayList<ProductEntity> offerProductList;
	private ArrayList<ProductEntity> noSoldProductList;

	public ProductRepository() {
		this.productList = new ArrayList<ProductEntity>();
		loadProducts();
	}

	public List<ProductEntity> getProducts() {
		System.out.println("Se ha invocando al método listar Productos");
		noSoldProductList = new ArrayList<ProductEntity>();
		for (ProductEntity objProduct : productList) {
			if (!objProduct.getStatus().equals("Vendido")) {
				noSoldProductList.add(objProduct);
			}
		}
		return this.noSoldProductList;
	}

	public List<ProductEntity> listAllOfferProducts() {
		System.out.println("Se ha invocando al método listar Productos en oferta");
		offerProductList = new ArrayList<ProductEntity>();
		for (ProductEntity objProduct : productList) {
			if (objProduct.getStatus().equals("En oferta")) {
				offerProductList.add(objProduct);
			}
		}
		return this.offerProductList;
	}

	public ProductEntity getAuctionProduct() {
		System.out.println("Se ha invocando al método de Producto en subasta");
		ProductEntity product = null;
		for (ProductEntity objProduct : productList) {
			if (objProduct.getStatus().equals("En subasta")) {
				product = objProduct;
				break;
			} else {
				product = null;
			}
		}
		return product;
	}


	public ProductEntity findProductByID(Integer cod) {
		System.out.println("Se ha invocando al invocando al método consultar producto");
		ProductEntity product = null;
		for (ProductEntity objProduct : productList) {
			if (objProduct.getCod() == cod) {
				product = objProduct;
				break;
			}
		}
		return product;
	}

	public ProductEntity findProductByName(String name) {
		System.out.println("Se ha invocando al invocando a consultar un Producto");
		ProductEntity objProducto = null;

		for (ProductEntity producto : productList) {
			if (producto.getName().equals(name)) {
				objProducto = producto;
				break;
			}
		}

		return objProducto;
	}

	public ProductEntity register(ProductEntity newProduct) {
		System.out.println("Se ha invocando al método registrar Producto");
		ProductEntity product = null;
		if (this.productList.add(newProduct)) {
			product = newProduct;
		}
		return product;
	}

	public ProductEntity update(Integer cod, ProductEntity newProduct) {
		System.out.println("Se ha invocando a actualizar un Producto");
		ProductEntity product = null;

		for (int i = 0; i < this.productList.size(); i++) {
			if (this.productList.get(i).getCod() == cod) {
				this.productList.set(i, newProduct);
				product = newProduct;
				break;
			}
		}

		return product;
	}

	public boolean delete(Integer codigo) {
		System.out.println("Invocando a eliminar un Producto");
		boolean bandera = false;

		for (int i = 0; i < this.productList.size(); i++) {
			if (this.productList.get(i).getCod() == codigo) {
				this.productList.remove(i);
				bandera = true;
				break;
			}
		}

		return bandera;
	}

	private void loadProducts() {
		ProductEntity objProducto1 = new ProductEntity(1, "Patas", "En oferta", 80000);
		this.productList.add(objProducto1);
		ProductEntity objProducto2 = new ProductEntity(2, "Camisa", "Vendido", 15000);
		this.productList.add(objProducto2);
		ProductEntity objProducto3 = new ProductEntity(3, "Mesa", "En subasta", 100000);
		this.productList.add(objProducto3);
		ProductEntity objProducto = new ProductEntity(4, "Plug", "En oferta", 20000);
		this.productList.add(objProducto);
	}
}
