class Rectangle extends Figure
 {
 double w=70,h=20; 
 double P=2*(w+h);
 
void findArea()
 {
  dim1 = w*h;
  System.out.println("area of Rectangle -->"+dim1);
  
 
 }

void findPerimeter()
{
  dim1 = 2 * (w +h);   
  System.out.println("Perimeter of Rectangle -->" +dim1); 
 }
 
}
