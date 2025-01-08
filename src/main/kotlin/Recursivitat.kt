/**
 * Funció entry point per a l'execució dels mètodes que calculen el factorial
 * @author RIS
 */
fun main() {
    var n: Int

    n = readln().toInt()

    println(factorialRecursiu(n))
    println(factorialIteratiu(n))
}

/**
 * Funció que calcula i retorna el factorial d'un número natural n donat usant un bucle for iteratiu
 * @author RIS
 * @param n Valor enter natural pel qual se'n vol calcular el factorial
 */
fun factorialIteratiu(n: Int): Int{
    var resultat: Int = 1

    for (i in 1..n)
        resultat = resultat * i

    return resultat
}
/**
 * Funció que calcula i retorna el factorial d'un número natural n donat usant una funció recursiva
 * @author RIS
 * @param n Valor enter natural pel qual se'n vol calcular el factorial
 */
fun factorialRecursiu(n: Int): Int {
    // La variable resultatParcial va acumulant els resultats parcials
    var resultatParcial: Int

    when (n) {
        0 -> resultatParcial = 1 // Cas base 0
        1 -> resultatParcial = 1 // Case base 1
        else -> resultatParcial = n * factorialRecursiu(n - 1)  // Cas recursiu
    }

    return resultatParcial
}
