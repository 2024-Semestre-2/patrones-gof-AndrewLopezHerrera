class Adaptador implements SalidaUSBC {
    private SalidaUSBA Dispositivo;
    public Adaptador() {
        Dispositivo = null;
    }

    @Override
    public ArrayList<String> enviarDatos() {
        ArrayList<Integer> numeros = Dispositivo.enviarDatos();
        ArrayList<String> cadenas = new ArrayList<>();

        for (Integer numero : numeros) {
            cadenas.add(String.valueOf(numero));
        return cadenas;
}

    }

    public void conectarDispositivoUSB(SalidaUSBA dispositivo) {
        Dispositivo = dispositivo;
    }
}

