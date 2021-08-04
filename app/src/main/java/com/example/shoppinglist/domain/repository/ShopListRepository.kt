package com.example.shoppinglist.domain.repository

import com.example.shoppinglist.domain.ShopItem

interface ShopListRepository {

    fun getShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}
