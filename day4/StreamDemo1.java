package day4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
public class StreamDemo1 {

	public static void main(String[] args) {
			
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(99,"bag",799.99));
		productList.add(new Product(59,"pen",199.99));
		productList.add(new Product(29,"box",499.99));
		productList.add(new Product(19,"table",1799.99));
		
		
		
		productList.stream().filter(p->p.name.equals("bag")).forEach(p->System.out.println(p));
		
	
		List<String> names=productList.stream().map(p->p.name).collect(Collectors.toList());
		
		System.out.println(names);
		
		List<Integer> li=Arrays.asList(34,23,12,67,87);
		Stream s=Stream.of(li);
		s.forEach(System.out::println);
		Stream s1=Stream.of(li);
		s1.forEach(System.out::println);
		li.stream().forEach(System.out::println);
		li.stream().forEach(System.out::println);
	}

}









/*
int[] numbers = {1, 2, 3, 4, 5};
Arrays.stream(numbers)
      .filter(n -> n % 2 == 0) // Filter even numbers
      .forEach(System.out::println);

*/