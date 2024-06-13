
package siswa;

import java.util.HashSet;

public class siswa {
    public static void main(String[] args) {
        siswo s1 = new siswo( 2024001,"agus");
        siswo s2 = new siswo(2024002,"budi");
        
        HashSet<siswo> daftarsiswa = new HashSet<>();
        daftarsiswa.add(s1);
        daftarsiswa.add(s2);
        System.out.println(daftarsiswa);
        
    }
    
}
