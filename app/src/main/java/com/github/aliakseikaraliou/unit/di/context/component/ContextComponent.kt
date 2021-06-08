package com.github.aliakseikaraliou.unit.di.context.component

import android.content.Context
import com.github.aliakseikaraliou.unit.di.base.component.ComponentBuilder
import com.github.aliakseikaraliou.unit.di.base.exception.DaggerComponentNotInitializedException
import com.github.aliakseikaraliou.unit.di.context.provider.ContextProvider
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ContextComponent : ContextProvider {

    @Component.Builder
    interface Builder : ComponentBuilder<ContextProvider> {
        @BindsInstance
        fun context(context: Context): Builder
    }

    companion object {
        private var instance: ContextProvider? = null

        val INSTANCE
            get() = instance
                ?: throw DaggerComponentNotInitializedException(ContextProvider::class)

        fun init(context: Context) {
            instance = DaggerContextComponent
                .builder()
                .context(context)
                .build()
        }
    }
}