package com.example.shoppinglist.domain

import com.example.shoppinglist.data.ShopItem

interface ShopListRepository {

    fun deleteItem(id: Int)

    fun addItem(id:Int, name:String, count:Int, enabled:Boolean = false)

    fun editItem(id:Int)

    fun getItem(id:Int): ShopItem

    fun getHashMapShopList(): HashMap<Int, ShopItem>
}