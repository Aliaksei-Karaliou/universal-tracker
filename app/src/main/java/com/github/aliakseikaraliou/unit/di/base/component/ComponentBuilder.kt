package com.github.aliakseikaraliou.unit.di.base.component

interface ComponentBuilder<T> {
    fun build(): T
}