import lk.ijse.hibernate.embeded.CusName;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeatchedState {

    public static void main(String[] args) {


        Session session = SessionFactoryConfigaration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();

        customer.setId(3L);
        customer.setAddress("Mabotuwana");
        customer.setContact("0786397125");

        session.save(customer);

        CusName name = new CusName();
        name.setFirst_name("Ishan");
        name.setMiddle_name("Dhananjana");
        name.setLast_name("Dissanayaka");
        customer.setName(name);

        System.out.println(customer);

        session.close();

        Session session1 = SessionFactoryConfigaration.getInstance().getSession();

        Transaction transaction1 = session1.beginTransaction();

        session1.merge(customer); // persistance state

        transaction1.commit();

        session1.close();

    }
}
