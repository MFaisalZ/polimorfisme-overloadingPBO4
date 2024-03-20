public abstract class hewan {
 
    // Mendeklrasikan class dan method tipe abstract 
    protected abstract void munculSuara();
 
}

public class kucing extends hewan {
    
    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara() {
        System.out.println("Suara Kucing: Meow...meow..meow.");
    }
 

}
public class burung extends hewan {
 
    // Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara() {
        System.out.println("Suara Burung: Cit...cit..cit.");
    }
 
}

public class tampil {
 
    public static void main (String[] args) {
        hewan kucing = new kucing();
        kucing.munculSuara();
    
        hewan burung = new burung();
        burung.munculSuara();
    }   
}

