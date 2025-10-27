public class RaceHorse extends Horse{
int racesWon; //number
int racesRun; //number
String breed;

public RaceHorse(String horseName, int year, String breed){
    super(horseName, year);
    racesWon=0;
    racesRun=0;
}
public void addRace(boolean won){
    racesRun++;
    if (won){
        racesWon++;
    }
}
public String toString (){
    return super.toString() + " Breed: " + breed + ";
    




