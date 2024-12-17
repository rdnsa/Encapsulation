class Jersey {
private String nama;

public String getName() {
    return nama;
}

public void setName(String NAMA) {
    this.nama = NAMA;
}
}

public class Main {
    public static void main(String[] args) {
        Jersey pemilik = new Jersey();
        pemilik.setName("ini punya Issa");
        System.out.println(pemilik.getName());
    }
}
