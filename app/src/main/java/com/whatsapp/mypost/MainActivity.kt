package com.whatsapp.mypost

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.whatsapp.mypost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
        binding.rvPosts.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false )
        displayArtists()

    }
    fun displayArtists(){
        val artists1 = Artist("Faith Yiamat","","Nov 22,2022","The day to remember","This is the day when I went to Maasai mara \n " +
                "national park to have a look on how animals \n" +
                "migrate from serengeti to Tanzania","","View More")
        val artists2 = Artist("Fanny Ingabire","","Mar 23, 2023","Babies Goes To Market","Baby is tied to Mama’s back in an outdoor African market.\n A seller gives Baby 6 bananas" +
                " without Mama knowing.\n Baby eats 1 and puts 5 in the basket on Mama’s head.","","View More")
        val artists3 = Artist("Yvonne Martin","","Feb 4, 2004","Sulwe","Coloring Pins was birthed from my wanting to wear pins, but not " +
                "seeing any for me on the market. There are tons of cute pins, but none of them resonated with me.","","View More")
        val artists4 = Artist("Eshe Khalid","","Jan 21, 2017","The tell of peter rabbit","Since its release, the book has generated considerable" +
                " merchandise for both children and adults, including toys, dishes, foods, clothing, and videos.","","View More")
        val artists5 = Artist("Trevor Noah","","Dec 23, 2016","Born A Crime","We have no choice " +
                "over the circumstances we are born into. Growing up, " +
                "we learn how to deal with them. “Born a Crime” is a coming-of-age memoir by Trevor Noah.","","View More")
        var artists = listOf(artists1,artists2,artists3,artists4,artists5)


        val postsAdapter = ArtistAdapterClass(artists)
        binding.rvPosts.adapter = postsAdapter

    }
}