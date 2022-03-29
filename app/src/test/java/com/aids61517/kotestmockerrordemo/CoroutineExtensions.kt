package com.aids61517.kotestmockerrordemo

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking

fun CoroutineScope.waitForJobsToFinish(action: CoroutineScope.() -> Unit) {
    val coroutineContext = coroutineContext
    val startCount = coroutineContext[Job]?.children?.count() ?: 0
    runBlocking {
        action()
        val currentCount = coroutineContext[Job]?.children?.count() ?: 0
        if (currentCount > startCount) {
            coroutineContext[Job]?.children
                ?.drop(startCount)
                ?.forEach { it.join() }
        }
    }
}