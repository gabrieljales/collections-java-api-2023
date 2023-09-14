package main.java.sandbox.set.basicOperations.exercise001;

public class Main {
    public static void main(String[] args) {
        GuestSet guestSet = new GuestSet();

        guestSet.addGuest("Gabriel", 10);
        guestSet.addGuest("João", 2);

//         OBS: Caso a classe Guest não possuíse os métodos equals e hashCode implementados, serão herdados da classe
//         Object. Ou seja, apesar dos objetos abaixo possuírem atributos idênticos, seriam adicionados pois não
//         estariam na mesma instância de memória!
        guestSet.addGuest("Maria", 4);
        guestSet.addGuest("Maria", 4);

        System.out.println("Número de convidados: " + guestSet.countGuests());
        guestSet.showGuests();

        guestSet.removeGuest(4);
        guestSet.showGuests();
    }
}
