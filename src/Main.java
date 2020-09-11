public class Main {
    public static void main(String[] args) {
        Persona beauchefiano_letal = new Estudiante("Jugador Profesional de Among Us", "Yayo Gutierrez", 33);
        Academico profesor_rajon = new Academico("Rajar estudiantes", "Ben 10", 70, "Deconstrucción empírica de despacito 3");

        beauchefiano_letal.comer();
        beauchefiano_letal.dormir();
        System.out.println(beauchefiano_letal.hacerLoSuyo());
        System.out.println("");

        System.out.println(beauchefiano_letal.nombre);
        System.out.println(beauchefiano_letal.edad);
        System.out.println(beauchefiano_letal.ocupacion);
        System.out.println("");

        profesor_rajon.comer();
        profesor_rajon.dormir();
        System.out.println(profesor_rajon.hacerLoSuyo());
        System.out.println("");
        profesor_rajon.publicarPaper();
        System.out.println("");

        System.out.println(profesor_rajon.nombre);
        System.out.println(profesor_rajon.edad);
        System.out.println(profesor_rajon.ocupacion);
    }
}
