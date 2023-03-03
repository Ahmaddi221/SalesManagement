package productsystem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
	@Autowired 
	private ProductService productService ;
	
	@RequestMapping ("/getAllProducts")
	public List<product> getAllProducts ()
	{
		return productService.getAllProducts();
	}
	
	@RequestMapping (method = RequestMethod.POST, value ="/addProduct")
	public void AddProduct (product p)
	{
	 productService.AddProduct(p);
	}
	
	@RequestMapping (method = RequestMethod.PUT, value ="/updateProduct")
	public void UpdateProduct (product p)
	{
	 productService.UpdateProduct(p);
	}
	
}
