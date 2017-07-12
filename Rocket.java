public class Rocket {

    public static void cone() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("/");
            }

            System.out.print("**");

            for (int j = 0; j < i + 1; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }

    public static void line() {
    	System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
    
    public static void body1() {
    	for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < Math.abs(i - 2); j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < i + 1; j++) {
            	System.out.print("/\\");
            }
            
            for (int j = 0; j < Math.abs(i - 2) * 2; j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < i + 1; j++) {
            	System.out.print("/\\");
            }
            
            for (int j = 0; j < Math.abs(i - 2); j++) {
            	System.out.print(".");
            }
            
            System.out.println("|");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < i; j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < Math.abs(i - 2) + 1; j++) {
            	System.out.print("\\/");
            }
            
            for (int j = 0; j < i * 2; j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < Math.abs(i - 2) + 1; j++) {
            	System.out.print("\\/");
            }
            
            for (int j = 0; j < i; j++) {
            	System.out.print(".");
            }
            
            System.out.println("|");
        }
    }
    
    public static void body2() {
    	for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < i; j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < Math.abs(i - 2) + 1; j++) {
            	System.out.print("\\/");
            }
            
            for (int j = 0; j < i * 2; j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < Math.abs(i - 2) + 1; j++) {
            	System.out.print("\\/");
            }
            
            for (int j = 0; j < i; j++) {
            	System.out.print(".");
            }
            
            System.out.println("|");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < Math.abs(i - 2); j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < i + 1; j++) {
            	System.out.print("/\\");
            }
            
            for (int j = 0; j < Math.abs(i - 2) * 2; j++) {
            	System.out.print(".");
            }
            
            for (int j = 0; j < i + 1; j++) {
            	System.out.print("/\\");
            }
            
            for (int j = 0; j < Math.abs(i - 2); j++) {
            	System.out.print(".");
            }
            
            System.out.println("|");
        }
    }
    
    public static void main(String[] args) {
        cone();
        line();
        body1();
        line();
        body2();
        line();
        cone();
    }
}
