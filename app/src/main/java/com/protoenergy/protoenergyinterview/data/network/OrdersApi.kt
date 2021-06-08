package com.protoenergy.protoenergyinterview.data.network


import com.protoenergy.protoenergyinterview.models.OrdersModelItem
import retrofit2.Response
import retrofit2.http.GET

interface OrdersApi {
    @GET("api/v1/orders.json")
    suspend fun getOrders(): Response<MutableList<OrdersModelItem>>
}