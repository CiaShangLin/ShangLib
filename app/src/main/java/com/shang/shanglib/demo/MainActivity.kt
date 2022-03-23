package com.shang.shanglib.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shang.shanglib.shanglib.ShangLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShangLib().print()
    }
}