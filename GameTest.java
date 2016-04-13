package se.liu.ida.leope892.tddd78_project;

import java.util.ArrayList;
import java.util.List;

public class GameTest
{
    public static void main(String[] args) {
	Block testBlock = new Block(0, 0, 20, 20);
	Player testPlayer = new Player(0,20);
	List<GameObject> testList =  new ArrayList<>();
	testList.add(testBlock);
	testList.add(testPlayer);
	GameFrame testFrame = new GameFrame("test",testList);

    }
}
