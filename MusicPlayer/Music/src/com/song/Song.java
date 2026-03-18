package com.song;

public class Song {
    private int songId;
    private String title;
    private String artist;
    private Double duration;
	public Song(int songId, String title, String artist, Double duration) {
		super();
		this.songId = songId;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
	}
    
	
    
}
