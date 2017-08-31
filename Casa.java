/**
 * Esta clase se realizo con la finalidad de crear la imagende una casa
 * con el apoyo de distintas figuaras.
 * 
 * @author Nancy Vazquez
 * @version 08.23.17
 */
class Casa
{
    // varibles de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    // Constructor
    Casa()
    {
        ventana=new Circle();
        techo=new Triangle();
        pared=new Square();
        puerta=new Square();
    }
    /**
     * Este metodo se creo para realizar acciones sobre las figuras
     * que mostraran la casa.
     * No contine parametros
     * No retorna nada
     */
    // Construtor
    void dibujate()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
        ventana.changeColor("red");
        techo.changeColor("black");
        pared.changeColor("green");
        puerta.changeColor("blue");
    }
    
    /**
     * Este metodo se creo con la finalidad de que cada una de las figuras
     * que en conjunto se posicionen para poder mostrar la casa en forma.
     * No recibe parametros
     * No retorna nada.
     */
    // Constructor
    void acomodate()
    {
        pared.changeSize(80);
        pared.moveVertical(30);
        pared.moveVertical(30);
        pared.moveHorizontal(30);
        pared.moveHorizontal(20);
        puerta.moveHorizontal(50);
        puerta.moveHorizontal(15);
        puerta.moveHorizontal(15);
        puerta.moveHorizontal(-5);
        puerta.moveVertical(50);
        puerta.moveVertical(60);
        techo.changeSize(83,83);
        techo.moveHorizontal(50);
        techo.moveHorizontal(50);
        techo.moveVertical(15);
        ventana.moveHorizontal(50);
        ventana.moveHorizontal(50);
        ventana.moveHorizontal(16);
    }
   
    /**
     * Este metodo fue creado con la finalidad de 
     * mover a cierta posicion todas las figuras que simularan mostrar una segunda casa.
     * No recibe parametros
     * No retorna nada.
     */
    void mueveIzquierda()
    {
        pared.moveHorizontal(100);
        techo.moveHorizontal(100);
        puerta.moveHorizontal(100);
        ventana.moveHorizontal(100);
    }
    
}