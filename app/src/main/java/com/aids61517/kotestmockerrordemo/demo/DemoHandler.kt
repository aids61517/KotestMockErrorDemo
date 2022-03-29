package com.aids61517.kotestmockerrordemo.demo

class DemoHandler(
    private val provider: Provider,
) {
    var data: String? = null

    suspend fun fetchData() {
        data = provider.getString()
    }
}