package com.sambudisp.firstkotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//Class ini akan digunakan untuk memilih data apa saja yang ingin ditampilkan
@Parcelize
data class Students(
        var idnya: String? = null,
        var namanya: String? = null,
        var emailnya: String? = null,
        var avatarnya: Int? = null //ini contoh aja pakai "Int" karena ngambilnya dari Drawable (ngambil IDnya)
) : Parcelable //Biar bisa kirim2 data ke act lain