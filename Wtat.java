public class Wtat {
    private Worker[] Wtat;

    public Wtat(Worker[] professions) {
        this.Wtat = professions;
    }

    public void viewWtat() {

        for (int x = 0; x < Wtat.length; x++) {
            System.out.println("**************");
            Worker profession = Wtat[x];
            System.out.println(profession.getName() + profession.getLastName() + profession.getPatronymic() + profession.getProfession());
            profession.goToWork();
            profession.goToVacation();
            System.out.println("**************");
        }
    }

    public Worker[] getWorker() {
        return Wtat;
    }

    public void setWorker(Worker[] professions) {
        this.Wtat = professions;
    }
}


