package clientsystem;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="clients")

public class client {
	@Id
	@Column(name ="client_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="first_name")
	private String fname;
	

	@Column(name ="last_name")
	private String lname;
	
	private String mobile;
	
	public void client()
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
	
	// First Name //
	
	public String getFname ()
	{
		return this.fname;
	}
	public void setFname (String n)
	{
		this.fname = n;
	}
	
	// Last Name //
	
	public String getLname ()
	{
		return this.lname;
	}
	public void setLname (String l)
	{
		this.lname = l;
	}
	
	// Mobile // 
	
	public String getCategory ()
	{
		return this.mobile;
	}
	public void setCategory (String m)
	{
		this.mobile = m;
	}
	

}
