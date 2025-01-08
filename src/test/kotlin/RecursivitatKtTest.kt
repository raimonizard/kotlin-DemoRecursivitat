import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertIs

class RecursivitatKtTest {
    // Nombre natural n a usar a dins de cada test
    var n: Int = 0

    /**
     * Aquesta funció s'executarà cada cop just abans de cada funció de @Test
     */
    @BeforeEach
    fun setUp() {
        n = 5
    }

    /**
     * Funció de test que comprova que les funcions retornin un valor
     */
    @Test
    fun factorialsRetornNotNull() {
        // Comprovem que la funcions retornen algun valor (del tipus que sigui)
        assertNotNull(factorialIteratiu(n))
        assertNotNull(factorialRecursiu(n))
    }

    /**
     * Funció que comprova si el retorn és de tipus enter.
     * Aquest test es considera redundant ja que el propi compilador de kotlin comprovarà el tipus de dades
     * de la variable de retorn abans d'executar el programa.
     */
    @Test
    fun factorialsRetornInt(){
        assertIs<Int>(factorialIteratiu(n))
        assertIs<Int>(factorialRecursiu(n))
    }

    /**
     * Comprovem el valor que retorna la funció factorialIteratiu()
     */
    @Test
    fun factorialIteratiuCalcul() {
        // Assumim que el resultat que ens dona la funció recursiva és correcte.
        var valorEsperat: Int = factorialRecursiu(n)

        // Comprovem que el factorial de n comprovat recursivament és igual al calculat iterativament
        assertEquals(valorEsperat, factorialIteratiu(n))
    }

    /**
     * Comprovem el valor que retorna la funció factorialRecursiu()
     */
    @Test
    fun factorialRecursiuCalcul() {
        // Assumim que el resultat que ens dona la funció iterativa és correcte.
        var valorEsperat: Int = factorialIteratiu(n)

        // Comprovem que el factorial de n comprovat iterativament és igual al calculat recursivament
        assertEquals(valorEsperat, factorialRecursiu(n))
    }

    /**
     * Comprovem el valor que retorna la funció factorialRecursiu()
     */
    @Test
    fun factorialRecursiuIfCalcul() {
        // Assumim que el resultat que ens dona la funció iterativa és correcte.
        var valorEsperat: Int = factorialRecursiu(n)

        // Comprovem que el factorial de n comprovat iterativament és igual al calculat recursivament
        assertEquals(valorEsperat, factorialRecursiuIf(n))
    }
}