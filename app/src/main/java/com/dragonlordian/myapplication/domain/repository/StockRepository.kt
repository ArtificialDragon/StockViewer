package com.dragonlordian.myapplication.domain.repository

import com.dragonlordian.myapplication.data.remote.StockApi
import com.dragonlordian.myapplication.domain.model.CompanyInfo
import com.dragonlordian.myapplication.domain.model.CompanyListing
import com.dragonlordian.myapplication.domain.model.IntradayInfo
import com.dragonlordian.myapplication.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote:Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}