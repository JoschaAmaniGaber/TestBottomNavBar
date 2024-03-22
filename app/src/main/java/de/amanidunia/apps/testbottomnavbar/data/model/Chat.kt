package de.amanidunia.apps.testbottomnavbar.data.model

data class Chat(
    val contact: Contact,
    val messages: MutableList<Message>
)