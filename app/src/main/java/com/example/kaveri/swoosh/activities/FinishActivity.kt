package com.example.kaveri.swoosh.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kaveri.swoosh.EXTRA_LEAGUE_TYPE
import com.example.kaveri.swoosh.EXTRA_SKILL
import com.example.kaveri.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        initialize()
    }

    fun initialize() {
    val league = intent.extras.get(EXTRA_LEAGUE_TYPE)
        var skill = intent.extras.get(EXTRA_SKILL)
        searchLeaguesText.text = "Looking for $league $skill around you..."
    }
}
