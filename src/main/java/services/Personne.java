package services;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Personne {
    private int id;
    private String nom;
    private int age;

    //Constructeur avec trois arguments
    public Personne(int id , String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }
    //Constructeur avec deux arguments
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    //Constructeur sans arguments
    public Personne() {
        System.out.println("Nouvel objet 'Personne'  vide...");

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "["+id + "::" + nom + "::" + age+"]";
    }
}
