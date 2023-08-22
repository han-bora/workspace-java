package kr.co.himedia.builder02;

import kr.co.himedia.builder02.NyPizza.Builder;
import kr.co.himedia.builder02.NyPizza.Size;
import kr.co.himedia.builder02.Pizza.Topping;
public class PizzaTest {
	
	public static void main(String[] args) {
		
		Pizza nyPizza = ((Builder) new NyPizza.Builder(Size.MEDIUM)
				.addTopping(Topping.HAM)
				.addTopping(Topping.ONION))
				.build();
	}

}
