package julio.com.br.kotlinbasicsoreilly.basics.stdlib

/**
 * Created by mira on 07/06/2017.
 */

data class Album(val title: String, val year: Int, val charUk: Int, val chartUs: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)


val albums = listOf<Album>(Album("The dark side of the moon", 1973, 1, 65,
        listOf(Track("Speak to me", 90),
                Track("Breath", 134),
                Track("Onthe run", 219),
                Track("Onthe run", 255),
                Track("Time", 42),
                Track("Great gig in the sky", 39),
                Track("Money", 87),
                Track("Us", 23)
        )),
        Album("The Wall", 1977, 1, 1),
        Album("Wish you were here", 1988, 2, 8),
        Album("Animals", 1965, 1, 7),
        Album("The piper at the gates of dawn", 1999, 2, 1),
        Album("The Final Cut", 1979, 2, 43),
        Album("Atom heart mother", 1944, 2, 1),
        Album("The Wall", 1974, 5, 1))

fun main(args: Array<String>) {
    //Find all albums first in uk
    for(album in albums){ //Old Way
        if(album.charUk == 1){
            println(album.title)
        }
    }
    println()
    //Better way :D
    albums.forEach{//Loop into the colection and executing the action
        album -> if (album.charUk == 1) println("Found: ${album.title}")
    }

    //Using it
    println()
    albums.forEach{//Loop into the colection and executing the action
        it -> if (it.charUk == 1) println("Found: ${it.title}")
    }

    println()
    //Much better from stlib
    val albumsFiltered =albums.filter { it.charUk ==1 }//Returns a list containing only elements matching the given [predicate].
    albumsFiltered.forEach{println("Found it on filtered :  ${it.title}")}

    albums.filter { it.charUk == 1 }
            .forEach{println("Found it on filtered inline: ${it.title}")} //Se tiver mais de 3 functions retornando, é aconselhavel agrupa-las em alguma outra function

    val titles = albums.filter { it.charUk == 1 }
            .map { Pair(it.title, it.year)  } //Map a collection of elements into another collection

    titles.forEach{println(it)}

    albumAndTrackLowerThanXSeconds(200, albums).forEach{println(it.first )}//Foreach no retorno da lista


}

fun albumAndTrackLowerThanXSeconds(durationInSeconds: Int, Albums: List<Album>): List<Pair<String, String>>{

    //Map =>> [a,b,c] f(x) => [f(a), f(b), f(c)]
    //FlatMap =>> [[a,b], [c,d]] (Collection of collection) => Flat the collection [f(a), f(b), f(c), f(d)]
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds  <= durationInSeconds
        }.map { //Mapeando para uma nova collection
            Pair(albumTitle, it.title)
        }
    }
}