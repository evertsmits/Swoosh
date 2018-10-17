package com.egsdevelopment.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.egsdevelopment.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class ActivityWelcome : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
