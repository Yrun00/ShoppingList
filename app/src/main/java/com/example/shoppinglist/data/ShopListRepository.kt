package com.example.shoppinglist.data

import com.example.shoppinglist.domain.ShopListRepository

class ShopListRepository() :
    ShopListRepository {

    private val shopList: MutableList<ShopItem> = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun deleteItem(item: ShopItem) {
        shopList.remove(item)
    }

    override fun addItem(item: ShopItem) {
        if (item.itemId == ShopItem.UNDEFINED_ID) {
            item.itemId = autoIncrementId++
            shopList.add(item)
        } else {
            shopList.add(item)
        }
    }

    override fun editItem(item: ShopItem) {
        val index = shopList.indexOf(getItem(item.itemId))
        shopList.removeAt(index)
        shopList.add(index = index, item)
    }

    override fun getItem(id: Int): ShopItem {
        return shopList.find { it.itemId == id }
            ?: throw RuntimeException("Element with id $id not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }


}