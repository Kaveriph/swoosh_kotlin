package com.example.kaveri.swoosh.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kaveri.swoosh.EXTRA_LEAGUE_TYPE
import com.example.kaveri.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view:View) {
        if(selectedLeague != "") {
            val intent = Intent(this, SkillActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE_TYPE,selectedLeague)
            startActivity(intent)
        } else {
            Toast.makeText(this, "please select a type", Toast.LENGTH_SHORT).show()
        }
    }

    fun mensClicked(view:View){
        if(mensLeagueBtn.isChecked) {
            womensLeagueBtn.isChecked = false
            coEdLeagueBtn.isChecked = false
            selectedLeague = getString(R.string.mens)
        }

    }

    fun womensClick(view:View) {
        if(womensLeagueBtn.isChecked) {
            mensLeagueBtn.isChecked = false
            coEdLeagueBtn.isChecked = false
            selectedLeague = getString(R.string.womens)
        }

    }

    fun coedClicked(view:View) {
        if (coEdLeagueBtn.isChecked) {
            womensLeagueBtn.isChecked = false;
            mensLeagueBtn.isChecked = false;
            selectedLeague = getString(R.string.co_ed)
        }
    }
}
