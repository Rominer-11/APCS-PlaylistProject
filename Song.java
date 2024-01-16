/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private int seconds;
    private String artist;
    private boolean liked;
    private String length;
    private int minutenum;
    private int secondnum;
    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String name, int seconds, String artist)
    {
        this.liked = false;
        this.name = name;
        this.minutes = minutes;
        this.seconds = seconds;
        this.artist = artist;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

    public void LikeButton()
    {
        if(liked)
        {
            liked = false;
        }
        else
        {
            liked = true
        }
    }


    public String getName()
    {
        return name;
    }


    public int getSeconds()
    {
        return seconds;
    }

    public String getArtist()
    {
        return artist;
    }

    public boolean getLiked()
    {
        return liked;
    }

    private String toLength()
    {
        if(seconds >= 60)
        {
            secondnum = seconds % 60;
            minutenum = (int) (seconds / 60);
        }
        else
        {
            secondnum = seconds;
        }
        length =  "(" + minutenum + ":" + secondnum + ")";
        return length;
    }

    public String toString()
    {
        return "\u0022" + name + "\u0022" + " by " + artist + length;
    }

}
