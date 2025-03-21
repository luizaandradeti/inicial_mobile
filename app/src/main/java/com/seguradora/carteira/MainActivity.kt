package com.seguradora.carteira

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.seguradora.carteira.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnFrase.setOnClickListener(this)

    }
    override fun onClick(visualizar: View?) {
        val text = "Ok!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity

        val text2 = "Não ok!"
        val duration2 = Toast.LENGTH_SHORT
        val toast2 = Toast.makeText(this, text2, duration2) // in Activity


        if (visualizar != null) {
            return if (visualizar.id == R.id.btn_frase) {
                toast2.show()
            } else {
                toast.show()
            }
        }

    }

}