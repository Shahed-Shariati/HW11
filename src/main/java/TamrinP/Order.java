package TamrinP;

import java.sql.Date;
import java.util.ArrayList;

public class Order {
    private Integer id;
    private Product product;
    private Double sum;
    private java.sql.Date

              date;

    public Order(Integer id, Product product, Double sum, java.sql.Date
                 date) {
        this.id = id;
        this.product = product;
        this.sum = sum;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }


}
