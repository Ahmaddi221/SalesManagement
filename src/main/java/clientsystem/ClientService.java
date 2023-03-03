package clientsystem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository; 
	
	public List<client> getAllclients()
	{
		List<client> clients = new ArrayList<>();
		clientRepository.findAll().forEach(clients::add);
		return clients;
		
	}
	
	public void AddClient (client c)
	{
		clientRepository.save(c);
	}
	
	public void UpdateClient (client c)
	{
		clientRepository.save(c);
	}

}
