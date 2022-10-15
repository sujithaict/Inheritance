class animal {
    void eat(){
        System.out.println("chaw..chaw...chaw");
    }
}
class  Dog extends animal{
    void bark(){
        System.out.println("baw..baww...baw");

    }
}
class  Babydog extends Dog{
    void weep(){
        System.out.println("weeping....");
    }
}

class testinheritance{
    public static void main(String[] args) {
        Babydog Bb=new Babydog();
        Bb.weep();
        Bb.bark();
        Bb.eat();
        //ANTHIMA SUB CLASS EKTA SUPER CLASS EKE HA ANIK SIYALU SUB CLASS VALA DEVAL ACCESS KALA HAKA
    }
}