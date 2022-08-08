package classesAndObjects

interface Downloader{
    fun download()
}

interface Player{
    fun play()
}

class MediaDownloader(): Downloader{
    override fun download(){
        println("downloaded")
    }
}

class MediaPlayer(): Player{
    override fun play(){
        println("playing")
    }
}

class Media(
    val downloader: Downloader,
    val player: Player
    ): Downloader by downloader, Player by player{
//    override fun download() {
//    }
//
//    override fun player() {            // no need to implement download and player since this is supported by kotlin.
//    }
}

fun main(){
    println("delegation")

    val media = Media(MediaDownloader(), MediaPlayer())
    media.download()
    media.play()
}