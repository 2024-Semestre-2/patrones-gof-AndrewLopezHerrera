interface EntradaUSBC { //Esta es la representación del puerto USB del celular.
    ArrayList<String> recibirDatos();
    void conectarDispositivoUSB(SalidaUSBC pDispositivo);
}

