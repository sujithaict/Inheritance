class employee {
    int salary=50000;
}
class Manager extends employee{
    int bonus=25000;
//int salary =50000;
    public static void main(String[] args) {
        Manager m=new Manager();
        System.out.println("manager salary is "+m.salary );
        System.out.println("manager bonus is "+m.bonus);
        int gross_salary =m.salary+m.bonus;
        System.out.println("manager's gross salary is "+gross_salary);
    }
}
