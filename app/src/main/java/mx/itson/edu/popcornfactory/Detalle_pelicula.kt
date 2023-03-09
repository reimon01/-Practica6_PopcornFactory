package mx.itson.edu.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Detalle_pelicula : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val iv_pelicula_imagen: ImageView = findViewById(R.id.iv_pelicula_imagen)
        val tv_nombre_pelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
        val tv_pelicula_desc: TextView = findViewById(R.id.tv_pelicula_desc)
        val seatLeft: TextView = findViewById(R.id.seatLeft)

        val bundle = intent.extras

        if(bundle != null){
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("titulo"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))
            seatLeft.setText(bundle.getInt("numberSeats").toString())
        }

        var button: Button = findViewById(R.id.buyTickets)

        button.setOnClickListener{
            var intento = Intent(this,SeatSelection::class.java)
            this.startActivity(intento)
        }
    }
}