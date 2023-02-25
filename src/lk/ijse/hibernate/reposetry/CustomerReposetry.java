package lk.ijse.hibernate.reposetry;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class CustomerReposetry {

    private Session session ;

    public CustomerReposetry(){
        session = SessionFactoryConfigaration.getInstance().getSession();
    }

    public Integer saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
       /* Integer id = (Integer) session.save(customer);
        transaction.commit();*/

        try {
            Integer id = (Integer) session.save(customer);
            transaction.commit();
            return id;

        }catch (Exception e){
            transaction.rollback();
            System.out.println(e);
            e.printStackTrace();
            return -1;
        }

    }

}
