public class Roi {
    public static  String nomDuRoi;
    static Roi Instance;

    private Roi(String nomDuRoi){
        this.nomDuRoi = nomDuRoi;
    }

    public static void newInstance(String nomDuRoi){
         Instance = new Roi(nomDuRoi);
    }

    public static Roi getInstance(){
        return Instance;
    }

    public static String getNomDuRoi(){
        return nomDuRoi;
    }
}
