package com.example.labassignment1.model

import java.util.*

data class ChatMessage(
    var senderId: String,
    var receiverId: String,
    var message: String,
    var dateTime: String,


){

    constructor() : this("","","","")
}