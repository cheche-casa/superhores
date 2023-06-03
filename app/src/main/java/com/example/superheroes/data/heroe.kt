package com.example.superheroes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroes.R

data class heroe (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int

)

val heroes = listOf(
    heroe(R.drawable.android_superhero1, R.string.nome_1, R.string.Descricion_1,),
    heroe(R.drawable.android_superhero2, R.string.nome_2, R.string.Descricion_2,),
    heroe(R.drawable.android_superhero3, R.string.nome_3, R.string.Descricion_3,),
    heroe(R.drawable.android_superhero4, R.string.nome_4, R.string.Descricion_4,),
    heroe(R.drawable.android_superhero5, R.string.nome_5, R.string.Descricion_5,),
    heroe(R.drawable.android_superhero6, R.string.nome_6, R.string.Descricion_6,),
)