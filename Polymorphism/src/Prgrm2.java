public class Prgrm2 {
  public static void main(String[] args) {
	  Prgrm2 c=new Circle();
	  Prgrm2 t=new Triangle();
	  Prgrm2 s=new Square();
    c.draw();
    c.erase();
    t.draw();
    t.erase();
    s.draw();
    s.erase();
    
  }
void draw()
{
  System.out.println("Drawing Shape");
}
void erase()
{
  System.out.println("Erasing Shape");
}

}

class Circle extends Prgrm2{
  void draw()
  {
    System.out.println("Drawing circle");
  }
  void erase()
  {
    System.out.println("Erasing Cirle");
  }
}

class Triangle extends Prgrm2{
  void draw()
  {
    System.out.println("Drawing Triangle");
  }
  void erase()
  {
    System.out.println("Erasing Triangle");
  }
}

class Square extends Prgrm2{
  void draw()
  {
    System.out.println("Drawing Square");
  }
  void erase()
  {
    System.out.println("Erasing Square");
  }
}