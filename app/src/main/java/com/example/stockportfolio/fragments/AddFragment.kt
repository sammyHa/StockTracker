package com.example.stockportfolio.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.stockportfolio.R
import java.math.BigDecimal


class AddFragment : Fragment() {
    val price: EditText? =null
    val quantity: EditText? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_add, container, false)
        val quantity = view?.findViewById<EditText>(R.id.quantity)
        val price = view?.findViewById<EditText>(R.id.price)
        val totalCost = view?.findViewById<TextView>(R.id.total_cost)

        (view?.findViewById<Button>(R.id.btn_save)).also {

            it?.setOnClickListener({

                val result = quantity?.text.toString().toDouble() * price?.text.toString().toDouble()

            })
        }
        return view
    }
}



