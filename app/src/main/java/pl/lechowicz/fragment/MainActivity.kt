package pl.lechowicz.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // handle button Fragment 2
        val fragment2Button = findViewById<Button>(R.id.fragment2_button)
        fragment2Button.setOnClickListener {
            val fragment2 = Fragment2()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // handle button Fragment 1
        val fragment1Button = findViewById<Button>(R.id.fragment1_button)
        fragment1Button.setOnClickListener {
            val fragment1 = Fragment1()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment1)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        // display Fragment 1 when app is starting
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, Fragment1())
                .commit()
        }
    }

}