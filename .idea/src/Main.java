import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {


        Album jackJohnson = new Album("In Between Dreams", "Jack Johnson", 2005);
        Album mtJoy = new Album("Mt.Joy", "Mt. Joy", 2018);

        Song crying_shame = new Song("Crying Shame", 3.1, jackJohnson); // No need to pass the album here
        Song banana_pancakes = new Song("Banana Pancakes", 3.1, jackJohnson);
        Song better_together = new Song("Better Together", 3.3, jackJohnson);
        Song breakdown = new Song("Breakdown", 3.3, jackJohnson);
        Song belle = new Song("Belle", 1.4, jackJohnson);
        Song if_i_could = new Song("If I could", 2.2, jackJohnson);
        Song good_people = new Song("Good People", 3.3, jackJohnson);
        Song situations = new Song("Situations", 1.2, jackJohnson);
        Song sitting_waiting_wishing = new Song("Sitting, Waiting, Wishing", 3.0, jackJohnson);
        Song staple_it_together = new Song("Staple It Together", 3.2, jackJohnson);
        Song never_know = new Song("Never Know", 3.3, jackJohnson);
        Song constellations = new Song("Constellations", 3.2, jackJohnson);
        Song do_you_remember = new Song("Do You Remember", 2.2, jackJohnson);
        Song no_other_way = new Song("No Other Way", 3.1, jackJohnson);

        Song silver_lining = new Song("Silver Lining", 3.2, mtJoy);
        Song astrovan = new Song("Astrovan", 2.1, mtJoy);
        Song sheep = new Song("Sheep", 3.4, mtJoy);
        Song bigfoot = new Song("Bigfoot", 3.2, mtJoy);
        Song cardinal = new Song("Cardinal", 3.3, mtJoy);
        Song julia = new Song("Julia", 3.1, mtJoy);
        Song dirty_love = new Song("Dirty Love", 2.4, mtJoy);
        Song im_your_wreck = new Song("I'm Your Wreck", 3.5, mtJoy);
        Song st_george = new Song("St George", 3.4, mtJoy);
        Song mt_joy = new Song("Mt. Joy", 3.3, mtJoy);
        Song sado = new Song("Sado", 2.1, mtJoy);
        Song jenny_jenkins = new Song("Jenny Jenkins", 3.2, mtJoy);
        Song younger_days = new Song("Younger Days", 5.0, mtJoy);



        jackJohnson.addSong(crying_shame);
        jackJohnson.addSong(better_together);
        jackJohnson.addSong(banana_pancakes);
        jackJohnson.addSong(breakdown);
        jackJohnson.addSong(belle);
        jackJohnson.addSong(if_i_could);
        jackJohnson.addSong(good_people);
        jackJohnson.addSong(sitting_waiting_wishing);
        jackJohnson.addSong(situations);
        jackJohnson.addSong(staple_it_together);
        jackJohnson.addSong(never_know);
        jackJohnson.addSong(constellations);
        jackJohnson.addSong(do_you_remember);
        jackJohnson.addSong(no_other_way);

        mtJoy.addSong(silver_lining);
        mtJoy.addSong(astrovan);
        mtJoy.addSong(sheep);
        mtJoy.addSong(dirty_love);
        mtJoy.addSong(bigfoot);
        mtJoy.addSong(cardinal);
        mtJoy.addSong(julia);
        mtJoy.addSong(im_your_wreck);
        mtJoy.addSong(st_george);
        mtJoy.addSong(mt_joy);
        mtJoy.addSong(sado);
        mtJoy.addSong(jenny_jenkins);
        mtJoy.addSong(younger_days);


        albums.add(jackJohnson);
        albums.add(mtJoy);


        LinkedList<Song> userPlaylist = new LinkedList<>();

        albums.get(0).addToPlayList(crying_shame, userPlaylist);
        albums.get(0).addToPlayList(better_together, userPlaylist);
        albums.get(0).addToPlayList(banana_pancakes, userPlaylist);
        albums.get(0).addToPlayList(breakdown, userPlaylist);
        albums.get(0).addToPlayList(belle, userPlaylist);
        albums.get(0).addToPlayList(if_i_could, userPlaylist);
        albums.get(0).addToPlayList(good_people, userPlaylist);
        albums.get(0).addToPlayList(sitting_waiting_wishing, userPlaylist);
        albums.get(0).addToPlayList(situations, userPlaylist);
        albums.get(0).addToPlayList(staple_it_together, userPlaylist);
        albums.get(0).addToPlayList(do_you_remember, userPlaylist);
        albums.get(0).addToPlayList(constellations, userPlaylist);

        albums.get(1).addToPlayList(silver_lining, userPlaylist);
        albums.get(1).addToPlayList(astrovan, userPlaylist);
        albums.get(1).addToPlayList(sheep, userPlaylist);
        albums.get(1).addToPlayList(dirty_love, userPlaylist);
        albums.get(1).addToPlayList(julia, userPlaylist);
        albums.get(1).addToPlayList(younger_days, userPlaylist);
        albums.get(1).addToPlayList(cardinal, userPlaylist);
        albums.get(1).addToPlayList(bigfoot, userPlaylist);
        albums.get(1).addToPlayList(st_george, userPlaylist);


        play(userPlaylist);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
    
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("This playlist has no songs");
        } else {
            System.out.println("\nNow playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("No song available, reached the end of the list");
                        forward = false;
                    }
                    break;
                case 2: 
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            System.out.println("Now playing: " + listIterator.previous().toString());
                            listIterator.next();
                        }
                        if (!listIterator.hasPrevious()) {
                            forward = false;
                        }
                    }
                    else {
                        System.out.println("Can't skip, this is the first song");
                        forward = false;
                    }
                    break;
                case 3: 
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now playing: " + listIterator.previous().toString());
                            forward = false;
                            break;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                        break;
                    }
                case 4:
                    printList(playList);
                    break;
                case 5: 
                    printMenu();
                    break;
                case 6: 
                    if (playList.size() > 0) {
                        System.out.println("Deleted " + listIterator.previous().toString());
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing: " + listIterator.next().toString());
                        } else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now playing: " + listIterator.previous().toString());
                            }
                        }
                    }
                    break;
                    case 7:
                    if (listIterator.hasPrevious()) {
                        Song currentSong = listIterator.previous(); // Move back to the current song

                        Album album = currentSong.getAlbum();
                        if (album != null) {
                            System.out.println(currentSong.getTitle() + " is from the album `" +
                                    currentSong.getAlbum().getTitle() + "` by " + album.getArtist() +
                                    "\nThe album is " + album.getDuration() + " minutes long and was released in " +
                                    album.getReleaseDate());
                        } else {
                            System.out.println(currentSong.getTitle() + " is not associated with any album.");
                        }
                        currentSong = listIterator.next();
                    } else if (listIterator.hasNext()) {
                        Song currentSong = listIterator.next();
                        Album album = currentSong.getAlbum();
                        if (album != null) {
                            System.out.println(currentSong.getTitle() + " is from the album `" +
                                    album.getTitle() + "` by " + album.getArtist() +
                                    "\nThe album is " + album.getDuration() + " minutes long and was released in " +
                                    album.getReleaseDate());
                        } else {
                            System.out.println(currentSong.getTitle() + " is not associated with any album.");
                        }
                        currentSong = listIterator.previous();
                    }
                    break;
            }
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println("Available options:\nPress");
        System.out.println("0 - to quit\n" + 
                    "1 - to skip current song\n" +
                    "2 - to play previous song\n" +
                    "3 - to replay the current song\n" +
                    "4 - to see a list of all songs in playlist\n" +
                    "5 - to re-print options\n" +
                    "6 - to delete current song from playlist\n" +
                    "7 - to see information about the current song's album"); 
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("---------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");
    }


}

/*
 * make it so that the user can add their own song
 * doesn't display data
*/