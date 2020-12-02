package androidacademy2020homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentMoviesList.TransactionsFragmentClicks {

    private val fragmentMoviesDetails = FragmentMovieDetails()
    private val fragmentMoviesList = FragmentMoviesList().apply { setClickListener(this@MainActivity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fl_mainContainer, fragmentMoviesList)
            .commit()

    }

    override fun addFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fl_mainContainer, fragmentMoviesDetails)
            .addToBackStack("trans_MoviesListToMovieDetails")
            .commit()
    }


}