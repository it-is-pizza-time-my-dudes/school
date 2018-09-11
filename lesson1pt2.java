public class lesson1pt2
{
    public static void main(String[]args){
        lesson1 f = new lesson1(0,0);//creates a new object of to named type with 
        //defult values
        lesson1 g = new lesson1(0,0);//creates a new pointer to a new object 
        //num=5 would not work 
        f.num =2;//sets varible num in f to 2 
        f.den =5;//sets varible dem in f to 5
        //g is still 0 and 0 
        g.num=-1;
        g.den=3;
        
        f.mutiply(8);//mutliplys num by 8 for 16 den is 5
        System.out.println(g.asDecimal());
        
        System.out.println(f.greaterThan(g));//true
        System.out.println(g.greaterThan(f));//false
        // added constructor the top 2 no longer work bc of that 
        lesson1 h = new lesson1(7,22); 
    }
}