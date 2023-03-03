package clientsystem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {
	
	@Autowired 
	private ClientService clientService ;
	
	@RequestMapping ("/getAllClients")
	public List<client> getAllClients ()
	{
		return clientService.getAllclients();
	}
	
	@RequestMapping (method = RequestMethod.POST, value ="/addClient")
	public void AddProduct (client c)
	{
	 clientService.AddClient(c);
	}
	
	@RequestMapping (method = RequestMethod.PUT, value ="/updateClient")
	public void UpdateProduct (client c)
	{
	 clientService.UpdateClient(c);
	}

}
