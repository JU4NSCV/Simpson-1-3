# Simpson 1/3
# Objetivos
 - Aplicar los conocimientos sobre funciones de orden superior. - Enviar una función como parámetro
 - Enviar una función como parámetro.
# Descripción
Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese
método estable lo siguiente:

**METODO DE SIMPSON**
 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/1.png)

Donde x = ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/2.png)

## 1. Crear una función con nombre (integracion) que use el método de Simpson para calcular el valor aproximado de cualquier función. 

Codigo de la funcion de integracion implementado en Scala

```Scala
def Integracion (f: Int => Double, a:Int, b:Int): Double = (b-a)*((f(a)+4*f((a+b)/(2))+f(b))/6)
```

Se recomienda analizar lo siguiente:

- El tipo de dato que devolverá la función integracion
   
   La funcion integracion devolvera un Double
   
- ¿Cuáles son los parámetros que recibe la función?
   
   Los parametros recibidos son la funcion que se desea integral mediante el metodo de simpson, a y b que seran enteros

## 2. Aproxima el valor de las siguientes integrales definidas usando la función integracion creada en el paso 1

<details>
 
<summary> PRIMERA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/3.png)
 
Codigo de la funcion implementada en Scala

```Scala
def funInt1 (x:Int): Double = -math.pow(x,2)+8*x-12
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt1,3,5)
```

Resultado

```
7.33333333
```

</details>

<details>
 
<summary> SEGUNDA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/4.png)

Codigo de la funcion implementada en Scala

```Scala
def funInt2 (x:Int): Double = 3*math.pow(x,2)
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt2,0,2)
```

Resultado

```
8.0
```

</details>

<details>
 
<summary> TERCERA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/5.png)

Codigo de la funcion implementada en Scala

```Scala
def funInt3 (x:Int): Double = x+2*math.pow(x,2)-math.pow(x,3)+5*math.pow(x,4)
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt3,-1,1)
```

Resultado

```
4.666666666666667
```

</details>

<details>
 
<summary> CUARTA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/6.png)

Codigo de la funcion implementada en Scala

```Scala
def funInt4 (x:Int): Double = (2*x+1)/(math.pow(x,2)+x)
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt4,1,2)
```

Resultado

```
1.388888888888889
```

</details>

<details>
 
<summary> QUINTA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/7.png)

Codigo de la funcion implementada en Scala

```Scala
def funInt5 (x:Int): Double = -math.exp(x)
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt5,0,1)
```

Resultado

```
-1.286380304743174
```

</details>

<details>
 
<summary> SEXTA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/8.png)

Codigo de la funcion implementada en Scala

```Scala
def funInt6 (x:Int): Double = (1)/(math.sqrt(x-1))
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt6,2,3)
```

Resultado

```
0.9511844635310913
```
</details>

<details>
 
<summary> SEPTIMA INTEGRACION </summary>

**Ecuacion a realizar**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/9.png)

Codigo de la funcion implementada en Scala

```Scala
def funInt7 (x:Int): Double = (1)/(1+math.pow(x,2))
```

Codigo utilizando la funcion de integracion

```Scala
Integracion(funInt7,0,1)
```

Resultado

```
0.9166666666666666
```

</details>

## 3. Calcula el error que se presenta en cada aproximación. El error es igual al valor absoluto de la resta entre el valor esperado y el valor obtenido 

**Formula de calculo de error**

 ![Ecuacion a realizar](https://github.com/JU4NSCV/Simpson-1-3/blob/main/img/10.png)

**Funcion para calcular el error**

```Scala
val Error: (Double,Double)=> Double = (vE:Double, vO:Double) => math.abs(vE - vO)
```

<details>
 
<summary> PRIMERA EVALUACION DE ERROR </summary>

```Scala
def funInt1 (x:Int): Double = -math.pow(x,2)+8*x-12
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt1,3,5),7.33)
```

Codigo del marguen de error

Resultado

```
0.0033333333333329662
```

</details>

<details>
 
<summary> SEGUNDA EVALUACION DE ERROR </summary>

```Scala
def funInt2 (x:Int): Double = 3*math.pow(x,2)
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt2,0,2),8)
```

Codigo del marguen de error

Resultado

```
0.0
```

</details>

<details>
 
<summary> TERCERA EVALUACION DE ERROR </summary>

```Scala
def funInt3 (x:Int): Double = x+2*math.pow(x,2)-math.pow(x,3)+5*math.pow(x,4)
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt3,-1,1),3.333)
```

Codigo del marguen de error

Resultado

```
1.3336666666666668
```

</details>

<details>
 
<summary> CUARTA EVALUACION DE ERROR </summary>

```Scala
def funInt4 (x:Int): Double = (2*x+1)/(math.pow(x,2)+x)
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt4,1,2),1.09861)
```

Codigo del marguen de error

Resultado

```
0.290278888888889
```
</details>

<details>
 
<summary> QUINTA EVALUACION DE ERROR </summary>

```Scala
def funInt5 (x:Int): Double = -math.exp(x)
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt5,0,1),1.71828)
```

Codigo del marguen de error

Resultado

```
3.004660304743174
```

</details>

<details>
 
<summary> SEXTA EVALUACION DE ERROR </summary>

```Scala
def funInt6 (x:Int): Double = (1)/(math.sqrt(x-1))
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt6,2,3),0.828427)
```

Codigo del marguen de error

Resultado

```
0.1227574635310913
```

</details>

<details>
 
<summary> SEPTIMA EVALUACION DE ERROR </summary>

```Scala
def funInt7 (x:Int): Double = (1)/(1+math.pow(x,2))
```

Codigo de la funcion implementada en Scala

```Scala
Error(Integracion(funInt7,0,1),0.785398)
```

Codigo del marguen de error

Resultado

```
0.1312686666666666
```

</details>
