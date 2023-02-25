package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryConfigaration {

    private static SessionFactoryConfigaration sessionFactoryConfigaration;

    public static SessionFactoryConfigaration getInstance(){
        return sessionFactoryConfigaration == null ? sessionFactoryConfigaration = new SessionFactoryConfigaration()
                : sessionFactoryConfigaration;
    }

    public Session getSession() throws HibernateException {

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();

        Metadata metadata = new MetadataSources(serviceRegistry).addAnnotatedClass(Customer.class).getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();


        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        return session;
    }
}
