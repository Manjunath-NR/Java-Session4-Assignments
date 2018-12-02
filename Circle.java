class Circle extends Figure
 {
 double r=5;
 void findArea()
   {
  dim1 = Math.PI * r * r;
  System.out.println("area of Circle -->"+dim1);
   }

 void findPerimeter()
  {
  dim1 = Math.PI * 2 * r;       
 	// P = 2*pi*r
     System.out.println("perimeter of Circle -->"+dim1);  
   }

 }