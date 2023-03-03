package salessystem; 

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="sales")
public class sale {
	
	@Id
	@Column(name ="sale_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="client_name")
	private String client;
	
	@Column(name ="seller_name")
	private String seller;
	
	private double total;
	private Date creation_date;
	
	@OneToMany (targetEntity = transaction.class, cascade = CascadeType.ALL )
	@JoinColumn (name="sale_id", referencedColumnName = "id")
	private List<transaction> transactionsList;
	
	public void sale()
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
	
	// Client Name //
	
	public String getClientname ()
	{
		return this.client;
	}
	public void setClientname (String n)
	{
		this.client = n;
	}
	
	// Seller Name //
	
	public String getSellername ()
	{
		return this.seller;
	}
	public void setDesciption (String s)
	{
		this.seller = s;
	}
	
	// Total // 
	
	public double getSaletotal ()
	{
		return this.total;
	}
	public void setSaletotal (double t)
	{
		this.total = t;
	}
	
	// Creation date // 
	
	public Date getCreationdate ()
	{
		return this.creation_date;
	}

}
