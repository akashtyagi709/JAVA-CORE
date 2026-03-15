public class Array{
    public static void main(String[] args){



//        int nums[][]=new int[3][4];
//        int random =(int) (Math.random()*100);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                nums[i][j]=  (int) (Math.random()*10);
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(nums[i][j] +" ");
//            }
//            System.out.println();
//        }
//        for(int n[]:nums){
//            for (int m:n){
//                System.out.print(m+" ");
//            }
//            System.out.println();
//        }

//        Student s1= new Student();
//        s1.name="Akash";
//        s1.mark=30;
//        Student s2= new Student();
//        s2.name="Van";
//        s2.mark=66;
//
//        Student student[]= new Student[2];
//        student[0]=s1;
//        student[1]=s2;
//
//        for(Student stud:student){
//            System.out.println(stud.name);
//        }

//        Mobile mob= new Mobile();
//        mob.price=1223;
//        mob.brand="Real Me";
//        mob.show();
//        mob.name="HII";

    }
}

class Mobile{
    int price;
    String brand;
    static String name;

    public  void show (){
        System.out.println(price +" "+ brand + " "+name);
    }


}
class Student{
    int mark;
    String name;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}