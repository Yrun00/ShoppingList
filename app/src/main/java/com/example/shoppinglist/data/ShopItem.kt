package com.example.shoppinglist.data

data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var itemId: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}



