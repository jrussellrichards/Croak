package com.example.javier.tarea1;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView[] arreglo = new ImageView[9];
    String[] posicion= new String[9];






    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView e1= (ImageView)findViewById(R.id.espacio1);
        ImageView e2= (ImageView)findViewById(R.id.espacio2);
        ImageView e3= (ImageView)findViewById(R.id.espacio3);
        ImageView e4= (ImageView)findViewById(R.id.espacio4);
        ImageView e5= (ImageView)findViewById(R.id.espacio5);
        ImageView e6= (ImageView)findViewById(R.id.espacio6);
        ImageView e7= (ImageView)findViewById(R.id.espacio7);
        ImageView e8= (ImageView)findViewById(R.id.espacio8);
        ImageView e9= (ImageView)findViewById(R.id.espacio9);
        Button boton = (Button) findViewById(R.id.button);

/*Guardo las vistas*/
        arreglo[0]=e1;
        arreglo[1]=e2;
        arreglo[2]=e3;
        arreglo[3]=e4;
        arreglo[4]=e5;
        arreglo[5]=e6;
        arreglo[6]=e7;
        arreglo[7]=e8;
        arreglo[8]=e9;
        /*Acá guardo string para saber si hay un sapito, rana o está vacío*/
        posicion[0]="R";
        posicion[1]="R";
        posicion[2]="R";
        posicion[3]="R";
        posicion[4]="V";
        posicion[5]="S";
        posicion[6]="S";
        posicion[7]="S";
        posicion[8]="S";


        final MediaPlayer ms = MediaPlayer.create(this, R.raw.sapo);
        final MediaPlayer mr = MediaPlayer.create(this, R.raw.rana);
        final MediaPlayer musica = MediaPlayer.create(this, R.raw.musica);





        musica.start();



        arreglo[0].setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            if(posicion[0]=="S"){
                ms.start();

            }

            if(posicion[0]=="R"){
                mr.start();

            }
            revisar();
            mover(0);
            ganar();



        }
    });

        arreglo[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(posicion[1]=="S"){
                    ms.start();

                }

                if(posicion[1]=="R"){
                    mr.start();

                }
                revisar();
                mover(1);
                ganar();



            }
        });

        arreglo[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(posicion[2]=="S"){
                    ms.start();

                }

                if(posicion[2]=="R"){
                    mr.start();

                }
                revisar();
                mover(2);
                ganar();



            }
        });

        arreglo[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(posicion[3]=="S"){
                    ms.start();

                }

                if(posicion[3]=="R"){
                    mr.start();

                }
                revisar();
                mover(3);
                ganar();



            }
        });

        arreglo[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(posicion[4]=="S"){
                    ms.start();

                }

                if(posicion[4]=="R"){
                    mr.start();

                }
                revisar();
                mover(4);
                ganar();



            }
        });

        arreglo[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(posicion[5]=="S"){
                    ms.start();

                }

                if(posicion[5]=="R"){
                    mr.start();

                }
                revisar();
                mover(5);
                ganar();



            }
        });

        arreglo[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(posicion[6]=="S"){
                    ms.start();

                }

                if(posicion[6]=="R"){
                    mr.start();

                }
                revisar();
                mover(6);
                ganar();



            }
        });

        arreglo[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(posicion[7]=="S"){
                    ms.start();

                }

                if(posicion[7]=="R"){
                    mr.start();

                }

                revisar();
                mover(7);
                ganar();



            }
        });

        arreglo[8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if(posicion[7]=="S"){
                    ms.start();

                }

                if(posicion[7]=="R"){
                    mr.start();

                }

                revisar();
                mover(8);
                ganar();


            }
        });



        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Guardo las vistas*/

        /*Acá guardo string para saber si hay un sapito, rana o está vacío*/
                posicion[0]="R";
                posicion[1]="R";
                posicion[2]="R";
                posicion[3]="R";
                posicion[4]="V";
                posicion[5]="S";
                posicion[6]="S";
                posicion[7]="S";
                posicion[8]="S";

                arreglo[0].setImageResource(R.drawable.ranita );
                arreglo[1].setImageResource(R.drawable.ranita );
                arreglo[2].setImageResource(R.drawable.ranita );
                arreglo[3].setImageResource(R.drawable.ranita );

                arreglo[5].setImageResource(R.drawable.sapito );
                arreglo[6].setImageResource(R.drawable.sapito );
                arreglo[7].setImageResource(R.drawable.sapito );
                arreglo[8].setImageResource(R.drawable.sapito );

                arreglo[0].setVisibility(View.VISIBLE);
                arreglo[1].setVisibility(View.VISIBLE);
                arreglo[2].setVisibility(View.VISIBLE);
                arreglo[3].setVisibility(View.VISIBLE);
                arreglo[4].setVisibility(View.INVISIBLE);
                arreglo[5].setVisibility(View.VISIBLE);
                arreglo[6].setVisibility(View.VISIBLE);
                arreglo[7].setVisibility(View.VISIBLE);
                arreglo[8].setVisibility(View.VISIBLE);






            }
        });






        }

    public void revisar(){
        if(haveMoves()==false){
            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Lo siento,perdiste", Toast.LENGTH_SHORT);

            toast1.show();
        }
    }
    boolean haveMoves(){
        for(int i=0;i<8;i++){

            if(posicion[i]=="S"){
                if( ((i-1) >= 0 && posicion[i-1]=="V") || ((i-2) >= 0 && posicion[i-2]=="V")){
                    return true;
                }
            }
            if(posicion[i]=="R"){
                if( ((i+1) <= 8 && posicion[i+1]=="V") || ((i+2) <= 8 && posicion[i+2]=="V")){
                    return true;
                }
            }

        }
        return false;
    }

    public void ganar(){
        if(posicion[0]=="S" && posicion[1]=="S" && posicion[2]=="S" && posicion[3]=="S" &&posicion[8]=="R" && posicion[7]=="R" && posicion[6]=="R" && posicion[5]=="R"){

            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Felicidades, has ganado!", Toast.LENGTH_SHORT);

            toast1.show();
        }
    }



    public void mover(int i){

        if(i==8 && posicion[i]=="R"){

            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Movimiento Inválido", Toast.LENGTH_SHORT);

            toast1.show();


        }

        if(i==0 && posicion[i]=="S"){

            Toast toast1 =
                    Toast.makeText(getApplicationContext(),
                            "Movimiento Inválido", Toast.LENGTH_SHORT);

            toast1.show();


        }
/*Salto de ranita*/
        if(i!=7 && i!=8 && posicion[i]=="R") {
        if(posicion[i]=="R" && posicion[i+2]=="V" && posicion[i+1]!="V" ){





            arreglo[i+2].setImageResource(R.drawable.ranita );
            arreglo[i].setVisibility(View.INVISIBLE);
            arreglo[i+2].setVisibility(View.VISIBLE);
            posicion[i]="V";
            posicion[i+2]="R";


        }}
/*Salto de Sapito*/
        if(i!=0 && i!=1 && posicion[i]=="S"){
        if(posicion[i]=="S" && posicion[i-2]=="V" && posicion[i-1]!="V"){


            arreglo[i-2].setImageResource(R.drawable.sapito );
            arreglo[i].setVisibility(View.INVISIBLE);
            arreglo[i-2].setVisibility(View.VISIBLE);
            posicion[i]="V";
            posicion[i-2]="S";
        }}
/*Movimiento sapito*/if(i!=0){


        if(posicion[i]=="S" && posicion[i-1]=="V"){

            arreglo[i-1].setImageResource(R.drawable.sapito );
            arreglo[i].setVisibility(View.INVISIBLE);
            arreglo[i-1].setVisibility(View.VISIBLE);
            posicion[i]="V";
            posicion[i-1]="S";
        }}
/*Movimiento Ranita*/
        if(i!=8){
        if(posicion[i]=="R" && posicion[i+1]=="V"){



            arreglo[i+1].setImageResource(R.drawable.ranita );
            arreglo[i].setVisibility(View.INVISIBLE);
            arreglo[i+1].setVisibility(View.VISIBLE);
            posicion[i]="V";
            posicion[i+1]="R";}}






    }

}
