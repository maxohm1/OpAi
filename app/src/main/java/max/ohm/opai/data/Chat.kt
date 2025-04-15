package max.ohm.opai.data


import android.graphics.Bitmap

/**
 * @author Ahmed Guedmioui
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)