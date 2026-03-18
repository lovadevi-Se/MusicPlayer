package com.song;
import java.util.*;
public class Playlist {
    private String playListName;
    
    private List<Song> songs;
    
	public Playlist(String playListName) {
		super();
		this.playListName = playListName;
		this.songs = new ArrayList<>();
	}
	
	public String getPlayListName() {
		return playListName;
	}
	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}
	public List<Song> getSong() {
		return songs;
	}
	public void setSong(List<Song> song) {
		this.songs = song;
	}

	public void addSong(Song song) {
		songs.add(song);
		
	}

	
	
    
}
