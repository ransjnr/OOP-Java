public class Animal {
   private String name;

    public Animal(){

    }

    public void Eat(){
        System.out.println("All animals Eat");
    }
    public void Sleep(){
      System.out.println("All animals Sleep");
    }


    //setters and getters
    public String getName(){
        //this.name = name;
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
