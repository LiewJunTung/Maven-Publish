package org.netvirta.mavenpublish

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.netvirta.mavenpublish.R.id.theText
import org.netvirta.mylibrary.Alien
import org.netvirta.mylibrary.Cat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alien = Alien("he", 4, 123)
        val cat = Cat("Nguyen", "Meow", 12)
        theText.text = cat.toString()
    }
}
