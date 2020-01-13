package com.morozov.test_lib

import android.content.Context
import android.widget.Toast

object MakeToster {
    fun make(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}