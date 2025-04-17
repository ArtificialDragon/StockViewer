package com.dragonlordian.myapplication.di

import com.dragonlordian.myapplication.data.csv.CSVParser
import com.dragonlordian.myapplication.data.csv.CompanyListingsParser
import com.dragonlordian.myapplication.data.csv.IntradayInfoParser
import com.dragonlordian.myapplication.data.repository.StockRepositoryImpl
import com.dragonlordian.myapplication.domain.model.CompanyListing
import com.dragonlordian.myapplication.domain.model.IntradayInfo
import com.dragonlordian.myapplication.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>


    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}