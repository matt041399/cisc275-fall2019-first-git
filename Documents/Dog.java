
public class Dog extends Animal
{
    public Dog(String n, int l){
        super(n, l);
    }
    public String toString(){
        String le = String.valueOf(legs);
        return (name + " has " + le + " legs");
    }
}
