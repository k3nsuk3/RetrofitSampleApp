package link.k3n.retrofitsampleapp.activities

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import link.k3n.retrofitsampleapp.R
import link.k3n.retrofitsampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
    }
}
