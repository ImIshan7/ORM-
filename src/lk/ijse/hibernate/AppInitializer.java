package lk.ijse.hibernate;

import lk.ijse.hibernate.embeded.CusName;
import lk.ijse.hibernate.embeded.MobileNumber;
import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.reposetry.CustomerReposetry;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AppInitializer {

    public static void main(String[] args) {

/* Save Customer
        CustomerReposetry customerReposetry = new CustomerReposetry();
        Customer customer = getCustomerEntity();
        customerReposetry.saveCustomer(customer);
*/


        // Update customer

       /* CustomerReposetry customerReposetry = new CustomerReposetry();
        Customer customer = customerReposetry.getCustomer(1L);
        System.out.println("customer_id: "+customer.getId());

        customer.setAddress("Mathara");
        boolean isupdated = customerReposetry.updateCustomer(customer);

        if (isupdated){

            System.out.println("Customer "+ customer.getId() + "Updated Succsessfully");

        }else {
            System.out.println("Customer "+ customer.getId() + "Updated Not Succsessfully");

        }*/


        // Delete Customer

        CustomerReposetry customerReposetry = new CustomerReposetry();
        Customer customer = getCustomerEntity();
        customerReposetry.deleteCustomer(customer);








       /* Customer customer = new Customer();

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
        session.close();*/

    }


    // save customer
    private static Customer getCustomerEntity(){

        Customer customer = new Customer();

        customer.setId(1L);

        CusName cusName = new CusName();
        cusName.setFirst_name("Ishan");
        cusName.setMiddle_name("Dhananjana");
        cusName.setLast_name("Dissanayaka");


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

        return customer;
    }




}
