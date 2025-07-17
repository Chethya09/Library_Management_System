public class Student extends Person{
    private String course ;
    public Student(int id,String name , String add, String course){
        super(id,name,add);
        this.course = course ;
    }

    @Override
    public void displayDetails (){
        System.out.println("Student ID : "+getId()+"\n Student Name : "+getName()+"\n Student Address : "+getAddress()+"\n Course : "+course);
    }


}
