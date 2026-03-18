package com.song;
import java.util.*;
public interface MusicPlayer {

	public void addSong(Song song);
	
	public void updateSong(int songId,String title,String artist,Double duration);
	
	public void deleteSong(int songId);
	
	public void playSong(int songId);
	
	public void pauseSong();
	
	public void stop();
	
	public void displayAllSongs();
	
	public void createPlayList(String playListName);
	
	public void addSongToPlayList(String PlayListName,List<Song> songs);
	
	public void playPlayList(String playListName);
}
