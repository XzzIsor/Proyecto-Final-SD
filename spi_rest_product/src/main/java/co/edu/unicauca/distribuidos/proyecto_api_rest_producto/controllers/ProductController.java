package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.controllers;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ProductDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.services.IProductoService;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.exception.RequestException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private IProductoService productService;

	
	@PostMapping("/admin/products")
	public ProductDTO createProduct(@RequestBody ProductDTO newProduct) {
		ProductDTO product = null;
		product = productService.register(newProduct);
		return product;
	}


	@GetMapping("/admin/products")
	public List<ProductDTO> listOffer() {
		return productService.listAllOfferProducts();
	}


	@PutMapping("/admin/products/{cod}/{status}")
	public ProductDTO updateOffer(@PathVariable Integer cod,@PathVariable String status) {
		ProductDTO product = null;
		ProductDTO actualProduct = productService.findProductByID(cod);
		if (actualProduct != null) {
			actualProduct.setState(status);
			product = productService.update(cod, actualProduct);
		}
		return product;
	}

	
	@GetMapping("/client/products")
	public List<ProductDTO> listProducts() {
		return productService.getProducts();
	}

	
	@GetMapping("/client/products/{name}")
	public ProductDTO showProductByName(@PathVariable String name) {
		ProductDTO product = null;
		product = productService.findProductByName(name);
		return product;
	}

	
	@GetMapping("/client/auction")
	public ProductDTO showAuction() {
		ProductDTO product = null;
		product = productService.getAuctionProduct();
		return product;
	}


	@PutMapping("/client/offer/{value}")
	public ProductDTO offer(@PathVariable int value) {
		ProductDTO actualProduct = null;
		ProductDTO product = null;
		actualProduct = productService.getAuctionProduct();
		if (actualProduct != null) {
			int codigo=actualProduct.getCod();
			actualProduct.setValue(value);
			product = productService.update(codigo, actualProduct);
		}
		return product;
	}

	
	@GetMapping("/admin/products/{cod}")
	public ProductDTO showProductByID(@PathVariable Integer cod) {
		ProductDTO product = null;
		product = productService.findProductByID(cod);
		if(product!= null) {
			return product;

		}else{
			throw new RequestException("No existe el producto. :P");
		}
		
	}

	@PostMapping("/products")
	public ProductDTO create(@RequestBody ProductDTO product) {
		ProductDTO objProducto = null;
		objProducto = productService.register(product);
		return objProducto;
	}

	
	@DeleteMapping("/products")
	public Boolean delete(@RequestParam Integer cod) {
		Boolean flag = false;
		ProductDTO actualProduct = productService.findProductByID(cod);
		if (actualProduct != null) {
			flag = productService.delete(cod);
		}
		return flag;

	}

}