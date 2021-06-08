package com.protoenergy.protoenergyinterview.data.repository

import com.protoenergy.protoenergyinterview.data.network.OrdersApi


import com.protoenergy.protoenergyinterview.models.OrdersModelItem
import dagger.hilt.android.scopes.ActivityRetainedScoped
import retrofit2.Response
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(private val ordersApi: OrdersApi) {
    suspend fun getOrders(): Response<MutableList<OrdersModelItem>> {
        return ordersApi.getOrders()
    }
}