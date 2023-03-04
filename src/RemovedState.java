import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RemovedState {

    public static void main(String[] args) {

        //Delete Customer

        Session session = SessionFactoryConfigaration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, 1L);

        session.delete(customer);

        transaction.commit();
        session.close();
    }
}
