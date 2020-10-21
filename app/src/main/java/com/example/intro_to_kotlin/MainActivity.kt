package com.example.intro_to_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //Declare title of song with String and val
    val title: String = "Dynamite (Bedroom Remix)"

    //Declare artist of song with String and var
    var artist: String = "BTS"

    //Declare album of song with String and var
    var album: String = "Dynamite (NightTime Version)"

    //Declare year released of song with Int and var
    var yearReleased: Int = 2020

    //Declare genre of song with String and var
    var genre: String = "K-POP"

    //Declare duration (seconds) of song with Short and var
    var duration: Short = 224

    //Declare youtube view of song with Long and var
    var youtubeViewer: Long = 407967556L

    //Declare is favorite with Bool and var
    var isFavorite: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Print section
        */
        println("Song Title: $title")
        println("Artist: $artist")
        println("Album: $album")
        println("Year Released: $yearReleased")
        println("Genre: $genre")
        println("Duration: $duration")
        println("Youtube Viewer: $youtubeViewer")
        println("My Favourite: $isFavorite")
    }






}