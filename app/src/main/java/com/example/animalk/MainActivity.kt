package com.example.animalk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.animalk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding : ActivityMainBinding
    var isDog = false
    var isCat = false
    var isCow = false
    var animal = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }
    private fun initClicker(){
        with(binding){
            dogBtn.setOnClickListener{
                isDog= true
                isCat=false
                isCow=false
                animal ="dog"
                animalImg.setImageResource(R.drawable.dog)
            }
            catBtn.setOnClickListener{
                isCat = true
                isDog = false
                isCow = false
                animal = "cat"
                animalImg.setImageResource(R.drawable.cat)
            }
            cowBtn.setOnClickListener{
                isCow =true
                isDog= false
                isCat = false
                animal = "cow"
               animalImg.setImageResource(R.drawable.cow)
            }


            thatDog.setOnClickListener {
                if (isDog) {
                    Toast.makeText(applicationContext, "верно", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext, " не верно", Toast.LENGTH_SHORT).show()
                }
            }

           thatCat.setOnClickListener {
                if (isCat) {
                    Toast.makeText(applicationContext, "верно", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext, " не верно", Toast.LENGTH_SHORT).show()
                }

            }

            thatCow.setOnClickListener {
                if (isCow) {
                    Toast.makeText(applicationContext, "верно", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext, " не верно", Toast.LENGTH_SHORT).show()
                }

            }

            resultBtn.setOnClickListener{
                val intent = Intent(this@MainActivity,ResultActivity::class.java)
                intent.putExtra("key",animal)
                startActivity(intent)
            }

        }

    }
}