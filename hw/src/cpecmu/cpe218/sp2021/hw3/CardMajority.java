package cpecmu.cpe218.sp2021.hw3;

public interface CardMajority {

    /**
     * Return any of the cards for which at least half the cards are
     * equivalent to the returned card.
     * @param q the equivalence tester
     * @return a card number (between 0 and q.size()-1 inclusive)
     *          for which at least half the cards (including itself)
     *          are equivalent the returned card, or -1 if there is no
     *          such card
     */
    int majorityCard(CardEquivQuery q);

}
