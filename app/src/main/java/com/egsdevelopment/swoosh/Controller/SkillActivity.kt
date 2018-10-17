package com.egsdevelopment.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.egsdevelopment.swoosh.Model.Player
import com.egsdevelopment.swoosh.R
import com.egsdevelopment.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onSkillFinishedClick(view: View) {
        if (player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBallerClick(view: View) {
        resetSelected()
        ballerSkillBtn.isChecked = true
        player.skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        resetSelected()
        beginnerSkillBtn.isChecked = true
        player.skill = "beginner"
    }

    fun resetSelected() {
        beginnerSkillBtn.isChecked = false
        ballerSkillBtn.isChecked = false
    }
}
