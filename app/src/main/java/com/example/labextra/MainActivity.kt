package com.example.labextra

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "On Create del main", Toast.LENGTH_SHORT).show()

        val btn_click_me = findViewById(R.id.btnTest) as Button
        btn_click_me.setOnClickListener {
            startActivity(Intent(this,  labExtraActivity2::class.java))
        }

        val textView: TextView = findViewById(R.id.txtMain) as TextView
        val texto = "Al iniciar esta aplicaicon deberia ver:\n" +
                "-On create del main\n" +
                "-start del main\n" +
                "-resumen del main\n"

        textView.text = texto

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On Start del main", Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        Toast.makeText(this, "On restart del main", Toast.LENGTH_SHORT).show()

        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On Resume del main", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "On Pause del main", Toast.LENGTH_SHORT).show()
        val textView: TextView = findViewById(R.id.txtMain) as TextView
        val texto = "Al volver de la actividad 2 deberia ver:\n" +
                "-pausa Act2\n" +
                "-restart del main\n" +
                "-start del main\n" +
                "-resumen del main\n"

        textView.text = texto
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On Destroy del main", Toast.LENGTH_SHORT).show()

    }
    
}