package androidacademy2020homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment


class FragmentMoviesList : Fragment() {

    private var listener: TransactionsFragmentClicks? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ConstraintLayout>(R.id.movie_avengers).apply {
            setOnClickListener { listener?.addFragment() }
        }
    }

    fun setClickListener(l: TransactionsFragmentClicks?) {
        listener = l
    }

    interface TransactionsFragmentClicks {
        fun addFragment()
    }
}