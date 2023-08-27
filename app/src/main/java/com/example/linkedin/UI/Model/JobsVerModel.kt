package com.example.linkedin.UI.Model

data class JobsVerModel(
    val hozContent: ArrayList<JobsHozModel>? =null,
    val title:String,
    val history:String,
    val budget:String,
    val comment:String,
    val payImage:Int,
    val payText:String,
    val payCost:String)
