package pl;
public class Kandydat implements Cloneable, Comparable<Kandydat>{
    private String nazwa;
    private int wiek;
    private String wyksztalcenie;
    private int lataDoswiadczenia;

    public Kandydat(String nazwa, int wiek, String wyksztalcenie, int lataDoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcenie = wyksztalcenie;
        this.lataDoswiadczenia = lataDoswiadczenia;
    }

    public String getnazwa() {
        return nazwa;
    }

    public int getwiek() {
        return wiek;
    }

    public String getwyksztlcenie() {
        return wyksztalcenie;
    }

    public int getlatadoswiadczenia() {
        return lataDoswiadczenia;
    }

    @Override
    public int compareTo(Kandydat dane) {
        int porownanie = 0;

        if(this.wyksztalcenie.equals("wyższe") ){
            if(dane.wyksztalcenie.equals("średnie"))
                porownanie+=1500;
        }
        if(this.wyksztalcenie.equals("średnie")){
            if(dane.wyksztalcenie.equals("wyższe")){
                porownanie-=1000;
            }
        }
        if(this.wiek > dane.wiek)
            porownanie+=110;
        if(this.wiek < dane.wiek)
            porownanie-=110;
        if(this.lataDoswiadczenia > dane.lataDoswiadczenia)
            porownanie+=30;
        if(this.lataDoswiadczenia < dane.lataDoswiadczenia)
            porownanie -=30;

        return porownanie;
    }





    



}