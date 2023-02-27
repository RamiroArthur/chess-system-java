package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}

//Função para imprimir as peças da partida
//Para isso vamos criar uma Classe chamada [UI]
//Dentro dela um metodo chamado printBoard()
//Esse metodo vai receber a matriz de peças da minha partida!
