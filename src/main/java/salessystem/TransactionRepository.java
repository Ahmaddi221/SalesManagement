package salessystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TransactionRepository extends JpaRepository<transaction, Integer> {
	
	@Query("UPDATE transactions SET quantity = :qty WHERE sale_id = sid and trans_id = tid")
	Integer updateQtyById(int qty, int sid, int tid);
	
	@Query("UPDATE transactions SET price = :p WHERE sale_id = sid and trans_id = tid")
	Integer updatePriceById(double p, int sid, int tid);

}
