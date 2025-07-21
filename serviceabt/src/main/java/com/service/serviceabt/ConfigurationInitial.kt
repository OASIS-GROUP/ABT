package com.service.serviceabt

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView


class ConfigurationInitial @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_configuration_initial, this, true)
        val btn = findViewById<Button>(R.id.btn_initial)
        val text = findViewById<TextView>(R.id.txt_name)

        btn.setOnClickListener {
            text.text = "Hola"
        }

    }
}