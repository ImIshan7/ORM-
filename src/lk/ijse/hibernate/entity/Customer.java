package lk.ijse.hibernate.entity;

import lk.ijse.hibernate.embeded.CusName;
import lk.ijse.hibernate.embeded.MobileNumber;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Column(name = "customer_name")
    private CusName name;
    @Column(name = "customer_address")
    private String address;
    @Column(name = "customer_contact")
    private String contact;

    @Column(name = "customer_age",columnDefinition = "SMALLINT")
    private int age;

    @ElementCollection
    @CollectionTable(name = "customer_mobile_no",joinColumns = @JoinColumn(name = "customer_id"))

    private List<MobileNumber> numbers = new ArrayList<>();


    public Customer() {
    }

    public Customer(long id, CusName name, String address, String contact,int age,List<MobileNumber>numbers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.age = age;
        this.numbers = numbers;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CusName getName() {
        return name;
    }

    public void setName(CusName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public List<MobileNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<MobileNumber> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", age=" + age +
                ", numbers=" + numbers +
                '}';
    }
}
