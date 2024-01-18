/**
 * Playlist.java
 * @author August Cho, Matthew Tomlin
 * @version 2024-01-16
 */

import java.util.ArrayList;

public class Playlist
{
	private ArrayList<Song> playlist;    

	public class Playlist()
	{
		playlist = new ArrayList<Song>();
	}

	public void addSong(Song song)
	{
		playlist.add(song);
	}
	public void like(int ID)
	{
		playlist.get(ID).likeButton();
	}
	public void remove(int ID)
	{
		playlist.remove(ID);	
	}
	public Song getSong(int ID)
	{
		return playlist.get(ID);
	}
	public String listSongs()
	{
		String output = "";
		for (int i = 0; i < playlist.size(); i++)
		{
			output += playlist.get(i).toString();
			output += "\n";
		}
		return output;
	}
	public String listLikedSongs()
	{
		String output = "";
		for (int i = 0; i < playlist.size(); i++)
		{
			if (playlist.get(i).getLiked())
			{
				output += playlist.get(i).toString();
				output += "\n";
			}
		}
		return output;
	}
	public String getDuration()
	{
		int seconds = 0;
		int minutes = 0;
		for (int i = 0; i < playlist.size(); i++)
		{
			seconds += playlist.get(i).getSeconds();
		}
		minutes = (int) (seconds / 60);
		seconds = seconds - (minutes * 60);
		return minutes + ":" + seconds;
	}
	public void removeUnliked()
	{
		ArrayList<Song> tempList = new ArrayList<Song>();
		for (int i = 0; i < playlist.size(); i++)
		{
			if (playlist.get(i).getLiked())
			{
				tempList.add(playlist.get(i));
			}
		}
		playlist = tempList;
		playlist.clear();
		for (int i = 0; i < tempList.size(); i++)
		{
			playlist.add(tempList.get(i));
		}
	}
}
