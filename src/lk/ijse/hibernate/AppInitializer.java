package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String[] args) {


        Customer customer = new Customer();

        customer.setId(01);
     customer.setName("Ishan");
     customer.setAddress("Wanduramba");
     customer.setContact("0771867407");

        Session session = SessionFactoryConfigaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);
        transaction.commit();
        session.close();

    }
}
