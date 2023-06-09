

# Responsabilidade Unica

        toda classe deve ter um e apenas um proposito,
        a classe não deve ser cheia de funcionalidades
        excessivas

        ex:

            class AreasCalculator

                sum_areas( List<Shape> shapes){}

                print_sum(){}

        FERE O PRINCIPIO, o proposito de AreasCalulator deve ser apenas de 
        calcular a area, e nao de printala. deveria ser:

            class AreasCalculator

                sum_areas( List<Shape> shapes){}

            class AreaPrinter

                print_sum(){}        


# Aberto/Fechado

        classes e funcoes devem ser abertas para extensão, mas
        fechadas para modificação

        ex:
            Interface Shape 
                int height
                int width

            class Square implements Shape
                ...

            class Circle implements Shape
                ...

            class AreasCalculator
                sum(List<Shape> shapes){
                    sum = 0
                    for shape in shapes:

                        if shape == Square:
                            sum += shape.height * shape.width// Square area

                        if shape == Circle:
                            sum += ...//Circle area

                        ...
                        (add ifs for every shape that you might add)      

                    return sum      
                }

        FERE O PRINCIPIO, ao extender a funcao sum de AreasCalculator,vc tambem esta modificando 
        o metodo adicionando os ifs. Deveria ser:

            Interface Shape 
                int height
                int width
                int area

            class Square implements Shape
                ...

            class Circle implements Shape
                ...

            class AreasCalculator

                sum(shape){

                    sum = 0
                    for shape in shapes
                        sum += shape.area()

                    return sum
                }

        NOTA: nessa refatoracao, para calcular a area de um novo shape, basta
              criar uma nova classe que implementa esse shape (extendendo),
              sem precisar modificar o codigo de AreasCalculator (modificando).

# Segregacao de interfaces 

        interfaces não devem forcar classes a implementar
        metodos que elas não vão usar. Interfaces largas
        devem ser substituidas por interfaces menores

        ex:

            interface Shape
                area()
                volume()

            class Circle implements Shape

                area(){//can implement}

                volume(){//cant implement, circle is not 3D}

            class Esphere implements Shape

                area(){//cant implement, Esphere is not 2D}

                volume(){//can implement}

        FERE O PRINCIPIO, deveria ser:

            Interface Shape2D
                area()

            Interface Shape3D
                volume()

            class Circle implements Shape2D

                area(){//can implement}

            class Esphere implements Shape3D

                volume(){//can implement}

# Inversao de dependencia

        Componentes nao devem depender de classes concretas,
        mas sim de abstracoes (interfaces)

        ex:

            class ShapesPrinter

                AreasCalculator areacalculator = new AreasCalculator();

                print_sum(shapes){
                    return areacalculator.sum(shapes)
                }

        FERE O PRINCIPIO, ShapesPrinter nao deveria depender de uma
        classe concreta, mas sim de uma abstracao. deveria ser:

            class ShapesPrinter

                private final IAreasCalculator areacalculator;

                ShapesPrinter(IAreasCalculator areacalculator){
                    this.areacalculator = areacalculator;
                }

                print_sum(shapes){
                    return areacalculator.sum(shapes)
                }


        NOTA: assim da pra injetar qualquer implementacao da interface
              IAreasCalculator no construtor da class ShapesPrinter,
              ou seja, ShapesPrinter depende da abstracao IAreasCalculator
              e nao de uma de suas implementacoes (classe concreta)


# EXTRA: Substituicao de Liskov

        toda classe deve ser substituivel pela sua classe/interface pai.

        ex:

            class Square
                int width

                setWidth(int width)
                getArea() {return width* width}

            class Rectangle extends Square
                int width
                int height

                setWidth(int width)
                setHeight(int height)
                getArea() {return width* height}


            Rectangle rec = new Rectangle()
            rec.setHeight(20) //works
            rec.getArea()

            Square rec = new Rectangle()
            rec.setHeight(20) //error: Square does not have method setHeight
            rec.getArea()

        FERE O PRINCIPIO, o tipo de rec deveria ser substituivel pela 
        a classe pai (Square) sem gerar erros, porem se instanciarmos 
        Square rec = new Rectangle() e depois chamarmos rec.setHeight()
        o codigo dara erro pois Square nao tem um metodo setHeight. Deveria ser:

            class Square
                int width
                int height

                setWidth(int width){
                    this.width = width
                    this.height = width
                }
                setHeight(int height){
                    this.width = height
                    this.height = height
                }
                getArea() {return width*height}

            class Rectangle extends Square
                int width
                int height

                setWidth(int width){
                    this.width = width
                }
                setHeight(int height){
                    this.height = height
                }
                getArea() {return width* height}


            Rectangle rec = new Rectangle()
            rec.setHeight(20) //works
            rec.getArea()

            Square rec = new Rectangle()
            rec.setHeight(20) //also works: now Square also has method setHeight
            rec.getArea()

        NOTA: agora 









             





