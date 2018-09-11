public class lesson1
{
   int num;
   int den;//instance variables (exist outside meathods)(aka fields) 
   //a class is a blueprint for how a thing should look and behave 
   //it doesn't create any fractions 
   //when we do create Fractions earch instance called an object will have 
   // a numerator and denomator
   public lesson1(int n, int d)
   {
       num = n;
       num = d;
   }
   // a constructor is a special varible that is called with new 
   // allows initalization of instance varibles 
   // we can chek validity of peramaters 
   // can also do calculations 
   // force people to provide parameters
   // if you don't have on java will put one that takes no peramaters
   // and does nothing 
   public void mutiply(int x){
       num=num*x;
   }
   public double asDecimal(){
       return (num*1.0)/den;// num/den would not work bc both would be ints 
   }
   public void reduce(){
       
   }
   public boolean greaterThan(lesson1 other){
       boolean b; 
       int total = num*den;
       int otherTotal = other.num*other.den;
       if (total > otherTotal){
           b = true; 
       }
       else if (otherTotal>total){
           b=false; 
       }
       else{b=false;}
       return b;
   }
}