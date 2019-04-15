/**
  Exercise constructing  an OrderedList
  from unordered data.

  ChampIndex:
    int champ = 0 // will be used to store the index of the current champ
    Iterate through every element of a list.
        Compare each element to the current champ, by index
        If the element in the list is smaller, set the champ to the index of that element
        otherwise, do not change the index.

 */
import java.util.ArrayList;  // shortcut

public class UserWantsOrder {

    public static void main(String[] commandLine) {
        System.out.println();

        // create the data destined for OL_iAS
        ArrayList<Integer> chaos = new ArrayList<Integer>();
        chaos.add( 111);  // lowest first
        chaos.add( 113);
        chaos.add( 115);
        chaos.add( 116);
        chaos.add( 114);
        chaos.add( 112);  // second-lowest is last
        System.out.println(
            "unordered data: " + chaos
          + System.lineSeparator());
        System.out.println(ChampIndex(chaos));
        System.out.println(
            "constructed: "
          + new OrderedList_inArraySlots( chaos)
          + System.lineSeparator());
    }
    public static int ChampIndex( ArrayList<Integer> unordered){
        int currentChamp = 0;
        for (int index = 0; index < unordered.size(); index++) {
            if( unordered.get(index).compareTo(unordered.get(currentChamp)) <= 0) currentChamp = index;
        }
        return currentChamp;
    }
}
