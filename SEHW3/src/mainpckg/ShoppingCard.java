package mainpckg;

public class ShoppingCard {

	public int pcount;
	public int tot;
    public Book b;
    public Book[] BO;
    public ShoppingCard() {
    	BO= new Book[100];
    	pcount = 0;
    }
	public void addpdck(Book p1) {
		// TODO Auto-generated method stub
		BO[pcount] = new Book();
		BO[pcount].amount=p1.amount;
		BO[pcount].name=p1.name;
		BO[pcount].price=p1.price;
		tot+= p1.price;
		pcount++;
	}

}
