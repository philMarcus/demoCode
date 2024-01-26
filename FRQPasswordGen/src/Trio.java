
public class Trio {

	private Salad salad;
	private Sandwich sandwich;
	private Drink drink;
	
	public Trio(Sandwich sw, Salad sd, Drink d) {
		sandwich= sw;
		salad = sd;
		drink = d;
	}
	
	public String getName() {
		return (sandwich.getName() + "/"+salad.getName()+"/"+drink.getName()+" Trio");
	}
	
	public double getPrice() {
		double min = sandwich.getPrice();
		if (salad.getPrice() < min) {
			min = salad.getPRice();
		}
		if (drink.getPrice() < min) {
			min = drink.getPrice();
		}
		
		return sandwich.getPrice()+salad.getPrice()+drink.getPrice()-min;
	}
	
}
