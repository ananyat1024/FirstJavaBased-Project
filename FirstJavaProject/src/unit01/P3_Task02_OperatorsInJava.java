package unit01;

public class P3_Task02_OperatorsInJava {
	/*
	 * Operators in Java is a symbol that is used to perform operations between two operands .
	 * 
	 * sum = a + b;
	 * 
	 * for example: +, -, *, / etc.
	 * 
	 *  -> a+=1;  // a = a + 1;
	 *  
	 *  Types of operators in Java
	 *  - Unary Operator:           {prefix and postfix} {a++, a--, ++a, --a, ~a, !a}
	 *  - Arithmetic Operator:      {*  /  %  +  -}
	 *  - Shift Operator:           {<<  >>}
	 *  - Relational Operator:      {< > <= >= == !=}
	 *  
	 *  - Bitwise Operator:         {&  ^  |}  {bitwise AND, excusive OR, inclusive OR}
	 *  - Logical Operator:         {&& ||}
	 *  
	 *  - Ternary Operator:         {? :}
	 *  - Assignment Operator       {= += -= /= %= &= ^=  <<= >>= >>>=2 }
	 */

	public static void main(String[] args) {
        OperatorsInJava obj=new  OperatorsInJava();
        obj.unaryOperator();
        System.out.println();
        obj.AirthmaticOperator();
        System.out.println();
        obj.shiftOperators();
        System.out.println();
        obj.relationalOperators();
        System.out.println();
        obj. BitwiseAndLogicalOperators();
        System.out.println();
        obj. TernaryOperators();
        
    }
    
}
class OperatorsInJava{
    void  unaryOperator()
    {
        int a=10;
        boolean b = false;
        System.out.println("Using Unary Operator");
        System.out.println(a++);//10
        System.out.println(a--);//11
        System.out.println(++a);//11
        System.out.println(--a);//10
        /*
		 * Bitwise Complement(~)
		 * This unary operator returns the one's complement representation of the input value
		 * with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
		 */
        System.out.println(~a);  // 1010 invert all bits=> 0101 2's complement => 1010 + 1 => 1011
		//000000000000......1010
		
		// 'NOT' Operator(!) : It is used to reverse the value of an operand
		System.out.println(!b);    // true
		System.out.println("\n");

    }
    void AirthmaticOperator()
    {
        int a=10;
        int b=5;
        System.out.println("Using Airthmatic Operator");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println("Evaluate the Expression- 10*10/5+3-1*4/2");
        System.out.println( 10*10/5+3-1*4/2);

    }
    void shiftOperators()
    {
    	/*
		 * 01010101<<1
		 * 10101010
		 * 
		 * 01010101>>1
		 * 00101010
		 * 0,0,1,0,0,0 {8>>1} >>
		 * 0,0,0,1,0,0 {4>>1}
		 * 0,0,0,0,1,0 {2>>1}
		 * 0,0,0,0,0,1 {1}
		 * 32,16,8,4,2,1
		 * 
		 * 0,0,1,0,0,0 {8<<1} >>
		 * 0,1,0,0,0,0 {16<<1}
		 * 1,0,0,0,0,0 {32}
		 */

        System.out.println("Using Shift Operator");
        System.out.println(10<< 2); // 10*2^2 = 10*4 = 40

        System.out.println(20>>3); // 20/2^3 = 20/8 = 2


    }
    void relationalOperators()
    {
        System.out.println("Using Realtional Operator");
        int a=10;
        int b=20;
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a!=b);

    }
  //Bitwise: Second condition is also checked but not in 
    //logical && and even in ||

    void BitwiseAndLogicalOperators()
    {
        System.out.println("Using Logical Operator");
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<c);//false && true = false
        System.out.println(a>b||a<c);//true == true
        System.out.println("Using Bitwise Operator");//always check both condition
        System.out.println(a<b & a++<c);//false
        System.out.println(a>b|a<c);//true | true = true


    }
    void TernaryOperators()
    {
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);
    }
}