package MS1_Day4;

public class Try_Catch {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{ 
            int c=a/b;
        }
        catch(ArithmeticException e){
        e.printStackTrace();
        System.out.println(e.toString());
        System.out.println(e.getMessage());
        }
        finally{
            System.out.println("namaskar !! apka exception me swagat hai");;
        }
    }
}
