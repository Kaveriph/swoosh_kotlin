package com.example.kaveri.swoosh.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kaveri.swoosh.EXTRA_PLAYER
import com.example.kaveri.swoosh.R
import com.example.kaveri.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        initialize()
    }

    private fun initialize() {
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Toast.makeText(this,player.league,Toast.LENGTH_SHORT).show()
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
    fun onFinishClick(view: View) {
        if(player.skill != "") {
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra(EXTRA_PLAYER, player)
            startActivity(intent)
        } else {
            Toast.makeText(this, "select a skill", Toast.LENGTH_SHORT).show()
        }
    }

    fun beginnerClick(view:View) {
        if(beginnerBtn.isChecked) {
            ballerBtn.isChecked = false
            player.skill = getString(R.string.beginner)
        }
    }

    fun ballerClick(view:View) {
        if(ballerBtn.isChecked) {
            beginnerBtn.isChecked = false
            player.skill = getString(R.string.baller)
        }
    }
}
