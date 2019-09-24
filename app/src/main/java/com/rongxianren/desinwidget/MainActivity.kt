package com.rongxianren.desinwidget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import com.rongxianren.desinwidget.custombehavior.ContainerActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        item_1.setOnClickListener {
            goCustomBehavior()
        }
    }

    fun goCustomBehavior() {
        val intent = Intent(this, ContainerActivity::class.java)
        startActivity(intent)
    }
}
