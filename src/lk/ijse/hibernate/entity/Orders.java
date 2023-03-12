package lk.ijse.hibernate.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @Column
    private
    long id;

    @Column
    private
    Timestamp orderDate;

    @ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY )
    private Customer customer;

    public Orders() {
    }

    public Orders(long id, Timestamp orderDate, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
}

