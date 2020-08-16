package com.example.businessbuilder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import androidx.core.view.isEmpty

class BudgetMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_budget_menu)

        val lookAtBudgetRequests = findViewById<ImageButton>(R.id.pendingList)
        val requestBudget = findViewById<ImageButton>(R.id.requestBudget)
        val approvedList = findViewById<ImageButton>(R.id.approvedList)
        val unapproved = findViewById<ImageButton>(R.id.unapprovedList)
        val receivedList = findViewById<ImageButton>(R.id.receivedList)

        MySingleton.getInstance(this).verifyPendingStatus(lookAtBudgetRequests)

        lookAtBudgetRequests.setOnClickListener {
            val intent = Intent(this, BudgetRequestList::class.java)
            startActivity(intent)
        }
        requestBudget.setOnClickListener {
            val intent = Intent(this, RequestBudget::class.java)
            startActivity(intent)
        }
        approvedList.setOnClickListener {
            val intent = Intent(this, RequestBudgetApproved::class.java)
            startActivity(intent)
        }
        unapproved.setOnClickListener {
            val intent = Intent(this, RequestBudgetUnapproved::class.java)
            startActivity(intent)
        }
        receivedList.setOnClickListener {
            val intent = Intent(this, RequestBudgetReceived::class.java)
            startActivity(intent)
        }

    }
}