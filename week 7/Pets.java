public class Pets {
    String name;
    String species;
    String color;
    int age;
    String hair;
    int size;
    int run;
    String can;

    public Pets(){

    }
public Pets(String name,String species,String color,int age){
    this.name = name;
    this.species = species;
    this.color = color;
    this.age = age;
    this.hair = hair;
    }

public void ShowPetData(){
    System.out.println("Name : "+name+" Species : "+species+" Color : "+color+" Age : "+age);
    }
}
