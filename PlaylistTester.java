/**
 * PlaylistTester.java
 * @author August Cho
 * @version 2024-01-19
 */

public class PlaylistTester
{
	public static void main(String[] args)
	{
		System.out.println("Creating new playlist!");
		Playlist p = new Playlist();
		System.out.println("Initialized.");

		System.out.println("Adding songs.");
		p.addSong(new Song("Pain", 98, "PinkPanteress"));
		p.addSong(new Song("Desperado", 213, "Eagles"));
		p.addSong(new Song("White Room", 298, "Cream"));
		p.addSong(new Song("Scenes From an Italian Restaurant", 457, "Billy Joel"));
		System.out.println("Listing songs...");
		System.out.println(p.listSongs());

		System.out.println("Liking \"Desperado\"");
		p.like(p.getID("Desperado"));
		System.out.println("Listing songs...");
		System.out.println(p.listSongs());
		System.out.println("Listing liked songs...");
		System.out.println(p.listLikedSongs());

		System.out.println("Removing \"Pain\"");
		p.remove(p.getID("Pain"));
		System.out.println(p.listSongs());
		System.out.println("Total duration: " + p.getDuration());

		System.out.println("Removing all unliked songs...");
		p.removeUnliked();
		System.out.println("Listing songs...");
		System.out.println(p.listLikedSongs());
	}
}
