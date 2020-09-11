public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public void comer() { System.out.println("Ñom Ñom comida casera"); }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "";
    }

    public Persona(String ocupacionP, String nombreP, int edadP){
        this.nombre = nombreP;
        this.ocupacion = ocupacionP;
        this.edad = edadP;
    }
}
