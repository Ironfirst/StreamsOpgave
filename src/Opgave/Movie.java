package Opgave;

public class Movie
{
    String filmnavn;
    int likes;
    int prodYear;
    int antalMin;

    public Movie(String filmnavn,int likes,int prodYear,int antalMin){
        this.filmnavn = filmnavn;
        this.likes=likes;
        this.prodYear=prodYear;
        this.antalMin=antalMin;

    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "filmnavn='" + filmnavn + '\'' +
                ", likes=" + likes +
                ", prodYear=" + prodYear +
                ", antalMin=" + antalMin +
                '}'+ "\n";
    }
}
