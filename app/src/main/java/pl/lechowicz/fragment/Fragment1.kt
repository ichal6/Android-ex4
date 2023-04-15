package pl.lechowicz.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Set background color
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        view.setBackgroundColor(Color.GREEN)
        return view
    }

}