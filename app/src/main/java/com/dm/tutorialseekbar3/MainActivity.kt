package com.dm.tutorialseekbar3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar                           //Importazione della Classe: SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //variabile di appoggio per memorizzare il valore di progress con la virgola
    private var value: Double? = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                //inserire qui il codice che deve essere eseguito quando si sposta il cursore
                //convertire progress in formato Double dividere per 10 e sommare 0.1
                value = (progress.toDouble()/10)+0.1
                //visualizzare il risultato nella TextView con solo una cifra decimale
                //per questo viene utilizzata la funzione String.format("%.1f", nomevariabile)
                textView.text = String.format("%.1f", value)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                //inserire qui il codice che deve essere eseguito quando si inizia a
                //spostare il cursore
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                //inserire qui il codice che deve essere eseguito quando si finisce di
                //spostare il cursore
            }
        })
        }
    }
