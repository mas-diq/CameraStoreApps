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
        "α1",
        "FX3",
        "α9 II",
        "α7S III",
        "α7C",
        "α7R IV",
        "α6100",
        "α6600",
        "α7R III ",
        "α9",
        "α6400"
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

    val listData: ArrayList<Events>
        get() {
            val list = arrayListOf<Events>()
            for (position in title.indices) {
                val events = Events()
                events.image = image[position]
                events.title = title[position]
                events.description = description[position]
                events.price = price[position]
                list.add(events)
            }
            return list
        }
}