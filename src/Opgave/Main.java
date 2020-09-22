package Opgave;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main implements ZeroArgument {

    public static void main(String[] args) {

        Movie film = new Movie("pelle the erobrer",15,1989,1200);
        Movie film1 = new Movie("pelle the great",152,1988,1201);
        Movie film2 = new Movie("pelle the pelle",151,1344,1202);
        Movie film3 = new Movie("pelle the pelleste",152,1435,1203);
        Movie film4 = new Movie("pelle the grand",154,1591,1204);
        Movie film5 = new Movie("pelle the big",155,1984,1206);
        Movie film6 = new Movie("pelle the small",156,1981,1204);
        Movie film7 = new Movie("pelle the medium",157,1982,12);
        Movie film8 = new Movie("pelle the p",158,1983,1206);
        Movie film9 = new Movie("pelle the dick",1,1983,121);
        Movie film10 = new Movie("pelle the facehawk",4,1986,122);
        Movie film11 = new Movie("pelle the games",13,1954,125);

        ArrayList<Movie> pelleFilmListen = new ArrayList<>();

        pelleFilmListen.add(film);
        pelleFilmListen.add(film1);
        pelleFilmListen.add(film2);
        pelleFilmListen.add(film3);
        pelleFilmListen.add(film4);
        pelleFilmListen.add(film5);
        pelleFilmListen.add(film6);
        pelleFilmListen.add(film7);
        pelleFilmListen.add(film8);
        pelleFilmListen.add(film9);
        pelleFilmListen.add(film10);
        pelleFilmListen.add(film11);

        List<Movie> moviest = pelleFilmListen.stream()
                .filter(movie -> movie.antalMin>122)
                .filter(movie -> movie.likes>15)
                .filter(movie -> movie.prodYear>1980)
                .filter(Movie -> Movie.)
                .collect(Collectors.toList());

        System.out.println(moviest);


    }

    @Override
    public boolean test()
    {
        return false;
    }
}
