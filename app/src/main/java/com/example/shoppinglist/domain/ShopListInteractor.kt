package com.example.shoppinglist.domain

import com.example.shoppinglist.data.ShopItem


interface ShopListInteractor {

    fun getHashMapShopList(): HashMap<Int, ShopItem>
    
    class Base(private val repository: ShopListRepository): ShopListInteractor {
        override fun getHashMapShopList(): HashMap<Int, ShopItem> {
            return repository.getHashMapShopList()
        }
    }
}

