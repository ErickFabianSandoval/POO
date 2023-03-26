package fes.ico.TareaCinco;

public class Cafetera {
    public static final double LTS_AGUA=5.00;
    public static final double KG_CAFE=1.00;
    public static final double LTS_CREMA=1.50;
    public static final int NUM_VASOS=50;
    private double agua;
    private double cafe;
    private double crema;
    private int vasos;

    public Cafetera() {
    }

    public Cafetera(double agua, double cafe, double crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        if(agua > 0 && agua <= 5.0) {
            this.agua = agua;
        }
        else{
            System.out.println("Ha introducido una cantidad incorrecta de agua: ");
        }
    }

    public double getCafe() {
        return cafe;
    }

    public void setCafe(double cafe) {
        if(cafe > 0 && cafe <= 1.0) {
            this.cafe = cafe;
        }
        else{
            System.out.println("Ha introducido una cantidad incorrecta de cafe: ");
        }
    }

    public double getCrema() {
        return crema;
    }

    public void setCrema(double crema) {
        if(crema > 0 && crema <= 1.5) {
            this.crema = crema;
        }
        else{
            System.out.println("Ha introducido una cantidad incorrecta de crema: ");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if(vasos > 0 && vasos <= 50) {
            this.vasos = vasos;
        }
        else{
            System.out.println("Ha introducido una cantidad incorrecta de vasos: ");
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public void americano(){
        if(getAgua()>0.18 && getCafe()>0.015 && getVasos() > 1) {
            System.out.println("\nLa maquina cuenta con los siguientes recursos");
            estadoActual();
            System.out.println("Tu bebida esta en proceso...");
            setAgua(getAgua() - 0.18);
            setCafe(getCafe() - 0.015);
            setVasos(getVasos() - 1);
            System.out.println("Se ha preparado tu café americano");
        }
        else{
            System.out.println("no se cuenta con los recursos suficientes/n");
            estadoActual();
        }
    }
    public void expreso(){
        if(getAgua()>0.12 && getCafe()>0.02 && getVasos() > 1) {
            System.out.println("\nLa maquina cuenta con los siguientes recursos: ");
            estadoActual();
            System.out.println("Tu bebida esta en proceso...");
            setAgua(getAgua() - 0.12);
            setCafe(getCafe() - 0.02);
            setVasos(getVasos() - 1);
            System.out.println("Se ha preparado tu café expreso");
        }
        else{
            System.out.println("no se cuenta con los recursos suficientes/n");
            estadoActual();
        }
    }
    public void capuchino(){
        if(getAgua()>0.12 && getCafe()>0.02 && getCrema()>0.07 && getVasos() > 1) {
            System.out.println("\nLa maquina cuenta con los siguientes recursos: ");
            estadoActual();
            System.out.println("Tu bebida esta en proceso...");
            setAgua(getAgua() - 0.12);
            setCafe(getCafe() - 0.014);
            setCrema(getCrema()-0.07);
            setVasos(getVasos() - 1);
            System.out.println("Se ha preparado tu café capuchino");
        }
        else{
            System.out.println("no se cuenta con los recursos suficientes/n");
            estadoActual();
        }
    }
    public void estadoActual(){
        System.out.println("Agua = " + getAgua()*1000 + " ml\n" +
                "Cafe = " + getCafe()*1000 + " g\n" +
                "Crema = " + getCrema()*1000 + " ml\n" +
                "Vasos = " + getVasos() + " piezas\n" );
    }

    public void refillAgua(){
        setAgua(LTS_AGUA);
    }
    public void refillCafe(){
        setCafe(KG_CAFE);
    }
    public void refillCrema(){
        setCrema(LTS_CREMA);
    }
    public void refillVasos(){
        setVasos(NUM_VASOS);
    }
    public void refillTodo(){
        refillAgua();
        refillCafe();
        refillCrema();
        refillVasos();
    }
}
