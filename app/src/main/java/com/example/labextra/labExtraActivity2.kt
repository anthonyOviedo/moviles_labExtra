package com.example.labextra

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class labExtraActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab_extra2)

        Toast.makeText(this, "On create de Act 2", Toast.LENGTH_SHORT).show()


        val btn_click_me = findViewById(R.id.btnAtras) as Button
        btn_click_me.setOnClickListener {
            val openMainActivity = Intent(this, MainActivity::class.java)
            openMainActivity.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
            startActivityIfNeeded(openMainActivity, 0)
        }

        val textView: TextView = findViewById(R.id.textAct2 ) as TextView
        val texto = "Al ingresar a la activad2 deberia ver\n" +
                "-pausa Main\n" +
                "-create de Act 2\n" +
                "-start Act 2\n" +
                "-resumen Act 2"

        textView.text = texto


    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "On Start de Act 2", Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        Toast.makeText(this, "On restart de Act 2", Toast.LENGTH_SHORT).show()

        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "On Resume de Act 2", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "On Pause de Act 2", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On Destroy de Act 2", Toast.LENGTH_SHORT).show()
    }
}