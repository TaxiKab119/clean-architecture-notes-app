package com.plcoding.cleanarchitecturenoteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Need to register this application in the AndroidManifest.xml
 * */
@HiltAndroidApp
class NoteApp : Application() {
}