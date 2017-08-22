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
   
    void mueveIzquierda()
    {
        pared.moveHorizontal(100);
        techo.moveHorizontal(100);
        puerta.moveHorizontal(100);
        ventana.moveHorizontal(100);
    }
    
}