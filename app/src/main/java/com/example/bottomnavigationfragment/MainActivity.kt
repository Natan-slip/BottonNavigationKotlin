package com.example.bottomnavigationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    //Botões
    lateinit var btnHome: Button
    lateinit var btnCliente: Button
    lateinit var btnBusca: Button

    // Fragmentos
    lateinit var homeFragment: HomeFragment
    lateinit var clienteFragment: ClienteFragment
    lateinit var buscaFragment: BuscaFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBusca = findViewById(R.id.btn_busca)
        btnCliente = findViewById(R.id.btn_cliente)
        btnHome = findViewById(R.id.btn_home)

        buscaFragment = BuscaFragment()
        clienteFragment = ClienteFragment()
        homeFragment = HomeFragment()

        btnHome.setOnClickListener {
            setFragment(homeFragment)
        }

        btnCliente.setOnClickListener {
            setFragment(clienteFragment)
        }

        btnBusca.setOnClickListener {
            setFragment(buscaFragment)
        }
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragment)
        fragmentTransaction.commit()
    }
}