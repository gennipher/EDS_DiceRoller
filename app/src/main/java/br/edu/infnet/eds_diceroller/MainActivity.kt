package br.edu.infnet.eds_diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val dado = arrayOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJogar = findViewById<Button>(R.id.btnJogar)
        btnJogar.setOnClickListener{
            val valor = (0..5).random()
            val imgDado = findViewById<ImageView>(R.id.imgDado)
            imgDado.setImageResource(dado[valor])
        }
    }
}