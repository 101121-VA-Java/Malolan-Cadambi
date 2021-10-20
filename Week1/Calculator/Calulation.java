package Calculator;

public class Calulation {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c;

        Calculator calc = new Calculator();
    
        c = calc.add(a,b);
    
        System.out.println("Add Value : "+ c);
        
        c = calc.subtract(a,b);
    
        System.out.println("Subtract Value : "+ c);

        double d1 = 10.5;
        double d2 = 5;
        double d = calc.multiply(d1, d2);

        System.out.println("Multiply Vaule : "+ d);

        c = calc.remainder(a, b);

        System.out.println("Remainder Value : "+c);
        
    }
    
}
