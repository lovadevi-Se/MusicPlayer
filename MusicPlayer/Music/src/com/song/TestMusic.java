package com.song;

import java.util.Arrays;

public class TestMusic {

	public static void main(String[] args) {
		MusicPlayer player=new MusicPlayerImpl();
		
		Song s1=new Song(1,"Naatu","Rahul",3.5);
		Song s2=new Song(2,"butta Bomma","Arman",4.2);
	
		
		player.addSong(s1);
		player.addSong(s2);
		
		player.updateSong(1, "Naatu", "Rahul", 3.5);
		
		player.deleteSong(2);
		
		player.playSong(1);
		
		player.pauseSong();
		
		player.stop();
		
		player.displayAllSongs();
		
		player.createPlayList("telugu songs");
		
		player.addSongToPlayList("telugu songs",Arrays.asList(s1,s2));
		
		player.playPlayList("telugu songs");
		
	}

}
