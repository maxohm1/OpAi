package max.ohm.opai


import android.graphics.Bitmap
import max.ohm.opai.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)