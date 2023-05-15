import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Turtle());
		animals.add(new Cow());
		animals.add(new Turtle());
		animals.add(new Sheep());
		animals.add(new Turtle());

		

		for(int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}
	
		
		
  }
}