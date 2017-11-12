package com.example.kaveri.swoosh.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kaveri.swoosh.EXTRA_LEAGUE_TYPE
import com.example.kaveri.swoosh.EXTRA_SKILL
import com.example.kaveri.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var selectedLeague: String = ""
    var skill: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        initialize()
    }

    private fun initialize() {
        selectedLeague = intent.extras.get(EXTRA_LEAGUE_TYPE) as String
        Toast.makeText(this,selectedLeague,Toast.LENGTH_SHORT).show()
    }

    fun onFinishClick(view: View) {
        if(skill != "") {
            val intent = Intent(this, FinishActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE_TYPE, selectedLeague)
            intent.putExtra(EXTRA_SKILL, skill)
            startActivity(intent)
        } else {
            Toast.makeText(this, "select a skill", Toast.LENGTH_SHORT).show()
        }
    }

    fun beginnerClick(view:View) {
        if(beginnerBtn.isChecked) {
            ballerBtn.isChecked = false
            skill = getString(R.string.beginner)
        }
    }

    fun ballerClick(view:View) {
        if(ballerBtn.isChecked) {
            beginnerBtn.isChecked = false
            skill = getString(R.string.baller)
        }
    }
}
