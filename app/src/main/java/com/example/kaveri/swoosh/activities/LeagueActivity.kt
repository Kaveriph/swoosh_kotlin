package com.example.kaveri.swoosh.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kaveri.swoosh.EXTRA_PLAYER
import com.example.kaveri.swoosh.R
import com.example.kaveri.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun leagueNextClicked(view:View) {
        if(player.league != "") {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_PLAYER,player)
            startActivity(intent)
        } else {
            Toast.makeText(this, "please select a type", Toast.LENGTH_SHORT).show()
        }
    }

    fun mensClicked(view:View){
        if(mensLeagueBtn.isChecked) {
            womensLeagueBtn.isChecked = false
            coEdLeagueBtn.isChecked = false
            player.league = getString(R.string.mens)
        }

    }

    fun womensClick(view:View) {
        if(womensLeagueBtn.isChecked) {
            mensLeagueBtn.isChecked = false
            coEdLeagueBtn.isChecked = false
            player.league = getString(R.string.womens)
        }

    }

    fun coedClicked(view:View) {
        if (coEdLeagueBtn.isChecked) {
            womensLeagueBtn.isChecked = false;
            mensLeagueBtn.isChecked = false;
            player.league = getString(R.string.co_ed)
        }
    }
}
