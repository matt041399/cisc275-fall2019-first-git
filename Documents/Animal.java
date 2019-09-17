public class Animal implements Comparable<Animal>
{
    String name;
    int legs;
    public Animal(String n, int l){
        name = n;
        legs = l;
    }
    public String getName(){
        return name;
    }
    public int getLegs(){
        return legs;
    }
     @Override
    public int compareTo(Animal dog1){
        if(this.getLegs() == dog1.getLegs()){
            return this.getName().compareTo(dog1.getName());
        }else{
            return this.getLegs() - (dog1.getLegs());
        }
    }
}