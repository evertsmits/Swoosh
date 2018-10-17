package com.egsdevelopment.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.egsdevelopment.swoosh.Utilities.EXTRA_LEAGUE
import com.egsdevelopment.swoosh.R
import com.egsdevelopment.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onSkillFinishedClick(view: View) {
        if (skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBallerClick(view: View) {
        resetSelected()
        ballerSkillBtn.isChecked = true
        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        resetSelected()
        beginnerSkillBtn.isChecked = true
        skill = "beginner"
    }

    fun resetSelected() {
        beginnerSkillBtn.isChecked = false
        ballerSkillBtn.isChecked = false
    }
}
