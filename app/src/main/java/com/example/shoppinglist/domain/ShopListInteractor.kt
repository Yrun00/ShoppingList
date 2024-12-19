package com.example.shoppinglist.domain

import com.example.shoppinglist.data.ShopItem


interface ShopListInteractor {

    fun getShopList(): List<ShopItem>

    class Base(private val repository: ShopListRepository) : ShopListInteractor {
        override fun getShopList(): List<ShopItem> {
            return repository.getShopList()

        }
    }
}

