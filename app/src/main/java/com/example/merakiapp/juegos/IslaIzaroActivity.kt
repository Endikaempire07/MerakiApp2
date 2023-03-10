package com.example.merakiapp.juegos

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.merakiapp.databinding.ActivityIslaIzaroBinding

class IslaIzaroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIslaIzaroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Deshabilitar rotación de pantalla (Landscape)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        super.onCreate(savedInstanceState)
        binding = ActivityIslaIzaroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(this.getSharedPreferences("pref", 0)?.getBoolean("libre", false) == false){
           // binding.btnVolverGaztelugatxe.visibility = View.VISIBLE
        }else{
            //binding.btnVolverGaztelugatxe.visibility = View.GONE
        }
        // TEMPORAL
        this.getSharedPreferences("validar6", 0).edit().putBoolean("validar6", true).apply()
    }
}