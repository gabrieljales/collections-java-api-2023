package main.java.sandbox.map.basicOperations.exercise002;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("Significado", "Definição atribuída a um termo, palavra, frase, texto; acepção, significação.");
        dictionary.addWord("Dicionário", "Livro em papel, eletrônico ou em outro formato que possui as informações presentes nessa compilação: O Dicio é um dicionário on-line de língua portuguesa.");
        dictionary.addWord("Exceção", "Ruptura de uma regra ou norma: dizem que toda regra tem uma exceção.");

        dictionary.showWords();
        
        System.out.println("Definição da palavra 'Exceção': " + dictionary.findDefinitionByWord("Exceção"));
        dictionary.removeWord("Dicionário");

        dictionary.showWords();
    }
}
