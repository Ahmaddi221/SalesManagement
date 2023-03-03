package productsystem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private productRepository ProductRepository; 
	
	public List<product> getAllProducts()
	{
		List<product> products = new ArrayList<>();
		ProductRepository.findAll().forEach(products::add);
		return products;
		
	}
	
	public void AddProduct (product p)
	{
	 ProductRepository.save(p);
	}
	
	public void UpdateProduct (product p)
	{
	 ProductRepository.save(p);
	}

}
