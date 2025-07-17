public abstract class Person {
    private int id ;
    private String name ;
    private String address ;

    public Person(int id ,String name, String address){
        this.id = id ;
        this.name = name ;
        this.address = address ;

    }

    // getters

    public int getId(){ return id ; }
    public String getName(){return name ; }
    public String getAddress(){return address ; }


    public abstract void displayDetails() ;

}
