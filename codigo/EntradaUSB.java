class EntradaUSB implements EntradaUSBC {
    SalidaUSBC Dispositivo;
    public EntradaUSB() {
        Dispositivo = null;
    }

    @Override
    public ArrayList<String> recibirDatos() {
        return Dispositivo.enviarDatos();
    }

    @Override
    public void conectarDispositivoUSB(SalidaUSBC pDispositivo) {
        Dispositivo = pDispositivo;
    }
}

