package com.dicoding.storecamera

object EventsData {
    private val image = intArrayOf(
        R.drawable.alpha_1,
        R.drawable.fx3,
        R.drawable.alpha_9_2,
        R.drawable.alpha_7s_3,
        R.drawable.alpha_7c,
        R.drawable.alpha_7r_4,
        R.drawable.alpha_6100,
        R.drawable.alpha_6600,
        R.drawable.alpha_7r_3,
        R.drawable.alpha_9,
        R.drawable.alpha_6400
    )

    private val title = arrayOf(
        "Sony α1",
        "Sony FX3",
        "Sony α9 II",
        "Sony α7S III",
        "Sony α7C",
        "Sony α7R IV",
        "Sony α6100",
        "Sony α6600",
        "Sony α7R III ",
        "Sony α9",
        "Sony α6400"
    )

    private val description = arrayOf(
        "Superb Resolution Camera",
        "Full-frame Cinema Line",
        "Full-frame Pro Camera",
        "Pro Movie/Still Capability",
        "Mini Full-frame Camera",
        "Camera with 61.0MP",
        "APS-C camera with Fast AF",
        "Premium E-mount APS-C",
        "35mm Full-frame Camera",
        "Full-frame Stacked CMOS",
        "E-mount with APS-C Sensor"
    )

    private val price = arrayOf(
        "Coming Soon",
        "Coming Soon",
        "Rp.63,499,000",
        "Rp.50,999,000",
        "Rp.26,999,000",
        "Rp.49,000,000",
        "Rp.9,999,000",
        "Rp.20,999,000",
        "Rp.36,999,000",
        "Rp.56,999,000",
        "Rp.12,999,000"
    )

    private val long_desc = arrayOf(
        "Sony menantang batasan alat pengambil gambar konvensional dengan teknologi inovatif, menghasilkan kombinasi resolusi dan kecepatan tak tertandingi serta pengoperasian yang intuitif. α1 menawarkan dimensi baru pada performa gambar sekaligus alur kerja yang efisien, memberi pengguna kebebasan kreatif baru.",
        "Kamera FX3 Cinema Line Sony mewujudkan visi kreator konten yang membara. Ekspresi sinematik setara dengan performa andal dan operasi yang disederhanakan untuk memenuhi kebutuhan komunitas kreatif masa kini. Ringkas dan ringan, sangat mudah dibawa dan dipakai. ",
        "Terinspirasi Semangat Profesional. Performa kecepatan luar biasa α9, yang mengubah gaya fotografi olahraga dan berita, kini lahir kembali dengan peningkatan tambahan yang meningkatkan produktivitas alur kerja profesional.",
        "Membawa seri S ke level ekspresi film full-frame yang baru, kecepatan baru yang spektakuler berpadu dengan sensitivitas tertinggi dan noise ultra rendah untuk menghasilkan gambar film 4K yang sebelumnya mustahil, dengan rentang dinamis tinggi, fokus mengagumkan, dan stabilisasi gambar ekstra kuat. Potensi kreatif baru menanti.",
        "Dengan lensa FE 28-60mm F4-5.6, α7C menghasilkan kualitas full-frame tanpa kompromi dengan sistem kamera dan lensa paling kecil dan ringan di dunia. Ukurannya kecil, tetapi mampu menghasilkan kualitas gambar, AF, dan kecepatan yang tinggi. Kamera ini serba bisa, dan siap menunjang kreativitas Anda ke mana pun Anda pergi.",
        "Meskipun ukurannya ringkas dan ringan, α6400 memberikan performa cepat dan beragam fitur yang Anda harapkan dari model full-frame. Baik mengambil gambar diam atau film, komposisi kreatif atau foto selfie harian, Anda akan menikmati gambar indah yang ingin Anda bagikan di mana saja.",
        "Dengan kecepatan dan performa AF yang luar biasa, serta pelacakan subjek yang persisten, α6100 menangani mekanika fotografi dengan sangat baik, sehingga Anda bebas berkonsentrasi pada sisi kreatifnya. Kamera menangkap aksi sepersekian detik dan menghasilkan gambar-gambar indah dalam situasi sulit, untuk gambar diam yang mengagumkan dan film 4K resolusi tinggi",
        "α6600 memiliki beragam fitur, untuk menghadirkan yang Anda butuhkan di segala situasi yang ditemui - AF cepat, stabilisasi gambar mantap dan kualitas gambar mengagumkan, baterai berkapasitas tinggi, dan pengambilan gambar film 4K HDR (HLG) yang tidak main-main.",
        "Memperkenalkan α7R II full-frame seukuran genggaman — “R” yang memajukan revolusi dalam resolusi dengan sensitivitas, respons, dan penyempurnaan lebih tinggi.",
        "Tangkap puncak momen penting dengan α7 III dari Sony. Dilengkapi sensor CMOS full-frame bercahaya belakang yang baru dikembangkan dan inovasi pencitraan canggih lainnya, respons kecepatan tinggi, pengoperasian mudah, dan ketahanan teruji siap untuk berbagai pengambilan gambar.",
        "Hasrat mendorong batasan imajinasi Tapi apakah alat jadi batasan? Potensi hanya berkembang jika bebas Mimpi bertemu teknologi, dan kamera baru pun dilahirkan, lalu disempurnakan Kini masa depan di tangan Anda, di mana saja",
    )

    val listData: ArrayList<Events>
        get() {
            val list = arrayListOf<Events>()
            for (position in title.indices) {
                val events = Events()
                events.image = image[position]
                events.title = title[position]
                events.description = description[position]
                events.price = price[position]
                events.longDesc = long_desc[position]
                list.add(events)
            }
            return list
        }
}