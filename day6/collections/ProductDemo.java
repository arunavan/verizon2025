package day6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Product{
	Integer id;
	String name;
	Double price;
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

class PriceComparator implements Comparator{
public	int compare(Object o1,Object o2) {
		Product p1=(Product)o1;// typecasting
		Product p2=(Product)o2;
		if(p2.price>p1.price)
			return -1;
		else if(p1.price>p2.price)
			return 1;
		else
			return 0;
	}
}


public class ProductDemo {

	public static void main(String[] args) {
		
		ArrayList<Product> productList=new ArrayList<>();
		productList.add(new Product(10,"bag",999.99));
		productList.add(new Product(9,"book",2999.99));
		productList.add(new Product(20,"table",1999.99));
		productList.add(new Product(30,"box",9999.99));
		productList.add(new Product(05,"pen",3999.99));
		System.out.println(productList);

		productList.forEach(p->System.out.println(p));
		// task1 delete product for given id
		int id=30;
		Iterator i=productList.iterator();
		while(i.hasNext()) {
			Product o=(Product)i.next();
			if(o.id==id)
				i.remove();
		}
		/*
		 * for( Product p:productList) { if(p.id==id) productList.remove(id) }
		 */
		productList.forEach(p->System.out.println(p));
		int id1=20;
		Iterator i1=productList.iterator();
		//task2 display price of give product id 20
		System.out.println(" price of product of id:20");
		while(i1.hasNext()) {
			Product o=(Product)i1.next();
			if(o.id==id1)
				System.out.println(o.getPrice());
		}
		
		
		
		//sort products based on price
		
	//	Collections.sort(productList,new PriceComparator());
	//	productList.forEach(p->System.out.println(p));
	//	Comparator<Product> comp=(p1,p2)->p1.getPrice().intValue()-p2.getPrice().intValue();
	//	productList.stream().sorted(comp).forEach(p->System.out.println(p));
		
	}

}
