import Filereader.FileReaderUsers;
import Filereader.FileReaderRatings;
import Filereader.FileReaderMovies;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
     FileReaderUsers readerUsers = new FileReaderUsers();
     readerUsers.readFileUser(args);


     FileReaderMovies readerMovies = new FileReaderMovies();
     readerMovies.readFileMovies(args);

     FileReaderRatings readerRatings = new FileReaderRatings();
     readerRatings.readFileRating(args);


    }
}
