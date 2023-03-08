package com.example.listappsbangkit.model

import android.os.Parcel
import android.os.Parcelable

data class MovieDataItems(
    val judul: String,
    val director: String,
    val writer: String,
    val synopsis: String,
    val image: Int
    ) : Parcelable{
    constructor(parcel : Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    ){

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(judul)
        parcel.writeString(director)
        parcel.writeString(writer)
        parcel.writeString(synopsis)
        parcel.writeInt(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MovieDataItems> {
        override fun createFromParcel(parcel: Parcel): MovieDataItems {
            return MovieDataItems(parcel)
        }

        override fun newArray(size: Int): Array<MovieDataItems?> {
            return arrayOfNulls(size)
        }
    }
}
