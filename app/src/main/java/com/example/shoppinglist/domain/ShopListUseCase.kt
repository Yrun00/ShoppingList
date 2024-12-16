package com.example.shoppinglist.domain

import com.example.shoppinglist.data.ShopItem


interface ShopListUseCase {

    fun getHashMapShopList(): HashMap<Int, ShopItem>

}

