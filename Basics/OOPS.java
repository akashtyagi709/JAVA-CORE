class OOPS{
   public static void main(String[] args) {
        System.out.println("OOPS LEARNING");
       Calculator calc= new Calculator();
        int r=  calc.add(1,222);
       System.out.println(r);
       Computer com= new Computer();
       com.playMusic();
    }
}

class Computer{
    public  void playMusic(){
        System.out.println("Music Playing...");
    }
    public String  getMeAPen(int money){
        return "PEN";
    }
}

class Calculator{
    int a;
    public  int add(int n1, int n2){
        return n1+n2;
    }
}