/**
 * Funció que calcula i retorna el factorial d'un número natural n donat usant un bucle for iteratiu
 * @author RIS
 * @param n Valor enter natural pel qual se'n vol calcular el factorial
 */
fun factorialIteratiu(n: Int): Int {
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
fun factorialRecursiuIf(n: Int): Int {
    // La variable resultatParcial va acumulant els resultats parcials
    var resultatParcial: Int

    if (n <= 1) // Cas base 0
        resultatParcial = 1
    else // Cas recursiu
        resultatParcial = n * factorialRecursiu(n - 1)

    return resultatParcial
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
        else -> resultatParcial = n * factorialRecursiu(n - 1) // Cas recursiu
    }

    return resultatParcial
}

/**
 * Funció que calcula la divisió entera entre dos nombres naturals
 * a partir de calcular quantes vegades hi cap el denominador dins del numerador.
 * Contarem quants cops hi cap el divisor dins del numerador
 * @param numerador valor enter natural > 0
 * @param divisor valor enter natural > numerador
 * @author RIS
 */
fun divisioEnteraPositivaRecursiva(numerador: Int, divisor: Int): Int{
    var resultat: Int

    if (divisor > numerador) // Cas base
        resultat = 0
    else // Cas recursiu
        resultat = 1 + divisioEnteraPositivaRecursiva(numerador - divisor, divisor)

    return resultat
}

/**
 * Funció que calcula la multiplicació entre dos valors enters naturals
 * a partir de sumar a amb sí mateixa b vegades.
 * @param a enter natural
 * @param b enter natural
 * @author RIS
 */
fun multiplicacioPositivaRecursiva(a: Int, b: Int): Int{
    var resultat: Int = 0

    if (b == 0) // Case base
        resultat = 0
    else // Cas recursiu
        resultat = a + multiplicacioPositivaRecursiva(a, b - 1)

    return resultat
}