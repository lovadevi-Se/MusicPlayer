package com.song;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayerImpl implements MusicPlayer{
	
 private List<Song> songs=new ArrayList<>();
 
 private Song currentSong=null;
 
 private List<Playlist> playlists=new ArrayList<>();
 
	@Override
	public void addSong(Song song) {
		songs.add(song);
		System.out.println("song is added");
	}
	

	@Override
	public void updateSong(int songId, String title, String artist, Double duration) {
		for(Song song:songs) {
			if(song.getSongId()==songId) {
				song.setTitle("okeyoka");
				song.setArtist("sid");
				song.setDuration(2.5);
				System.out.println("song updated successfully");
				return;
			}
		}
		System.out.println("song not found");
	}
	

	@Override
	public void deleteSong(int songId) {
		songs.removeIf(song->song.getSongId()==songId);
		System.out.println("delete song succesfully");
	}
	

	@Override
	public void playSong(int songId) {
		for(Song song:songs) {
			if(song.getSongId()==songId) {
				currentSong=song;
				System.out.println(song);
				return;
			}
		}
		System.out.println("song not found");
		
	}

	@Override
	public void pauseSong() {
		if(currentSong!=null) {
		System.out.println("pause song:"+currentSong);
		return;
		}
		System.out.println("song is not playing");
	}
	

	@Override
	public void stop() {
		if(currentSong!=null) {
			System.out.println("stop current song:"+currentSong);
			currentSong=null;
		}else {
			System.out.println("no song playing");
		}
		
	}

	@Override
	public void displayAllSongs() {
		if(songs.isEmpty()) {
			System.out.println("songs is not found");
		}else {
			for(Song song:songs) {
				System.out.println(song);
			}
		}
	}

	@Override
	public void createPlayList(String playListName) {
		playlists.add(new Playlist(playListName));
		System.out.println("create playlist successfully..");
	}

	@Override
	public void addSongToPlayList(String PlayListName, List<Song> songToAdd) {
		for(Playlist playlist:playlists) {
			if(playlist.getPlayListName().equals(PlayListName)) {
				for(Song song:songToAdd) {
				      playlist.addSong(song);
				}
				System.out.println("song added successfully");
				return;
		}
			
		}
		System.out.println("playlist not found !");
			
		
	}

	@Override
	public void playPlayList(String playListName) {
		for(Playlist playlist:playlists) {
			if(playlist.getPlayListName().equals(playListName)) {
				for(Song song:playlist.getSong()) {
					System.out.println("playing:"+song);
					
				}
				return;
			}
		}
		System.out.println("playlist not found..");
		
	}

}
