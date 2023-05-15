public class Ostrich extends Animal {

	private boolean isMale = true;
	
	public void makeNoise() {
		if(this.isMale) {
			System.out.println("BOOM");	
		} else {
			System.out.println("hiss hiss");
		}
	}

	public void male() {
		this.isMale = true;
	}

	public void female() {
		this.isMale = false;
	}
	
}