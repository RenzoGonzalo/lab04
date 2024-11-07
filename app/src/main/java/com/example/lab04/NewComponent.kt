package com.example.lab04


import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class NewComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        // Configura el botón
        text = "Presióname"
        setBackgroundColor(Color.BLUE)
        setTextColor(Color.WHITE)

        // Cambia de color al presionar el botón
        setOnClickListener {
            setBackgroundColor(Color.GREEN)
            text = "¡Presionado!"
        }
    }
}
