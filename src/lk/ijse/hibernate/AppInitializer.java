package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.CusName;
import lk.ijse.hibernate.embeded.MobileNumber;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {

    public static void main(String[] args) {


        Customer customer = new Customer();

        customer.setId(1L);

        CusName cusName = new CusName();
        cusName.setFirst_name("Ishan");
        cusName.setMiddle_name("Dhananjaya");
        cusName.setLast_name("Ishan");


        customer.setName(cusName);

     customer.setAddress("Wanduramba");
     customer.setContact("0771867407");
     customer.setAge(22);


        List<MobileNumber> numbers = new ArrayList<>();
        numbers.add(new MobileNumber("MOBILE","077147828"));
        numbers.add(new MobileNumber("HOME","0917853270"));
        customer.setNumbers(numbers);

        Session session = SessionFactoryConfigaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(customer);
        transaction.commit();
        session.close();

       /* new SessionFactoryConfigaration();
        new SessionFactoryConfigaration();*/

    }
}
