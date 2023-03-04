import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransientState {

    public static void main(String[] args) {

      Session session = SessionFactoryConfigaration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setAddress ("Transient");
        customer.setAge(22);

        session.save(customer);

        customer.setContact("041565656");

        transaction.commit();
        session.close();

    }
}
