package raha.test.lableview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import raha.test.lableview.databinding.ActivityMainBinding

// 1.add label view dependency and jitPack repository
// 2.add the label you want in xml file (labelButtonView, labelImageView, labelTextView)

class MainActivity : AppCompatActivity() {

    //1
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}