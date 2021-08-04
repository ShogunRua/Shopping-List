package com.example.shoppinglist.domain.usecase

import com.example.shoppinglist.domain.ShopItem
import com.example.shoppinglist.domain.repository.ShopListRepository

class DeleteShopItemUseCase(
    private val shopListRepository: ShopListRepository
) {

    fun deleteShopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}
