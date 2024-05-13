//Crea una classe Person con i campi firstName, lastName, age e address, i getter e i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Persona e stamparli un video

public class Main {
    public static void main(String[] args) {
        PersonBuilder person1 = new PersonBuilder("Giuseppe","Favara");
        person1.age(15);
        person1.address("VIA pera N.54");
        System.out.println(person1);

    }
}