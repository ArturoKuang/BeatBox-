package com.example.beatbox

import android.content.res.AssetManager
import androidx.lifecycle.ViewModel

class BeatBoxViewModel(assetManager: AssetManager) : ViewModel() {
    var beatBox: BeatBox = BeatBox(assetManager)
}
