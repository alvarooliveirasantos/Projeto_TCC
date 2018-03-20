package br.com.stream.impl;


import br.com.interfaces.Stream;

public class CaracterStream implements Stream {

    /**
     * Stream.
     */
    private final String stream;

    /**
     * Caracteres.
     */
    private final char[] caracteres;

    /**
     * Currenti Index.
     */
    private int currentIndex;

    // Construtor - String n�o pode ser nula na entrada do método main
    public CaracterStream(String stream) {
        if (stream == null) {
            throw new IllegalArgumentException("A Stream não pode ser nula");
        }
        this.stream = stream;
        this.caracteres = stream.toCharArray();
    }

    // Busca proximo caracter na string
    public char getNext() {
        if (!hasNext()) {
            throw new RuntimeException();
        }
        return caracteres[currentIndex++];
    }

    public boolean hasNext() {
        return currentIndex < caracteres.length;
    }

    @Override
    public String toString() {
        return stream;
    }
}
