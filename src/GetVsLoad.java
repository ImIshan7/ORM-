import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;

public class GetVsLoad {

    public static void main(String[] args) {
        System.out.println("--------------get()---------------");
        Session session = SessionFactoryConfigaration.getInstance().getSession();
        Customer customer = session.get(Customer.class, 1L);

        System.out.println(customer);

        System.out.println();
        System.out.println();


        Session session1 = SessionFactoryConfigaration.getInstance().getSession();
        Customer load = session1.load(Customer.class, 1L);

        System.out.println(load);

    }

}
