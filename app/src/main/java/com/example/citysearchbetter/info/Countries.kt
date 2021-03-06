package com.example.citysearchbetter.info

import com.google.gson.annotations.SerializedName

data class CountryRefResponse(
    val status: String,
    val countries: List<CountryRef>
)

data class CountryRef(
    val code: String,
    val name: String,
    @SerializedName("geonameid") val geonameId: Long,

)