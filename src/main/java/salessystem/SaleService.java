package salessystem;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productsystem.product;
import productsystem.productRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository; 
	@Autowired
	private TransactionRepository transactionRepository; 
	
	@Autowired
	private logRepository logRepository;
	
	 public List<sale> getAllSales()
	 {
		 List<sale> sales = new ArrayList<>();
		 saleRepository.findAll().forEach(sales::add);
		 return sales;
	 
	 }
		public void AddSale (sale s, List<transaction> trans)
		{
	     transaction t = new transaction();
	     
		 saleRepository.save(s);
		 
		 for (int i = 0; i < trans.size(); i++) 
		 {
			 t = trans.get(i);
			 transactionRepository.save(t); 
		 }
		}
		
		public void UpdateSaleTransaction (int saleid,transaction t)
		{
		log g = new log();
		g.setSaleID(saleid);
		g.setTransID(t.GetId());
		logRepository.save(g);
		
		transactionRepository.updatePriceById(t.getTransactionPrice(), saleid, t.GetId());
		transactionRepository.updateQtyById(t.getTransactionQTY(), saleid, t.GetId());
		}
}
