public class MatchResult {
    private String guest;
    private String host;
    private int guestGoals;
    private int hostGoals;

    public MatchResult(String guest, String host, int guestGoals, int hostGoals) {
        this.guest = guest;
        this.host = host;
        this.guestGoals = guestGoals;
        this.hostGoals = hostGoals;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(int guestGoals) {
        this.guestGoals = guestGoals;
    }

    public int getHostGoals() {
        return hostGoals;
    }

    public void setHostGoals(int hostGoals) {
        this.hostGoals = hostGoals;
    }
    int getGoalDiffrence() {
        return hostGoals - guestGoals;
    }
    boolean containsTeam(String team) {
        return host.equals(team) || guest.equals(team);
    }

    String[] getTeamNames() {
        return new String[]{host,guest};
    }
    int getGoalsSum(){
        return hostGoals + guestGoals;
    }

    @Override
    public String toString() {
        return host + "-" + guest + "(" + hostGoals + ":" + guestGoals + ")";
    }
}
