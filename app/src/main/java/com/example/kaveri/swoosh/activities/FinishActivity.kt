package com.example.kaveri.swoosh.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kaveri.swoosh.EXTRA_PLAYER
import com.example.kaveri.swoosh.R
import com.example.kaveri.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        initialize()
    }

    fun initialize() {
    val player:Player = intent.getParcelableExtra(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} around you..."
    }
}
