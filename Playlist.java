/**
 * Playlist.java
 * @author August Cho, Matthew Tomlin
 * @version 2024-01-16
 */

import java.util.ArrayList;

public class Playlist
{
	private ArrayList<Song> playlist;    

	public Playlist()
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
		if (seconds < 10)
		{
			return minutes + ":0" + seconds;
		}
		else
		{
			return minutes + ":" + seconds;
		}
	}
	public void removeUnliked()
	{
		for (int i = playlist.size() - 1; i >= 0; i--)
		{
			if (!playlist.get(i).getLiked())
			{
				playlist.remove(i);
			}
		}
	}
	public int getID(String name)
	{
		int ID = 0;
		for (int i = 0; i < playlist.size(); i++)
		{
			if (playlist.get(i).getName().equals(name))
			{
				ID = i;
			}
		}
		return ID;
	}
}
