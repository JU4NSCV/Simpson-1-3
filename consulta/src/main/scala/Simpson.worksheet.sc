def funInt1 (x:Int): Double = -math.pow(x,2)+8*x-12

def funInt2 (x:Int): Double = 3*math.pow(x,2)

def funInt3 (x:Int): Double = x+2*math.pow(x,2)-math.pow(x,3)+5*math.pow(x,4)

def funInt4 (x:Int): Double = (2*x+1)/(math.pow(x,2)+x)

def funInt5 (x:Int): Double = -math.exp(x)

def funInt6 (x:Int): Double = (1)/(math.sqrt(x-1))

def funInt7 (x:Int): Double = (1)/(1+math.pow(x,2))

def Integracion (f: Int => Double, a:Int, b:Int): Double = (b-a)*((f(a)+4*f((a+b)/(2))+f(b))/6)

Integracion(funInt1,3,5)

Integracion(funInt2,0,2)

Integracion(funInt3,-1,1)

Integracion(funInt4,1,2)

Integracion(funInt5,0,1)

Integracion(funInt6,2,3)

Integracion(funInt7,0,1)

val Error: (Double,Double)=> Double = (vE:Double, vO:Double) => math.abs(vE - vO)

Error(Integracion(funInt1,3,5),7.33)

Error(Integracion(funInt2,0,2),7.33)

Error(Integracion(funInt3,-1,1),7.33)

Error(Integracion(funInt4,1,2),7.33)

Error(Integracion(funInt5,0,1),7.33)

Error(Integracion(funInt6,2,3),7.33)

Error(Integracion(funInt7,0,1),7.33)