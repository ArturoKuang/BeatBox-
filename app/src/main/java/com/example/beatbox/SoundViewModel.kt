package com.example.beatbox

class SoundViewModel {
    var sound: Sound? = null
        set(sound) {
            field = sound
        }

    var title: String? = null
        get() = sound?.name
}