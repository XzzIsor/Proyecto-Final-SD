package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.services;

import java.util.List;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ProductDTO;

public interface IProductoService {
    public List<ProductDTO> getProducts();		
	public List<ProductDTO> listAllOfferProducts();
	public ProductDTO getAuctionProduct();
	public ProductDTO findProductByID(Integer codigo);
	public ProductDTO findProductByName(String nombre);
	public ProductDTO register(ProductDTO producto);	
	public ProductDTO update(Integer codigo, ProductDTO producto);
	public boolean delete(Integer codigo);	
}
