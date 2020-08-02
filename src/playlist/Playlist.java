package playlist;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("First song");
        desertIslandPlaylist.add("Second song");
        desertIslandPlaylist.add("Third song");
        desertIslandPlaylist.add("Fourth song");
        desertIslandPlaylist.add("Fifth song");
        desertIslandPlaylist.add("Sixth song");
        desertIslandPlaylist.add("Seventh song");

        System.out.println(desertIslandPlaylist);
        int numberOfSongs = desertIslandPlaylist.size();
        System.out.println(numberOfSongs);

        desertIslandPlaylist.remove("Sixth song");
        desertIslandPlaylist.remove("Seventh song");

        System.out.println(desertIslandPlaylist);
        int newNumberOfSongs = desertIslandPlaylist.size();
        System.out.println(newNumberOfSongs);

        int indexA = desertIslandPlaylist.indexOf("Fourth song");
        int indexB = desertIslandPlaylist.indexOf("Second song");
        String tempA = "Fourth song";
        desertIslandPlaylist.set(indexA, "Second song");
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);
    }

}