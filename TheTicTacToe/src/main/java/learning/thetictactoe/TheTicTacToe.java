package learning.thetictactoe;

public class TheTicTacToe {

    public static void main(String[] args) {
	Referee referee = new Referee();
		/*
		 * При створенні гравця в його конструктор буде передано тип елементу
		 * який він буде використовувати на полі: хрестик або нулик
		 */		
	Player player1 = new Player(ActionFigure.NOUGHT);
	Player player2 = new Player(ActionFigure.CROSS);

	Board board = new Board(); 
        board.print();
        System.out.println(player1);
		
		/*
		 * Клас Поле містить метод hasMoreSpace(), що повертатиме true якщо ще залишилося дві
		 * вільні клітинки, або false у випадку якщо залишилося менше двох
		 * вільних клітинок 
		 */
	while (board.hasMoreSpace()) {
			/*
			 * Кожен гравець, роблячи хід, повенен перевірити чи не зайнята 
			 * відповідна клітинка. Код гравця повинен неухильно за цим слідкувати.
			 * 
			 * В якості додаткового завдання Ви можете переписати код таким чином,
			 * щоб Суддя слідкував за правильністю ходу. 
			 * Базова ж задача не вимагає від Судді такого функціоналу з метою спрощення задачі.
			 *
			 */
			
            Move move = player1.turn(board);
			/*
			 * відповідальність за розміщення елементів на Полі несе Суддя 
			 * Він НЕ перевіряє правильність ходу, просто розміщує елемент на полі
			 */
            referee.put(move, board); 
			/* метод print() виводить стан Поля на екран */
            board.print(); 
			/*
			 * метод isWin перевірить чи був хід виграшним, якщо так то він
			 * поверне true
			 */
            if (referee.isWin(move, board)) { 
				/*
				 * якщо хід був виграшним то потрібно завершити гру. 
				 * Сигналом до завершення гри буде переривання основного циклу гри
				 */
		break;
		} 
			
			/*
			 * Такі самі дії потрібно виконати для другого гравця
			 */
			/*
			 * В якості додаткового завдання пропоную уважно переглянути тіло
			 * циклу та винести код, що повторюється в окремий метод
			 */
            move = player2.turn(board);
            referee.put(move, board);
            board.print();
            if (referee.isWin(move, board)) {
		break;
            }
	}
    }
}
