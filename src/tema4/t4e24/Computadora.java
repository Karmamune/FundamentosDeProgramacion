package tema4.t4e24;

/**
 *
 * @author Manuel
 */
public class Computadora {
    int ram, vram, almacenamiento;

    public Computadora(int r, int vr, int almacenamiento){
        ram = r;
        vram = vr;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString(){
        String valor;
        valor = ram + "\t\t" + vram + "\t\t" + almacenamiento;
        return valor;
    }
}
