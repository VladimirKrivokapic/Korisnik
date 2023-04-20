public class FaceBookPost extends Korisnik {

    private String korisnik;
    private String opis ;

    public FaceBookPost(){

    }

    public FaceBookPost(String korisnik, String opis) {
        this.korisnik = korisnik;
        this.opis = opis;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void ispisi1(){
        System.out.println("Korisnik : " + korisnik  + " sa opisom " + opis  );
    }
}
