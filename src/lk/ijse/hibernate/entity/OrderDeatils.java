package lk.ijse.hibernate.entity;

import javax.persistence.*;

    @Entity
    @Table(name = "order_details")
    public class OrderDeatils {
        /* @Id
         @Column(name = "orderDeatils_id")
         private long id;*/
        @EmbeddedId
        private OrderDeatilsPK orderDeatilsPK;
        @Column(name = "order_price")
        private double price;
        @Column(name = "order_qty")
        private int qty;


        @ManyToOne
        private Orders orders;

        @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)

        public Orders getOrders() {
            return orders;
        }

        public void setOrders(Orders orders) {
            this.orders = orders;
        }
    }
