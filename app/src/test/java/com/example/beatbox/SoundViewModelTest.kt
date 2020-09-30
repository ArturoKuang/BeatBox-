package com.example.beatbox

import org.junit.Before

import org.junit.Assert.*

class SoundViewModelTest {

    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    @Before
    fun setUp() {
        sound = Sound("assetPath")
        subject = SoundViewModel()
        subject.sound = sound
    }
}