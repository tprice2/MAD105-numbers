/*Pseudocode:

Variables: itemTotal, taxTotal, total, tip, taxPercent, tipPercent
printItemTotal, printTaxTotal, printTotal, printTip, itemInput

Process:
Initialize all of the variables
Set the formats of the pertinent variables to have $, comma separated values, and two decimals points.
Ask the user to enter the cost of an item.
Calculate the variable itemTotal by adding the user-typed value to the previous total.
Calculate the taxTotal by multiplying the user input by the taxPercent constant, and adding to the previous total.
Calculate the total by adding the itemTotal and taxTotal.
Calculate the tip by multiplying the total by the tipPercent constant.
If the entered value is 0, print all of the totals and then exit the program.

*/
import java.text.DecimalFormat

fun main()
{
    var itemTotal = 0.00
    var taxTotal = 0.00
    var total = 0.00
    var tip = 0.00
    val taxPercent = .025
    val tipPercent = .175
    do {

        val format = DecimalFormat("$###,###,###.00")
        val printItemTotal =  format.format(itemTotal)
        val printTaxTotal =  format.format(taxTotal)
        val printTotal =  format.format(total)
        val printTip =  format.format(tip)
        print("Please enter the cost of an item or press 0 to exit:\n")
        val itemInput = readLine()!!.toDouble()
        itemTotal = (itemTotal + itemInput)
        taxTotal = (taxTotal + itemInput*taxPercent)
        total = (itemTotal + taxTotal)
        tip = (tipPercent * total)

        if (itemInput == 0.00){
            println("Total item cost: $printItemTotal")
            println("Total taxes cost: $printTaxTotal")
            println("Total: $printTotal")
            println("Recommended tip (17.5%): $printTip")
        }
    }
    while(itemInput != 0.00)
}

