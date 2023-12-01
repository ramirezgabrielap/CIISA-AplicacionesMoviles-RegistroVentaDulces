package com.example.manjarch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private TextView dulce1;
    private TextView precio1;
    private EditText cant1;

    private TextView dulce2;
    private TextView precio2;
    private EditText cant2;

    private TextView dulce3;
    private TextView precio3;
    private EditText cant3;

    private TextView dulce4;
    private TextView precio4;
    private EditText cant4;

    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);

        dulce1 = findViewById(R.id.dulce1);
        precio1 = findViewById(R.id.precio1);
        cant1 = findViewById(R.id.cant1);

        dulce2 = findViewById(R.id.dulce2);
        precio2 = findViewById(R.id.precio2);
        cant2 = findViewById(R.id.cant2);

        dulce3 = findViewById(R.id.dulce3);
        precio3 = findViewById(R.id.precio3);
        cant3 = findViewById(R.id.cant3);

        dulce4 = findViewById(R.id.dulce4);
        precio4 = findViewById(R.id.precio4);
        cant4 = findViewById(R.id.cant4);

        resultado = findViewById(R.id.resultado);
    }


    public boolean validar(View view) {
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;

        if (name.getText().toString().equals("")) {
            name.setError("Ingrese un Nombre");
            Toast.makeText(this, "Falta el Nombre del Solicitante", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!cant1.getText().toString().equals("")){
            //Log.d("Dulce1 " + dulce1.getText().toString() + " cantidad: " + cant1.getText().toString() + " precio: " + precio1.getText().toString());
               total1 = Integer.parseInt(cant1.getText().toString()) * Integer.parseInt(precio1.getText().toString());
            //Log.d("Dulce1 ", " total: " + String.valueOf(total1));

            if (!cant2.getText().toString().equals("")) {
                //Log.d("Dulce2 " + dulce2.getText().toString() + " cantidad: " + cant2.getText().toString() + " precio: " + precio2.getText().toString());
                total2 = Integer.parseInt(cant2.getText().toString()) * Integer.parseInt(precio2.getText().toString());
               // Log.d("Dulce2 ", "total: " + String.valueOf(total2));
            }

            if (!cant3.getText().toString().equals("")) {
                //Log.d("Dulce3 " + dulce3.getText().toString() + " cantidad: " + cant3.getText().toString() + " precio: " + precio3.getText().toString());
                total3 = Integer.parseInt(cant3.getText().toString()) * Integer.parseInt(precio3.getText().toString());
                //Log.d("Dulce3", "total: " + String.valueOf(total3));
            }

            if (!cant4.getText().toString().equals("")) {
                //Log.d("Dulce4 " + dulce4.getText().toString() + " cantidad: " + cant4.getText().toString() + " precio: " + precio4.getText().toString());
                total4 = Integer.parseInt(cant4.getText().toString()) * Integer.parseInt(precio4.getText().toString());
                //Log.d("Dulce4", "total: " + String.valueOf(total4));
            }


            int total = total1 + total2 + total3+ total4;
            //Log.d("Totalcito", "total final: " + String.valueOf(total));
            String result = "Resumen \n";
            result = result + "Nombre Solicitante: " + name.getText().toString() + "\n";
            result = result + "Dulce 1: " + dulce1.getText().toString() + " cantidad:" + cant1.getText().toString() + " precio:" + precio1.getText().toString() + "\n";
            result = result + "Total dulce 1: " + total1 + "\n";
            if (!cant2.getText().toString().equals("")) {
                result = result + "Dulce 2: " + dulce2.getText().toString() + " cantidad: " + cant2.getText().toString() + " precio: " + precio2.getText().toString() + "\n";
                result = result + "Total dulce 2: " + total2 + "\n";
            }

            if (!cant3.getText().toString().equals("")){
                result = result + "Dulce 3: " + dulce3.getText().toString() + " cantidad: " + cant3.getText().toString() + " precio: " + precio3.getText().toString() + "\n";
                result = result + "Total dulce 3: " + total3 + "\n";
            }

            if (!cant4.getText().toString().equals("")) {
                result = result + "Dulce 4: " + dulce4.getText().toString() + " cantidad: " + cant4.getText().toString() + " precio: " + precio4.getText().toString() + "\n";
                result = result + "Total dulce 4: " + total4 + "\n";
            }

            result = result + "Total a Pagar: " + total + "\n";
            resultado.setText(result);
            return true;
        } else {
            cant1.setError("Ingrese la Cantidad");
            Toast.makeText(this, "Ingrese la Cantidad del Primer Dulce!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

}