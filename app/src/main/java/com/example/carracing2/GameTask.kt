package com.example.carracing2

interface GameTask {
    fun closeGame(mScore: Int, highScore: Int)
    fun updateHighScore(newHighScore: Int)
}
