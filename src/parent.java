class parent {
    parent(){
        System.out.println("constructer of parent");
    }
    void display  (){
        System.out.println("method of parent");
    }
}
class  inheritance extends parent{
    inheritance(){
        System.out.println("constructor of child");

    }
    void display(){
        System.out.println("method of a child");
        super.display();
    }

    public static void main(String[] args) {
     inheritance i=new inheritance();
     i.display();;

    }
}
