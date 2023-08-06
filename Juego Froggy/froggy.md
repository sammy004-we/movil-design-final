

# Resumen del documento de Flexbox y comparación con cada uno de los niveles del juego Froggy

## Resumen


En React Native, Flexbox funciona de manera similar a como lo hace en CSS en la web, pero con algunas diferencias en los valores predeterminados de las propiedades. Por ejemplo, flexDirection tiene un valor predeterminado de column en lugar de row, alignContent tiene un valor predeterminado de flex-start en lugar de stretch, y flexShrink tiene un valor predeterminado de 0 en lugar de 1.
La propiedad flex determina cómo los elementos se distribuyen en el espacio disponible a lo largo del eje principal. Se divide el espacio según la propiedad flex de cada elemento. Por ejemplo, si hay tres elementos con flex: 1, flex: 2 y flex: 3, respectivamente, se distribuirá el espacio en proporción a estos valores.

FlexDirection controla la dirección en la que se colocan los elementos secundarios dentro de un contenedor. Puede tener los valores de column, row, column-reverse y row-reverse para especificar diferentes direcciones. Otras propiedades como justifyContent, alignItems, alignSelf y alignContent se utilizan para alinear los elementos a lo largo del eje principal o del eje cruzado.

También la documentación abarca estos conceptos:

**Layout Direction:** React Native admite tanto el diseño de izquierda a derecha (LTR) como el diseño de derecha a izquierda (RTL). El diseño LTR es el valor predeterminado y se utiliza para alinear el texto y los elementos de izquierda a derecha. El diseño RTL se utiliza en idiomas como el árabe o el hebreo, donde el texto y los elementos se alinean de derecha a izquierda.

**Justify Content:** Esta propiedad se utiliza para alinear los elementos a lo largo del eje principal del contenedor. Puede tener valores como flex-start, flex-end, center, space-between y space-around. Estos valores determinan cómo se distribuye el espacio disponible entre los elementos o alrededor de ellos.

**Align Items:** Similar a justifyContent, alignItems se utiliza para alinear los elementos a lo largo del eje cruzado del contenedor. Puede tener valores como stretch, flex-start, flex-end, center y baseline. Estos valores determinan cómo se alinean verticalmente los elementos dentro del contenedor.

**Align Self:** Esta propiedad se aplica a un elemento individual dentro de un contenedor y anula cualquier valor establecido por la propiedad alignItems del contenedor. Permite alinear un elemento específico de manera diferente a los demás elementos del contenedor.

**Align Content:** Se utiliza para alinear las líneas de elementos a lo largo del eje cruzado cuando se produce el ajuste de línea (wrapping). Puede tener valores como flex-start, flex-end, stretch, center, space-between y space-around. Estos valores determinan cómo se distribuyen las líneas de elementos a lo largo del eje cruzado del contenedor.

**Flex Wrap:** Esta propiedad controla si los elementos se ajustan dentro de una sola línea o se envuelven a múltiples líneas cuando el espacio disponible es insuficiente. Si se permite el ajuste de línea, se puede utilizar la propiedad alignContent para especificar cómo se colocan las líneas dentro del contenedor.

#

## Comparación

Nivel 1


En este nivel se utiliza "justify-content: flex-end" de la documentación para alinear la rana al final del eje principal del contenedor.

#

Nivel 2


En este nivel se utiliza "justify-content: center" de la documentación para alinear las ranas al centro del eje principal del contenedor.

#

Nivel 3


En este nivel se utiliza "justify-content: space-around" de la documentación para separar uniformemente las ranas a lo largo del eje principal del contenedor y así distribuir el espacio restante alrededor de las ranas.

#

Nivel 4


En este nivel se utiliza "justify-content: space-between" de la documentación para distribuir uniformemente a las ranas dentro del contenedor de alineación a lo largo del eje principal.

#

Nivel 5


En este nivel se utiliza "align-items: flex-end" de la documentación para alinear las ranas al final del eje transversal del contenedor.

#

Nivel 6



En este nivel se utiliza "justify-content: center" de la documentación para para alinear la rana al centro del eje principal del contenedor. También se utiliza "align-items: center" para alinear la rana al centro del eje transversal del contenedor.

#

Nivel 7



En este nivel se utiliza "justify-content: space-around" de la documentación para separar uniformemente las ranas a lo largo del eje principal del contenedor y así distribuir el espacio restante alrededor de las ranas. También se utiliza "align-items: flex-end" para alinear las ranas al final del eje transversal del contenedor.

#

Nivel 8



En este nivel se utiliza "flex-direction: row-reverse" de la documentación para alinear las ranas de derecha a izquierda.

#

Nivel 9


En este nivel se utiliza "flex-direction: column" de la documentación para alinear las ranas de arriba a abajo.

#

Nivel 10


En este nivel se utiliza "flex-direction: row-reverse" de la documentación para alinear las ranas de derecha a izquierda. También se utiliza "justify-content: flex-end" para alinear las ranas al final del eje principal del contenedor. Aparece en el principio por el reverse.

#

Nivel 11



En este nivel se utiliza "flex-direction: column" de la documentación para alinear las ranas de arriba a abajo. También se utiliza "justify-content: flex-end" para alinear las ranas al final del eje principal del contenedor.

#

Nivel 12


En este nivel se utiliza "flex-direction: column-reverse" de la documentación para alinear las ranas de abajo hacia arriba. También se utiliza "justify-content: space-between" para distribuir uniformemente a las ranas dentro del contenedor de alineación a lo largo del eje principal.

#

Nivel 13


En este nivel se utiliza "flex-direction: row-reverse" de la documentación para alinear las ranas de derecha a izquierda. También se utiliza "justify-content: center" para alinear las ranas al centro del eje principal del contenedor. Por último, se utiliza "align-items: flex-end" para alinear las ranas al final del eje transversal del contenedor.

#

Nivel 14



En este nivel se utiliza "order: 3" para mover la rana amarilla de posición.

#

Nivel 15


En este nivel se utiliza "order: -1" para mover la rana roja a la posición -1.

#

Nivel 16

En este nivel se utiliza "align-self: flex-end" de la documentación para alinear solo la rana amarilla al final del eje transversal del contenedor.

#

Nivel 17


En este nivel se utiliza "order: 1" para mover law ranas amarillas a la posición 1. También se utiliza "align-self: flex-end" para alinear solo las ranas amarillas al final del eje transversal del contenedor.

#

Nivel 18


En este nivel se utiliza "flex-wrap: wrap" de la documentación para poner las ranas más grandes y así poner la rana verde y la roja en la siguiente línea.

#

Nivel 19


En este nivel se utiliza "flex-direction: column" de la documentación para alinear las ranas de arriba a abajo. También se utiliza "flex-wrap: wrap" para que las ranas sean más grandes y así ponerlas en la siguiente línea.

#

Nivel 20


En este nivel se utiliza "flex-flow: column wrap" para alinear las ranas de arriba a abajo y para que las ranas sean más grandes y así ponerlas en la siguiente línea.

#

Nivel 21


En este nivel se utiliza "align-content: flex-start" de la documentación para  alinear las ranas al inicio del eje transversal del contenedor.

#

Nivel 22



En este nivel se utiliza "align-content: flex-end" de la documentación para  alinear las ranas al final del eje transversal del contenedor.

#

Nivel 23


En este nivel se utiliza "flex-direction: column-reverse" de la documentación para alinear las ranas de abajo hacia arriba. También se utiliza "align-content: center" para  alinear las ranas al centro del eje transversal del contenedor.

#

Nivel 24


En este nivel se utiliza "flex-flow: column-reverse wrap-reverse" para alinear las ranas de abajo hacia arriba. También se utiliza "justify-content: center" de la documentación para alinear las ranas amarillas al centro del eje principal del contenedor. Por último, se utiliza "align-content: space-between" para espaciar uniformemente las ranas a lo largo del eje transversal del contenedor.