package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String[] args) {


        Customer customer = new Customer();

        customer.setId(2L);
     customer.setName("Eshan");
     customer.setAddress("Galle");
     customer.setContact("0771860987");

        Session session = SessionFactoryConfigaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);
        transaction.commit();
        session.close();

       /* new SessionFactoryConfigaration();
        new SessionFactoryConfigaration();*/

    }
}
