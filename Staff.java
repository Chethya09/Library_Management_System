public class Staff extends Person{
    private String department ;

    public Staff(int id , String name , String add, String dept){
        super(id, name , add) ;
        department = dept ;

    }

    @Override
    public void displayDetails(){
        System.out.println("Student ID : "+getId()+"\n Student Name : "+getName()+"\n Student Address : "+getAddress()+"\n Department : "+department);
    }
}
