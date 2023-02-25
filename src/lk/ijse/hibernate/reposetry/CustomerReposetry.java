package lk.ijse.hibernate.reposetry;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.SessionFactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerReposetry {

    private Session session ;

    public CustomerReposetry(){
        session = SessionFactoryConfigaration.getInstance().getSession();
    }

    public Long saveCustomer(Customer customer){
        Transaction transaction = session.beginTransaction();
       /* Integer id = (Integer) session.save(customer);
        transaction.commit();*/

        try {
            Long id = (Long) session.save(customer);
            transaction.commit();
            return id;

        }catch (Exception e){
            transaction.rollback();
            System.out.println(e);
            e.printStackTrace();
            return -1L;
        }

    }

    public boolean updateCustomer(Customer customer){

        Transaction transaction = session.beginTransaction();



        try {
            session.update(customer);
            transaction.commit();
            return true;

        }catch (Exception e){

            transaction.rollback();
            System.out.println(e);
            e.printStackTrace();
            return false;

        }
    }

    public Customer getCustomer(Long id){

        try {

           return session.get(Customer.class,id);

        }catch (Exception e){

            e.printStackTrace();
            throw e;
        }


    }

    public boolean deleteCustomer(Customer customer){

        Transaction transaction = session.beginTransaction();

        try {
            session.delete(customer);
            transaction.commit();
            return true;

        }catch (Exception e){

            transaction.rollback();
            System.out.println(e);
            e.printStackTrace();
            return false;

        }


    }
}
