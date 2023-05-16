import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
		
		ArrayList<Animal> animals = new ArrayList<>();

		animals.add(new Turtle());
		animals.add(new Cow());
		animals.add(new Turtle());
		animals.add(new Sheep());
		animals.add(new Turtle());
		animals.add(new Octopus());
    animals.add(new Platypus());
    animals.add(new Human());
    animals.add(new Crow());
    animals.add(new Aardvark());
    animals.add(new Horse());
    animals.add(new Ostrich());
    animals.add(new Monkey());


		for(int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}
	
		
		
  }
}