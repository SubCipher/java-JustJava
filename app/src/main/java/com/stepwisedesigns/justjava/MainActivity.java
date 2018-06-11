package com.stepwisedesigns.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    private int numberOfCoffees = 2;
    private int quantity = 1;

    public void submitOrder(View view) {

        String priceMessage = "Total Cost it ";
        displayMessage(priceMessage);

        int costPerCup = 5;
        displayPrice(numberOfCoffees * costPerCup);
    }

    public void increment(View view){
        additem();
        display(numberOfCoffees);
    }
    public void decrement(View view){

        deleteItem();
        display(numberOfCoffees);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private int display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
        System.out.println("222");
        return number;
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message){

        TextView priceTextView = findViewById(R.id.price_text_viewA);
        priceTextView.setText(message);
    }

    private void additem(){

       numberOfCoffees += quantity;
    }

    private void deleteItem(){

        numberOfCoffees -= quantity;
    }
}