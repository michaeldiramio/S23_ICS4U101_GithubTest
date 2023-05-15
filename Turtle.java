public class Turtle extends Animal {

	private boolean isHidden = false;
	
	public void makeNoise() {
		if(this.isHidden) {
			System.out.println("...");	
		} else {
			System.out.println("Thump thump");
		}
	}

	public void hide() {
		this.isHidden = true;
	}

	public void show() {
		this.isHidden = false;
	}
	
}