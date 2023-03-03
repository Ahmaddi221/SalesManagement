package salessystem;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import productsystem.product;

@Entity
@Table (name = "transactions")
public class transaction {
	
	@Id
	@Column(name ="transaction_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	
	private int product_id;
	private int sale_id;
	private int QTY;
	private double price;
	private Date creation_date;
	
	@OneToOne
	@JoinColumn (name="product_id", referencedColumnName = "id")
	private product p;
	
	public void transaction()
	{	
	}
	
	// Set & Get methods //
	
	// id //
	
	public int GetId ()
	{
		return this.id;
	}
	public void SetId (int i)
	{
		this.id = i;
	}
	
	// Sale ID //
	
	public int getSaleID ()
	{
		return this.sale_id;
	}
	
	// Product ID //
	
	public int getProductID ()
	{
		return this.product_id;
	}

	
	// QTY // 
	
	public int getTransactionQTY ()
	{
		return this.QTY;
	}
	public void setTransactionQTY (int q)
	{
		this.QTY = q;
	}
	
	// Price // 
	
	public double getTransactionPrice ()
	{
		return this.price;
	}
	public void setTransactionPrice (double p)
	{
		this.price = p;
	}
	
	// Creation date // 
	
	public Date getCreationdate ()
	{
		return this.creation_date;
	}


}
