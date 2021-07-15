package com.glenjarvis.rothgar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial


private const val ATTACK_LIMIT = 20
private const val DAMAGE_LIMIT = 8
private const val DAMAGE_LIMIT_2 = 6

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val baseEt: EditText = findViewById(R.id.base_et)
        baseEt.setText(20.toString())

        val iterEt: EditText = findViewById(R.id.iter_et)
        iterEt.setText(15.toString())

        val calculateButton: Button = findViewById(R.id.buttn_calculate)
        calculateButton.setOnClickListener { calculate() }

    }

    private fun randNumber(limit: Int):Int {
        return (1..limit).random()
    }

    private fun attackOne(){
        val randNum = randNumber(ATTACK_LIMIT)
        // Retrieves base value
        val base: EditText = findViewById(R.id.base_et)
        val baseValue: Int = base.getText().toString().toInt()
        // Calculates the total
        val calculation = randNum + baseValue
        // Changes the TextView to total
        val attackView: TextView = findViewById(R.id.attack_total_1)
        attackView.setText(calculation.toString())

        val calculationString:String = "$randNum + $baseValue = $calculation"
        // Changes the Text View to display calculation
        val calcLabel: TextView = findViewById(R.id.attack_calculation_1)
        calcLabel.setText(calculationString)
    }

    private fun damageOne(){
        // Random numbers with respective limits
        val firstRand = randNumber(DAMAGE_LIMIT)
        val secondRand = randNumber(DAMAGE_LIMIT_2)
        val thirdRand = randNumber(DAMAGE_LIMIT_2)
        // Reference to text views
        val damageOneTextView: TextView = findViewById(R.id.damage_calculation_top_1)
        val damageTwoTextView: TextView = findViewById(R.id.damage_calculation_bottom_1)
        val damage: TextView = findViewById(R.id.damage_total_1)
        val switch: SwitchMaterial = findViewById(R.id.gb_mode_switch)
        // String Calculations
        val stringCalculationOne = "$firstRand + 3 = ${firstRand+3}"
        val stringCalculationTwo = "$secondRand + $thirdRand + 3 = ${thirdRand+secondRand+3}"
        // Set the text for damage calculations
        damageOneTextView.setText(stringCalculationOne)
        damageTwoTextView.setText(stringCalculationTwo)

        // GB Mode conditional
        if (!switch.isChecked) {
            damage.setText((firstRand + 3).toString())
        } else {
            damage.setText((secondRand + thirdRand + 3).toString())
        }
    }

    private fun attackTwo(){
        val randNum = randNumber(ATTACK_LIMIT)
        // Retrieves base value
        val iter: EditText = findViewById(R.id.iter_et)
        val iterValue: Int = iter.getText().toString().toInt()
        // Calculates the total
        val calculation = randNum + iterValue
        // Changes the TextView to total
        val attackView: TextView = findViewById(R.id.attack_total_2)
        attackView.setText(calculation.toString())

        val calculationString:String = "$randNum + $iterValue = $calculation"
        // Changes the Text View to display calculation
        val calcLabel: TextView = findViewById(R.id.attack_calculation_2)
        calcLabel.setText(calculationString)
    }

    private fun damageTwo(){
        // Random numbers with respective limits
        val firstRand = randNumber(DAMAGE_LIMIT)
        val secondRand = randNumber(DAMAGE_LIMIT_2)
        val thirdRand = randNumber(DAMAGE_LIMIT_2)
        // Reference to text views
        val damageOneTextView: TextView = findViewById(R.id.damage_calculation_top_2)
        val damageTwoTextView: TextView = findViewById(R.id.damage_calculation_bottom_2)
        val damage: TextView = findViewById(R.id.damage_total_2)
        val switch: SwitchMaterial = findViewById(R.id.gb_mode_switch)
        // String Calculations
        val stringCalculationOne = "$firstRand + 3 = ${firstRand+3}"
        val stringCalculationTwo = "$secondRand + $thirdRand + 3 = ${thirdRand+secondRand+3}"
        // Set the text for damage calculations
        damageOneTextView.setText(stringCalculationOne)
        damageTwoTextView.setText(stringCalculationTwo)

        // GB Mode conditional
        if (!switch.isChecked) {
            damage.setText((firstRand + 3).toString())
        } else {
            damage.setText((secondRand + thirdRand + 3).toString())
        }
    }

    private fun attackThree(){
        val randNum = randNumber(ATTACK_LIMIT)
        // Retrieves base value
        val base: EditText = findViewById(R.id.base_et)
        val baseValue: Int = base.getText().toString().toInt()
        // Calculates the total
        val calculation = randNum + baseValue
        // Changes the TextView to total
        val attackView: TextView = findViewById(R.id.attack_total_3)
        attackView.setText(calculation.toString())

        val calculationString:String = "$randNum + $baseValue = $calculation"
        // Changes the Text View to display calculation
        val calcLabel: TextView = findViewById(R.id.attack_calculation_3)
        calcLabel.setText(calculationString)
    }

    private fun damageThree(){
        // Random numbers with respective limits
        val firstRand = randNumber(DAMAGE_LIMIT)
        val secondRand = randNumber(DAMAGE_LIMIT_2)
        val thirdRand = randNumber(DAMAGE_LIMIT_2)
        // Reference to text views
        val damageOneTextView: TextView = findViewById(R.id.damage_calculation_top_3)
        val damageTwoTextView: TextView = findViewById(R.id.damage_calculation_bottom_3)
        val damage: TextView = findViewById(R.id.damage_total_3)
        val switch: SwitchMaterial = findViewById(R.id.gb_mode_switch)
        // String Calculations
        val stringCalculationOne = "$firstRand + 3 = ${firstRand+3}"
        val stringCalculationTwo = "$secondRand + $thirdRand + 3 = ${thirdRand+secondRand+3}"
        // Set the text for damage calculations
        damageOneTextView.setText(stringCalculationOne)
        damageTwoTextView.setText(stringCalculationTwo)

        // GB Mode conditional
        if (!switch.isChecked) {
            damage.setText((firstRand + 3).toString())
        } else {
            damage.setText((secondRand + thirdRand + 3).toString())
        }
    }

    fun calculate(){
        attackOne()
        damageOne()
        attackTwo()
        damageTwo()
        attackThree()
        damageThree()
    }

}

