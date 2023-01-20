package Day7;

public class Task7_1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = new Airplane();
        airplane1.setLength(3500);
        airplane2.setLength(3500);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
