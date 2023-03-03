package productsystem;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class product {

	@Id
	@Column(name ="product_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="product_name")
	private String name;
	
	private String description;
	private String category;
	private Date creation_date;
	
	public void product()
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
	
	// Name //
	
	public String getName ()
	{
		return this.name;
	}
	public void setName (String n)
	{
		this.name = n;
	}
	
	// Description //
	
	public String getDescription ()
	{
		return this.description;
	}
	public void setDesciption (String d)
	{
		this.description = d;
	}
	
	// Category // 
	
	public String getCategory ()
	{
		return this.category;
	}
	public void setCategory (String d)
	{
		this.category = d;
	}
	
	// Creation date // 
	
	public Date getCreationdate ()
	{
		return this.creation_date;
	}
	

	
}
