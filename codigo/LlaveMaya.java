class LlaveMaya implements SalidaUSBA {
    private ArrayList<Integer> datos;

    public LlaveMaya() {
        this.datos = new ArrayList<>();
    }

    @Override
    public ArrayList<Integer> enviarDatos() {
        return datos;
    }
}

