package com.example.shoppinglist.domain

import com.example.shoppinglist.data.ShopItem

interface ShopListRepository {

    fun deleteItem(item: ShopItem)

    fun addItem(item: ShopItem)

    fun editItem(item: ShopItem)

    fun getItem(id:Int): ShopItem

    fun getShopList(): List<ShopItem>
}