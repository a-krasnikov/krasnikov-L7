package com.example.pmtechretrofit.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class Fact(
    @SerializedName("_id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("status")
    val status: Status,
    @SerializedName("user")
    val user: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("createdAt")
    val createdAt: Date
)