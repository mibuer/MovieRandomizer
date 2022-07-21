package at.miriam.movierandomizer.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovieModel {
	

	
	public final ObservableList<Movie> moviesList = FXCollections.observableArrayList();
	
	public final ObservableList<Movie> moviesDBList = FXCollections.observableArrayList();
	
	public final ObservableList<Genre> genreList = FXCollections.observableArrayList(Genre.ACTION, Genre.ANIME, Genre.COMMEDY, Genre.CRIME,
																			Genre.DRAMA, Genre.FANTASY, Genre.HORROR, Genre.ROMANCE, Genre.SCIFI, 
																			Genre.SUPERHERO, Genre.THRILLER, Genre.ZOMBIE);
	public final ObservableList<StreamingService> streamingServiceList = FXCollections.observableArrayList(new StreamingService("Netflix"), 
																							new StreamingService("AmazonPrime"), new StreamingService("Arte Mediathek"),
																							new StreamingService("Disney+"), new StreamingService("YouTube"));
	
	
	private final ObjectProperty<Movie> selectedMovie = new SimpleObjectProperty<>();
	
	public final ObjectProperty<Movie> selectedMovieProperty() {
		return this.selectedMovie;		
	}
	
	public final Movie getSelectedMovie() {
		return this.selectedMovieProperty().get();
	}
	
	public final void setSelectedMovie (final Movie selectedMovie) {
		this.selectedMovieProperty().set(selectedMovie);
	}
	
	
	public MovieModel() {
		
		
		
	}
	
	
	
	

}
