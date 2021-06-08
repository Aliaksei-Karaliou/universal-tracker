package com.github.aliakseikaraliou.unit.di.base.exception

import kotlin.reflect.KClass

class DaggerComponentNotInitializedException(clazz: KClass<*>) :
    Throwable("${clazz.qualifiedName} not initialized") {
}