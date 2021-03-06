package com.amnix.utils.extensions

import android.os.AsyncTask
import com.amnix.utils.extras.InMemoryCache
import java.io.Closeable
import java.util.*

/**
 * Want to run some code on another thread?
 *
 * run it with the ease of async and leave it to be executed on a Worker Thread.
 * Make sure you don't do some context related stuff in async, It may cause an memory leak
 */
fun async(runnable: () -> Unit) = object : AsyncTask<Void, Void, Void>() {
    override fun doInBackground(vararg params: Void?): Void? {
        runnable.invoke()
        return null
    }
}.execute()!!
/**
 * Want to run some code on another thread?
 *
 * run it with the ease of asyncAwait [asyncRunnable] and leave it to be executed on a Worker Thread. [awaitRunnable] wil be invoked after the asyncRunnable with the result returned from [asyncRunnable]
 * Make sure you don't do some context related stuff in [asyncRunnable], It may cause an memory leak
 */
fun <T> asyncAwait(asyncRunnable: () -> T?, awaitRunnable: (result: T?) -> Unit) =
    object : AsyncTask<Void, Void, T>() {
        override fun doInBackground(vararg params: Void?): T? {
            return try {
                asyncRunnable()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

        override fun onPostExecute(result: T?) {
            super.onPostExecute(result)
            awaitRunnable(result)
        }

    }.execute()!!

/**
 * try the code in [runnable], If it runs then its perfect if its not, It won't crash your app.
 */
fun tryOrIgnore(runnable: () -> Unit) = try {
    runnable()
} catch (ignore: Exception) {
}

/**
 * put Something In Memory to use it later
 */
fun putInMemory(key: String, any: Any?) = InMemoryCache.put(key, any)

/**
 * get Saved Data from memory, null if it os not exists
 */
fun getFromMemory(key: String): Any? = InMemoryCache.get(key)

/**
 * Try Catch within a single line
 */
fun tryAndCatch(runnable: () -> Unit, onCatch: ((e: Throwable?) -> Unit)? = null, onFinally: (() -> Unit)? = null) =
    try {
        runnable.invoke()
    } catch (e: Throwable) {
        onCatch?.invoke(e)
    } finally {
        onFinally?.invoke()
    }

/**
 * Close All the CLosable safely.
 */
fun closeSafely(vararg closeables: Closeable) {
    closeables.forEach {
        try {
            it.close()
        } catch (e: Error) {
        }
    }
}

/**
 * Check if Device is Rooted.
 */
fun isDeviceRooted(): Boolean {
    val locs = arrayOf(
        "/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/",
        "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/",
        "/system/sbin/", "/usr/bin/", "/vendor/bin/"
    )
    locs.forEach {
        if ((it + "su").toFile().exists())
            return true
    }
    return false

}

/**
 * guardRun will run your code and returns True if it executed Properly else false.
 */
fun guardRun(runnable: () -> Unit): Boolean = try {
    runnable()
    true
} catch (ignore: Exception) {
    ignore.printStackTrace()
    false
}

/**
 * get Current Date.
 */
fun currentDate() = Date(System.currentTimeMillis())

/**
 * Loop with a single Int, It will call the [loop] till the value of [till]
 *
 * It will execute from 0 .. [till]
 */
fun loop(till: Int, loop: (i: Int) -> Unit) = repeat(till, loop)

/**
 * While Loop Wrapped with Kotlin Global Extension
 */
fun loopWhile(boolean: Boolean, loop: () -> Unit) {
    while (boolean) loop()
}

/**
 * invokes [runnable] if value is Not Null. Quite handy.
 */
fun <T : Any?> T?.isNotNull(runnable: (it: T) -> Unit) = this?.let {
    runnable(it)
}

/**
 * get CurrentTimeInMillis from System.currentTimeMillis
 */
inline val currentTimeMillis: Long get() = System.currentTimeMillis()