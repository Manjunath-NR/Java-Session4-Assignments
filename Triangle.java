class Triangle extends Figure
 { 
 double b=50,h=15;double hypotenuse;

 void findArea()
  {
  dim1 = (b*h)/2;
  System.out.println("area of Triangle -->"+dim1);
  }

 void findPerimeter()
 {

hypotenuse = Math.pow(Math.pow(b, 2) 
				+ Math.pow(h, 2),0.5);
dim1 = b + h + hypotenuse;

System.out.println("Perimeter of triangle = " 
				+ dim1);
 }

}