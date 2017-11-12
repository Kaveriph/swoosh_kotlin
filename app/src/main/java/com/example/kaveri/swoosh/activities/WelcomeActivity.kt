package com.example.kaveri.swoosh.activities

import android.content.Intent
import android.os.Bundle
import com.example.kaveri.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        initialize()
    }

    private fun initialize() {
        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java )
            startActivity(leagueIntent)
        }
    }
}
