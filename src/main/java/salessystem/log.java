package salessystem;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="log_table")
public class log {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	
	private int sale_id;
	private int trans_id;
	private Date update_date;
	
	
	public void log()
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
	public void setSaleID (int sid)
	{
		this.sale_id= sid ;
	}
	
	// Transaction ID //
	
	public int getTransID ()
	{
		return this.trans_id;
	}
	public void setTransID (int tid)
	{
		this.trans_id= tid ;
	}


	// Update date // 
	
	public Date getUpdatedate ()
	{
		return this.update_date;
	}
	

}
