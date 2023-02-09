package co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.models.ProductEntity;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.repositories.ProductRepository;
import co.edu.unicauca.distribuidos.proyecto_api_rest_producto.services.DTO.ProductDTO;

@Service
public class ProductoServiceImp implements IProductoService{
    
    @Autowired
	private ProductRepository servicioAccesoBaseDatos;

    @Autowired
    private ModelMapper modelMapper;

     
    @Override
    public List<ProductDTO> getProducts() {
        List<ProductEntity> productsEntity= this.servicioAccesoBaseDatos.getProducts();
		List<ProductDTO> productsDTO=this.modelMapper.map(productsEntity, new TypeToken<List<ProductDTO>>() {}.getType());
		return productsDTO;    
    }

	@Override
    public ProductDTO getAuctionProduct() {
        ProductEntity productsEntity= this.servicioAccesoBaseDatos.getAuctionProduct();
		ProductDTO productsDTO=this.modelMapper.map(productsEntity, ProductDTO.class);
		return productsDTO;    
    }

    @Override
    public List<ProductDTO> listAllOfferProducts() {
        List<ProductEntity> productsEntity= this.servicioAccesoBaseDatos.listAllOfferProducts();
		List<ProductDTO> productsDTO=this.modelMapper.map(productsEntity, new TypeToken<List<ProductDTO>>() {}.getType());
		return productsDTO;    
    }

    @Override
	public ProductDTO findProductByID(Integer cod) {		
		ProductEntity productsEntity= this.servicioAccesoBaseDatos.findProductByID(cod);
		ProductDTO productsDTO=this.modelMapper.map(productsEntity, ProductDTO.class);
		return productsDTO;
	}

	@Override
	public ProductDTO findProductByName(String name) {		
		ProductEntity productsEntity= this.servicioAccesoBaseDatos.findProductByName(name);
		ProductDTO productsDTO=this.modelMapper.map(productsEntity, ProductDTO.class);
		return productsDTO;
	}

	@Override
	public ProductDTO register(ProductDTO product) {
		ProductEntity productsEntity=this.modelMapper.map(product, ProductEntity.class);
		ProductEntity objProductEntity= this.servicioAccesoBaseDatos.register(productsEntity);
		ProductDTO productsDTO=this.modelMapper.map(objProductEntity, ProductDTO.class);
		return productsDTO;		
	}

	@Override
	public ProductDTO update(Integer id, ProductDTO product) {	
		ProductEntity productsEntity=this.modelMapper.map(product, ProductEntity.class);	
		ProductEntity ProductoEntityAux= this.servicioAccesoBaseDatos.update(id, productsEntity);
		ProductDTO productsDTO=this.modelMapper.map(ProductoEntityAux, ProductDTO.class);
		return productsDTO;	
	}

	@Override
	public boolean delete(Integer cod) {
		return this.servicioAccesoBaseDatos.delete(cod);		
	}
    
}
