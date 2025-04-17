package com.dragonlordian.myapplication.data.mapper

import com.dragonlordian.myapplication.data.local.CompanyListingEntity
import com.dragonlordian.myapplication.data.remote.dto.CompanyInfoDto
import com.dragonlordian.myapplication.domain.model.CompanyInfo
import com.dragonlordian.myapplication.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo{
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}