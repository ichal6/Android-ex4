package pl.lechowicz.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // set background color
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        view.setBackgroundColor(Color.BLUE)
        return view
    }
}
