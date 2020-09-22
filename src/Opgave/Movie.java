package Opgave;

public class Movie implements ZeroArgument, OneArgument<Movie>
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

    // denne metode er lavet på baggrund af 0 argument interface
    // og fungere rent faktisk godt på navncheck af current object
    // når den iterere igennem Stream med lamda expression
    @Override
    public boolean test()
    {
        if(this.filmnavn==null){
            return false;
        }

        else{
            return true;
        }
    }

    public String getFilmnavn()
    {
        return filmnavn;
    }

    public void setFilmnavn(String filmnavn)
    {
        this.filmnavn = filmnavn;
    }

    public int getLikes()
    {
        return likes;
    }

    public void setLikes(int likes)
    {
        this.likes = likes;
    }

    public int getProdYear()
    {
        return prodYear;
    }

    public void setProdYear(int prodYear)
    {
        this.prodYear = prodYear;
    }

    public int getAntalMin()
    {
        return antalMin;
    }

    public void setAntalMin(int antalMin)
    {
        this.antalMin = antalMin;
    }

    // denne metode giver vist ikke rigtig mening at lave
    // pga vi iterere igennem alle objects alligevel så en get object
    // metode virker ikke så snedigt
    // laver den om  til en test på likes <10
    @Override
    public boolean get()
    // denne er lavet om fra en object argument
    // hvis det var object skulle retur typen være
    // this eller at den ikke findes

    // virker nu på hvis der er mindre likes end 10 så
    // returner den false og tager dem ikke med i steam
    {
        if(this.likes>10){
            return true;
        }
        else{
            return false;
        }
    }
}
