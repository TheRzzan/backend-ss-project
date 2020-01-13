package com.morozov.backend_ss_project

import android.content.Context
import android.widget.Toast

object MakeToster {
    fun make(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}