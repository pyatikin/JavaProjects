public class Pet {
    public String name;

    public void voice() {
        System.out.print(name + "says ");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Pet(){

    }
    Pet(String name){
        setName(name);
    }
}
