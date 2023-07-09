package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)

    /**
     * Need to have a function here for the radio buttons...
     * want to keep the same NoteOrder but change OrderType...
     *
     * We call this copy() fxn in the OrderSection.kt file
     * */
    fun copy(orderType: OrderType): NoteOrder {
        //returns the current note order with the new orderType
        return when(this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}
