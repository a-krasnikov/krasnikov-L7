package com.example.pmtechretrofit.model

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("verified")
    val verified: Boolean,
    @SerializedName("sentCount")
    val sentCount: Int,
    @SerializedName("feedback")
    val feedback: String?
)