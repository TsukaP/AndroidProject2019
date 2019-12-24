package jp.co.tsuka.androidproject2019.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import jp.co.tsuka.androidproject2019.R
import jp.co.tsuka.androidproject2019.databinding.ActivityMainBinding
import jp.co.tsuka.androidproject2019.di.module.ViewModelFactory
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(MainViewModel::class.java)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            viewModel = this@MainActivity.viewModel
        }
    }
}
