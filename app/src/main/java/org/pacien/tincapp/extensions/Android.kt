package org.pacien.tincapp.extensions

import android.widget.ArrayAdapter
import android.widget.TextView
import org.pacien.tincapp.R
import org.pacien.tincapp.context.App

/**
 * @author pacien
 */
object Android {

    fun <T> ArrayAdapter<T>.setElements(elems: Collection<T>) {
        setNotifyOnChange(false)
        clear()
        addAll(elems)
        notifyDataSetChanged()
        setNotifyOnChange(true)
    }

    fun TextView.setText(list: List<String>) =
            if (list.isNotEmpty()) text = list.joinToString("\n") else text = App.getContext().getString(R.string.value_none)

}
