package com.morozov.test_lib_impl

import android.content.Context
import android.widget.Toast
import com.morozov.test_lib.MakeTosterApi

object MakeToster: MakeTosterApi {
    override fun make(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}