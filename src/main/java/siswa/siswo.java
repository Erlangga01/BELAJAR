package siswa;

public class siswo{
        int nim;
        String nama;

    public siswo(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "siswo{" + "nim=" + nim + ", nama=" + nama + '}';
    }
        
}
