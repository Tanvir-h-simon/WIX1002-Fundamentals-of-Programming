public class MovieCollection{
    private Movie[] movieCollection;
    private int numMovie;

    public MovieCollection(){
        movieCollection= new Movie[100];
        numMovie=0;
    }

    public boolean isEmpty(){
        return numMovie == 0;
    }

    public void addMovie(Movie movie){
        if(numMovie<100){
            movieCollection[numMovie] = movie;
            numMovie++;
        }
        else{
            System.out.println("The collection of movie is full");
        }
    }

    public void removeMovie(String title){
        int deleteIndex = -1;
        for (int i = 0; i < numMovie; i++) {
            if (movieCollection[i].getTitle().equals(title)) {
                deleteIndex = i;
                break;
            }
        }

        if(deleteIndex!=-1){
            System.out.println("Removed movie: "+ title);
            for (int i = deleteIndex; i < numMovie - 1; i++) {
                movieCollection[i] = movieCollection[i + 1];
            }
            movieCollection[numMovie - 1] = null;
            numMovie--;
        }
        else{
            System.out.println("Movie is not in the collection");
        }
    }

    public void findmovieCollectionByDirector(String director){
        boolean found = false;
        System.out.println("Movies directed by '" + director + "'");
        for (int i = 0; i < numMovie; i++) {
            Movie movie = movieCollection[i];
            if (movie.getDirector().equals(director)){
                System.out.println(movie.toString());
                found=true;
            }
        }
        if(found==false){
            System.out.println("No movie form this director inside the collection");
        }
    }

    public void findMovieByTitle(String title){
        System.out.println("Movie '" + title + "' found:");
        for (int i = 0; i < numMovie; i++) {
            Movie movie = movieCollection[i];
            if (movie.getTitle().equals(title)){
                System.out.println(movie.toString());
            }
        }
    }

    public void sortmovieCollectionByReleaseYear(){
        for (int i = 0; i < numMovie - 1; i++) {
            for (int j = 0; j < numMovie - 1 - i; j++) {
                if (movieCollection[j].getYear() > movieCollection[j + 1].getYear()) {
                    Movie temp = movieCollection[j];
                    movieCollection[j] = movieCollection[j + 1];
                    movieCollection[j + 1] = temp;
                }
            }
        }
    }

    public void findmovieCollectionByReleaseYearRange(int startYear,
                                                      int endYear){
        for (int i = 0; i < numMovie; i++) {
            Movie movie = movieCollection[i];
            if (movie.getYear()>=startYear && movie.getYear()<=endYear){
                System.out.println(movie.toString());
            }
        }
    }

    public void displayCollection(){
        for (int i = 0; i < numMovie; i++) {
            Movie movie = movieCollection[i];
            System.out.println(movie.toString());
        }
    }
}
