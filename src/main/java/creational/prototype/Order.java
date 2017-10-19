package creational.prototype;

import java.util.Date;

/**
 * Created by CoT on 10/16/17.
 */
public class Order implements Cloneable {
    private String id;
    private Date date;
    private String customer;

    public Order(String id, Date date, String customer) {
        this.id = id;
        this.date = date;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public Order clone() throws CloneNotSupportedException {
        return (Order)super.clone();
    }
}
