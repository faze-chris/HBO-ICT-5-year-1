import java.util.HashMap;
import java.util.Map;

public class Main {
    enum Status {
        IN_BEHANDELING, NIEUW, AFGEROND
    }

    public static void main(String[] args) {
        Map<Status, String> meldingen = new HashMap<>();
        meldingen.put(Status.NIEUW, "nieuw");
        meldingen.put(Status.IN_BEHANDELING, "IN_BEHANDELING22");
        meldingen.put(Status.AFGEROND, "AFGEROND22");

        Status status = Status.AFGEROND;
        String melding = meldingen.get(status);

        if (melding != null) {
            switch (status) {
                case Status.IN_BEHANDELING -> System.out.println(melding);

                case Status.NIEUW -> System.out.println(melding);

                case Status.AFGEROND -> System.out.println(melding);

            }
        }


    }

}



