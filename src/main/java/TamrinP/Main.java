package TamrinP;

import java.sql.Date;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Category electronic = new Category(1,"Electronic");
        Category book  = new Category(2,"Book");
        Category car = new Category(3,"Car");
        Product p1 = new Product(1,"p1",1,electronic);
        Product p2 = new Product(2,"p2",2,book);
        Product p3 = new Product(3,"p3",3,book);
        Product p4 = new Product(4,"p4",4,car);
        Product p5 = new Product(5,"p5",5,car);
        Product p6 = new Product(6,"p6",6,electronic);

        //TamrinP 1
        List<Product> products = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6));

        products.stream().filter(product -> product.getCategory().equals(book))
                         .forEach(System.out::println);

        //TamrinP 2
           Order o1 = new Order(1,p5,100d, Date.valueOf("2021-5-1"));
           Order o2 = new Order(1,p2,100d, Date.valueOf("2021-5-12"));
           Order o3 = new Order(1,p4,100d, Date.valueOf("2021-5-10"));
           Order o4 = new Order(1,p3,100d, Date.valueOf("2021-5-25"));
           Order o5 = new Order(1,p1,2500d, Date.valueOf("2021-6-12"));
           Order o6 = new Order(1,p5,300d, Date.valueOf("2021-6-12"));
           List<Order> orders = new ArrayList<>(Arrays.asList(o1,o2,o3,o4,o5,o6));
           orders.stream().filter(order -> order.getDate().after(Date.valueOf("2021-4-25")) && order.getDate().before(Date.valueOf("2021-5-11")))
                   .map(Order::getProduct)
                   .forEach(product -> System.out.println(product.getName()));

           //TamrinP 3
       Optional<Product> product1 = products.stream().
                filter(product -> product.getCategory().equals(book))
                .min(Comparator.comparing(Product::getPrice));

        System.out.println(product1);

        //TamrinP 4
    OptionalDouble sum =  orders.stream()
                .filter(order -> order.getDate().equals(Date.valueOf("2021-6-12")) )
                .mapToDouble(Order::getSum)
                .average();
        System.out.println(sum + "ddd");

    }
}
