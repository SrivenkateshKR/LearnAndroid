package com.example.android.justjava

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {

    var quantity: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {

//        val qtytxtview = findViewById<View>(R.id.quantity_text_view) as TextView
//        quantity = qtytxtview.text.toString().toInt()
        //val price : Int = 5.50.toInt()
        //display(number = quantity)
        //displayPrice(quantity * price)
        val message: String = "Total: $" + (quantity * 5) + "\nThank you!"
        displayMessage(message)
    }

    /**
     * This method decreases the given quantity value on the screen.
     */
    /**
     * This method displays the given text on the screen.
     */
    private fun displayMessage(message: String) {
        val priceTextView = findViewById<View>(R.id.price_text_view) as TextView
        priceTextView.text = message
    }

    fun reduceqty(view: View) {
        //val qtytxtview = findViewById<View>(R.id.quantity_text_view) as TextView
        //val priceTextView = findViewById<View>(R.id.price_text_view) as TextView
        //val reduced :Int = qtytxtview.text.toString().toInt()
        if (quantity == 0) {
            //qtytxtview.text = "" + 0
            quantity = 0
        } else
        //qtytxtview.text = "" + (reduced - 1).toString()
            quantity = quantity - 1

        display(number = quantity)
        //priceTextView.text = (qtytxtview.text.toString().toInt() * 5).toString()
    }

    /**
     * This method increases the given quantity value on the screen.
     */

    fun IncreaseQty(view: View) {
        //val qtytxtview = findViewById<View>(R.id.quantity_text_view) as TextView
        //val priceTextView = findViewById<View>(R.id.price_text_view) as TextView
        //val increased :Int = qtytxtview.text.toString().toInt()
        /*if (quantity == 0)
        {
            qtytxtview.text = "" + 1
        }
        else
            qtytxtview.text = "" + (increased + 1).toString()*//*
            //priceTextView.text = (qtytxtview.text.toString().toInt() * 5).toString()*/
        quantity = quantity + 1
        display(quantity)
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById<View>(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + number.toString()
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        val priceTextView = findViewById<View>(R.id.price_text_view) as TextView
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number)
    }
}
