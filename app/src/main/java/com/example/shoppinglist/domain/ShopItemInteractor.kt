package com.example.shoppinglist.domain

import com.example.shoppinglist.data.ShopItem

interface ShopItemInteractor{

    fun deleteItem(id: Int)

    fun addItem(name:String, count:Int, enabled:Boolean = false)

    fun editItem(id:Int)

    fun getItem(id:Int): ShopItem

    class Base(private val repository: ShopListRepository):ShopItemInteractor{
        override fun deleteItem(id: Int) {
            repository.deleteItem(getItem(id))
        }

        override fun addItem( name: String, count: Int, enabled: Boolean) {
            repository.addItem(ShopItem(name=name,count=count,enabled=enabled))
        }

        override fun editItem(id: Int) {
            repository.editItem(getItem(id))
        }

        override fun getItem(id: Int): ShopItem {
            return repository.getItem(id)
        }
    }
}