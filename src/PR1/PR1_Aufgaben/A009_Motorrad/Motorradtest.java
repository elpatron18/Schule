package PR1.PR1_Aufgaben.A009_Motorrad;

public class Motorradtest {

        public static void main(String[] args) {
            Motorrad motorrad = new Motorrad(new Motor(100, 1.5), new Reifen(17, 3, "Sommer"), new Reifen(17, 3, "Sommer"));
            motorrad.getInfo();
        }
}
