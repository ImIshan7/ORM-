import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateVsMerge {
    public static <Customer> void main(String[] args) {
       /* Session session = SessionFactoryConfigaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, 1L);
        customer.se("LA");

        session.merge(customer);
        transaction.commit();
        session.close();*/
    }
}
