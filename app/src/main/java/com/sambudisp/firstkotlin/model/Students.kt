package com.sambudisp.firstkotlin.model

//Class ini akan digunakan untuk memilih data apa saja yang ingin ditampilkan
data class Students(
        var idnya: String? = null,
        var namanya: String? = null,
        var emailnya: String? = null,
        var avatarnya: Int? = null //ini contoh aja pakai "Int" karena ngambilnya dari Drawable (ngambil IDnya)
)