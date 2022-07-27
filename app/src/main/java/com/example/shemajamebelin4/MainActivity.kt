package com.example.shemajamebelin4

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buClick(view: View) {
        val cellClicked = view as ImageButton
        var cellID = 0


        if (cellClicked.id == R.id.button1) {
            cellID = 1
        } else if (cellClicked.id == R.id.button2) {
            cellID = 2
        } else if (cellClicked.id == R.id.button3) {
            cellID = 3
        } else if (cellClicked.id == R.id.button4) {
            cellID = 4
        } else if (cellClicked.id == R.id.button5) {
            cellID = 5
        } else if (cellClicked.id == R.id.button6) {
            cellID = 6
        } else if (cellClicked.id == R.id.button7) {
            cellID = 7
        } else if (cellClicked.id == R.id.button8) {
            cellID = 8
        } else if (cellClicked.id == R.id.button9) {
            cellID = 9
        }
        startGame(cellID, cellClicked)

    }

    var player1 = mutableListOf<Int>()
    var player2 = mutableListOf<Int>()

    var active_player = 1


    fun startGame(cellID: Int, buSelected: ImageButton) {
        if (active_player == 1) {
            buSelected.setImageResource(R.drawable.ic_baseline_clear_24)
            player1.add(cellID)
            active_player = 2
        } else {
            buSelected.setImageResource(R.drawable.ic_baseline_run_circle_24)
            player2.add(cellID)
            active_player = 1
        }

        buSelected.isEnabled = false

        GameWinner()


    }

    private fun GameWinner(): Int {
        var winner = -1

        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }

        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "Player 1 won the game.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Player 2 won the game.", Toast.LENGTH_SHORT).show()
            }
            return winner
        }
        return 0
    }
}