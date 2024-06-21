class Box{

	float width,height,depth; //instance variable
	
    //method
    void set(float w,float h,float d) /*local variable */ {
		this.width = w;  /* Accessing instance variable using 'this' keyword */
		this.height = h;
		this.depth = d;
	}

    void display() {
    	System.out.println("Width = " + this.width);
    	System.out.println("Height = " + this.height);
    	System.out.println("Depth = " + this.depth);
    }	

    float volume() {
    		return this.width*this.height*this.depth;
    }
}
  public class BoxSample
  {
  	public static void main(String[] args)
  	{
        //Objects of Box class
  		Box b1 = new Box();
  		Box b2 = new Box();

        //calling methods using objects
  		b1.set(1,2,3);
  		b2.set(10,20,30);

  		float vol=b1.volume();
  		
        b1.display();
        System.out.println("Volume fo b1 = " + vol);

        b2.display();
  		System.out.println("Volume fo b2 = " + b2.volume());
    }  
}