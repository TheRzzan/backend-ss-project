package com.morozov.test_lib

import android.content.Context

interface MakeTosterApi {
    fun make(context: Context, text: String)
}