package com.dragonlordian.myapplication.di

import android.app.Application
import androidx.room.Room
import com.dragonlordian.myapplication.common.BASE_URL
import com.dragonlordian.myapplication.data.local.StockDatabase
import com.dragonlordian.myapplication.data.remote.StockApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideStockApi(): StockApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun provideStockDatabase(appContext: Application): StockDatabase{
        return Room.databaseBuilder(
            appContext,
            StockDatabase::class.java,
            "stockdb.db"
        ).build()
    }
}