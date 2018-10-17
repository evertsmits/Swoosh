package com.egsdevelopment.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.egsdevelopment.swoosh.Model.Player
import com.egsdevelopment.swoosh.R
import com.egsdevelopment.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        resetClicked()
        mensLeagueBtn.isChecked = true
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        resetClicked()
        womensLeagueBtn.isChecked = true
        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        resetClicked()
        coedLeagueBtn.isChecked = true
        player.league = "coed"
    }

    fun resetClicked() {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
    }


    fun leagueNextClicked(view: View) {
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }


}
