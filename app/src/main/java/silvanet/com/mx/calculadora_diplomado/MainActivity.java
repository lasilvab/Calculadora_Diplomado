package silvanet.com.mx.calculadora_diplomado;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean punto_decimal = false;
    boolean oper_divide = false;
    boolean oper_multiplica = false;
    boolean oper_resta = false;
    boolean oper_suma = false;
    boolean oper_mod = false;
    String cadena1 = "", cadena2 = "";
    double number1=0, number2=0, resultado=0;
    boolean operacion_realizada = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botones numéricos
        Button btn0 = (Button)  findViewById(R.id.btn0);
        Button btn1 = (Button)  findViewById(R.id.btn1);
        Button btn2 = (Button)  findViewById(R.id.btn2);
        Button btn3 = (Button)  findViewById(R.id.btn3);
        Button btn4 = (Button)  findViewById(R.id.btn4);
        Button btn5 = (Button)  findViewById(R.id.btn5);
        Button btn6 = (Button)  findViewById(R.id.btn6);
        Button btn7 = (Button)  findViewById(R.id.btn7);
        Button btn8 = (Button)  findViewById(R.id.btn8);
        Button btn9 = (Button)  findViewById(R.id.btn9);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        Button btnpunto = (Button) findViewById(R.id.btnpunto);
        Button btnigual = (Button) findViewById(R.id.btnigual);
        btnpunto.setOnClickListener(this);
        btnigual.setOnClickListener(this);

        // Botones de operaciones
        Button btndivide = (Button)  findViewById(R.id.btndivide);
        Button btnmultiplica = (Button)  findViewById(R.id.btnmultiplica);
        Button btnresta = (Button)  findViewById(R.id.btnresta);
        Button btnsuma = (Button)  findViewById(R.id.btnsuma);
        Button btnmod = (Button)  findViewById(R.id.btnmod);
        btndivide.setOnClickListener(this);
        btnmultiplica.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnmod.setOnClickListener(this);

        //Botones especiales
        Button btnborrar = (Button) findViewById(R.id.btnborrar);
        Button btnac = (Button)  findViewById(R.id.btnac);
        Button btndecimal = (Button)  findViewById(R.id.btndecimal);
        Button btnbinario = (Button)  findViewById(R.id.btnbinario);
        btnborrar.setOnClickListener(this);
        btnac.setOnClickListener(this);
        btndecimal.setOnClickListener(this);
        btnbinario.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        TextView display = (TextView) findViewById(R.id.display);
        int seleccion = v.getId();
        String datodisplay = display.getText().toString();

        if (operacion_realizada) {
            display.setText("");
            //operacion_realizada = false;
        }

        switch (seleccion) {
            case R.id.btn0:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "0";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "0";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn1:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "1";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "1";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn2:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "2";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "2";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn3:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "3";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "3";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn4:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "4";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "4";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn5:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "5";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "5";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn6:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "6";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "6";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn7:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "7";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "7";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn8:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "8";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "8";
                    display.setText(datodisplay);
                }
                break;
            case R.id.btn9:
                if (operacion_realizada) {
                    display.setText("");
                    datodisplay = "9";
                    display.setText(datodisplay);
                    operacion_realizada = false;
                }else {
                    datodisplay = datodisplay + "9";
                    display.setText(datodisplay);
                }
                break;

            //Boton punto
            case R.id.btnpunto:
                if(punto_decimal == false) {
                    if (!operacion_realizada) {
                        datodisplay = datodisplay + ".";
                        display.setText(datodisplay);
                        punto_decimal = true;
                    }
                    else {return;}
                }else {return;}
                break;

            //Boton Igual
            case R.id.btnigual:
                if (!cadena1.isEmpty()) {
                    number2 = Double.parseDouble(datodisplay);
                    cadena2 = datodisplay;
                    if (!cadena2.isEmpty()) {
                        if (oper_suma) {
                            resultado = number1 + number2;
                            display.setText(String.valueOf(resultado));
                        } else if (oper_resta) {
                            resultado = number1 - number2;
                            display.setText(String.valueOf(resultado));
                        } else if (oper_multiplica) {
                            resultado = number1 * number2;
                            display.setText(String.valueOf(resultado));
                        } else if (oper_divide) {
                            resultado = number1 / number2;
                            display.setText(String.valueOf(resultado));
                        } else if (oper_mod) {
                            resultado = number1 % number2;
                            display.setText(String.valueOf(resultado));
                        }
                        punto_decimal = false;
                        oper_suma = false;
                        oper_resta = false;
                        oper_multiplica = false;
                        oper_divide = false;
                        oper_mod = false;
                        operacion_realizada = true;
                        cadena1 = "";
                        cadena2 = "";
                    }
                }

                break;

            //Operaciones
            case R.id.btnmultiplica:
                if(datodisplay.isEmpty())
                {
                    //Aqí va el toast
                    Toast.makeText(getApplicationContext(), "Falta operando", Toast.LENGTH_SHORT).show();
                }
                else {
                    cadena1 = datodisplay;
                    if (!cadena1.isEmpty()) {
                        oper_multiplica = true;
                        number1 = Double.parseDouble(datodisplay);
                        display.setText("");
                        punto_decimal = false;
                    }
                }
                break;
            case R.id.btndivide:
                if(datodisplay.isEmpty())
                {
                    //Aqí va el toast
                    Toast.makeText(getApplicationContext(), "Falta operando", Toast.LENGTH_SHORT).show();
                }
                else {
                    cadena1 = datodisplay;
                    if (!cadena1.isEmpty()) {
                        oper_divide = true;
                        number1 = Double.parseDouble(datodisplay);
                        display.setText("");
                        punto_decimal = false;
                    }
                }
                break;
            case R.id.btnresta:
                if(datodisplay.isEmpty())
                {
                    //Aqí va el toast
                    Toast.makeText(getApplicationContext(), "Falta operando", Toast.LENGTH_SHORT).show();
                }
                else {
                    cadena1 = datodisplay;
                    if (!cadena1.isEmpty()) {
                        oper_resta = true;
                        number1 = Double.parseDouble(datodisplay);
                        display.setText("");
                        punto_decimal = false;
                    }
                }
                break;
            case R.id.btnsuma:
                if(datodisplay.isEmpty())
                {
                    //Aqí va el toast
                    Toast.makeText(getApplicationContext(), "Falta operando", Toast.LENGTH_SHORT).show();
                }
                else {
                    cadena1 = datodisplay;
                    if (!cadena1.isEmpty()) {
                        oper_suma = true;
                        number1 = Double.parseDouble(datodisplay);
                        display.setText("");
                        punto_decimal = false;
                    }
                }
                break;
            case R.id.btnmod:
                if(datodisplay.isEmpty())
                {
                    //Aqí va el toast
                    Toast.makeText(getApplicationContext(), "Falta operando", Toast.LENGTH_SHORT).show();
                }
                else {
                    cadena1 = datodisplay;
                    if (!cadena1.isEmpty()) {
                        oper_mod = true;
                        number1 = Double.parseDouble(datodisplay);
                        display.setText("");
                        punto_decimal = false;
                    }
                }
                break;
            case R.id.btnborrar:

                break;
            case R.id.btnac:
                display.setText("");
                punto_decimal = false;
                break;
            case R.id.btndecimal:
                break;
            case R.id.btnbinario:
                break;


        }

    }
}

