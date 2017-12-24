package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Player extends BorderPane {
	Media media;
	MediaPlayer mediaplayer;
	MediaView view;
	Pane mpane;
	MediaBar bar;
	public Player(String file)
	{
		media=new Media(file);
		mediaplayer=new MediaPlayer(media);
		view= new MediaView(mediaplayer);
		mpane=new Pane();
		mpane.getChildren().add(view);
		setCenter(mpane);
		bar=new MediaBar(mediaplayer); 
		setBottom(bar);
		setStyle("-fx-background-color: GREY");
		mediaplayer.play();
		}
	

}
