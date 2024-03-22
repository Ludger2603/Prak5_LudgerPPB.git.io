package com.ludger.myapplication.model

import android.os.Parcel
import android.os.Parcelable

data class Student(
    val nim : String?,
    val nama : String?,
    val umur : Int?,
    val isLulus: Boolean?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Boolean::class.java.classLoader) as? Boolean
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nim)
        parcel.writeString(nama)
        parcel.writeValue(umur)
        parcel.writeValue(isLulus)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}
