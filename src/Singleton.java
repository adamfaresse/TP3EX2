class Singleton {
    private int nombre;
    static final private Singleton INSTANCE = new Singleton();
    // ... autres attributs
    private Singleton() { this.nombre = 1;}
    public static Singleton getInstance() { return INSTANCE; }
// ... autres methodes
    public int getNombre(){
        return this.nombre;
    }
}

