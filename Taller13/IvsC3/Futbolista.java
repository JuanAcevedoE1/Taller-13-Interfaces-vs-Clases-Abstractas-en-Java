package Taller13.IvsC3;

public abstract class Futbolista implements Jugador {
    // Intentar definir un método predeterminado
    default void descansar() {
        System.out.println("El futbolista está descansando.");
    }
}
