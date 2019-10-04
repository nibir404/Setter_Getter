
package methodedemo;

public class MethodeDemo {

    public static void main(String[] args) {
       Private p = new Private();
       p.setname("Nibirman");
       p.setBlood_group("Ab -");
       p.setId(180073);
       p.setAge(21);
       
        System.out.println("Name : "+p.getname());
        System.out.println("Blood Group : "+p.getBlood_group());
        System.out.println("Age : "+p.getAge());
        System.out.println("Id : "+p.getId());
    }
    
}
