/*
CrosswordPuzzle
https://github.com/hencoappel/CrosswordPuzzle/tree/master/src/crossword
Copyright 2013 Henco Appel / 영문 한글화, 단어의 문자 칸수에 따른 점수표기, 십자말풀이 순서변경, 십자말풀이 게임 조작법 설명
*/

package crossword.network;

import java.util.List;

public interface NetworkInterface {

	public void sendMessage();

	public void sendCellUpdate();

	public void sendCrossword();

	public List<Server> getServers();

	public void turnServerOn();

	public void turnServerOff();

}
