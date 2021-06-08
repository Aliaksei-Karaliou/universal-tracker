package com.github.aliakseikaraliou.unit

import android.app.Application
import com.github.aliakseikaraliou.unit.di.context.component.ContextComponent

class UnitApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ContextComponent.init(this)
    }
}