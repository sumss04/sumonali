package com.usa.ttech.student.automation;


class Rectangle implements Drawable
{
   private double x1, y1, x2, y2;
   Rectangle(double x1, double y1, double x2, double y2)
   {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }
   @Override
   public void draw(int color)
   {
      System.out.println("Rectangle drawn with upper-left corner at (" + x1 + 
                         ", " + y1 + ") and lower-right corner at (" + x2 +
                         ", " + y2 + "), and color " + color);
   }
   double getX1()
   {
      return x1;
   }
   double getX2()
   {
      return x2;
   }
   double getY1()
   {
      return y1;
   }
   double getY2()
   {
      return y2;
   }
}

