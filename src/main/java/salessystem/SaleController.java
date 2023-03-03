package salessystem;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import productsystem.ProductService;
import productsystem.product;

@RestController
public class SaleController {
	
	@Autowired 
	private SaleService saleService ;
	
	@RequestMapping ("/getAllsales")
	public List<sale> getAllsales ()
	{
		return saleService.getAllSales();
	}
	
	@RequestMapping (method = RequestMethod.POST, value ="/addsale")
	public void AddProduct (sale p,List<transaction> trans)
	{
		saleService.AddSale(p,trans);
	}
	
	@RequestMapping (method = RequestMethod.PUT, value ="/edittransaction")
	public void UpdateTransaction (transaction t)
	{
		saleService.UpdateSaleTransaction(0, t);
	}


}
