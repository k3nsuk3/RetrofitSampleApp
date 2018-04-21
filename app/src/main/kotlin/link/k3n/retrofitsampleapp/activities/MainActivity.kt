package link.k3n.retrofitsampleapp.activities

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import link.k3n.retrofitsampleapp.R
import link.k3n.retrofitsampleapp.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
        binding.button.setOnClickListener(this::runProcess)
    }

    private fun runProcess(v: View) {
        Timber.d("Button clicked!")
    }
}
