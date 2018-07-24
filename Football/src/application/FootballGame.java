package application;

import pojo.Player;

public class FootballGame {

	public static void main(String[] args) {
		Player goalKeeper = new Player();
		Player striker = new Player("Omkar", 45);
		System.out.println("striker : " +striker.getName() + striker.getAge());
		goalKeeper.setAge(50);
		System.out.println("-->" + goalKeeper.getAge());
	}

}
