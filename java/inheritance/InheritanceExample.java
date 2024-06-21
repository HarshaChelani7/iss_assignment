
class Box {

	double width, height, depth;
	
    Box(double w, double h, double d) {
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
    Box(double len) {
		this.width = this.height = this.depth = len;
	}

	double volume() {
		return this.width*this.height*this.depth;
	}
}
class BoxWeight extends Box {
	double weight;
	BoxWeight(double w, double h, double d, double we) {
		super(w, h, d);
		this.weight = we;
	}
}
public class InheritanceExample {
	public static void main(String[] args) {
        Box obj1 = new Box(10, 20, 30);
        System.out.println("Volume of obj1 = " + obj1.volume());
        BoxWeight obj2 = new BoxWeight(1, 2, 3, 4);
        System.out.println("Volume of obj2 = " + obj2.volume());
        System.out.println("Weight of obj2 = " + obj2.weight);
	}
}