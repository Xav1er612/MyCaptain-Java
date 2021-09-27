class Employee{
  public static void main(String[] args){
    Emp e1 = new Emp("Robert", 1994, 500000, "64C- WallsStreet");
    Emp e2 = new Emp("Sam", 2000, 740000, "68d- WallsStreet");
    Emp e3 = new Emp("John", 1999, 600000, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t"+e1.getSalary()+"\t"+e1.getAddress());  
    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t"+e2.getSalary()+"\t"+e2.getAddress());  
    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t"+e3.getSalary()+"\t"+e3.getAddress());
  }
}

class Emp{
  private String name, address;
  private int year, salary;
  public Emp(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

