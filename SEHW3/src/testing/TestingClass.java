package testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import mainpckg.Book;

import mainpckg.ShoppingCard;

public class TestingClass {
	ShoppingCard sc;

	@Before public void initiate() {
	     sc = new ShoppingCard();
	}
	@Test public void createSC() {
		
		assertTrue(sc.pcount==0);
	}
	
	@Test public void addbook() {
	  Book p1 = new Book();
	  p1.amount = 1;
	  p1.name = "JavaBook";
	  p1.price = 127;
	  sc.addpdck(p1);
	  assertTrue(sc.pcount==1 && sc.tot == 127);
	}
	
	@Test public void addbook2() {
		  Book p1 = new Book();
		  p1.amount = 1;
		  p1.name = "JavaBook";
		  p1.price = 127;
		  sc.addpdck(p1);
		  Book p2 = new Book();
		  p2.amount = 1;
		  p2.name = "Web design Book";
		  p2.price = 100;
		  sc.addpdck(p2);
		  assertTrue(sc.pcount==2 && sc.tot == 227);
		}
}
