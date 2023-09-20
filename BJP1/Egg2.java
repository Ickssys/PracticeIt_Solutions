public class Egg2{
    public static void main(String[] args){
        egg();
        middle();
        egg();
        middle();
        bottom();
        wholeEgg();
    }
    
    public static void egg(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    
    public static void middle(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    
    public static void wholeEgg(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("-\"-'-\"-'-\"-");
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}