package Interfaces;

import java.util.ArrayList;

public interface Publisher {
    public static final ArrayList<Subcriber> subscribers = new ArrayList<>();
    void subscribe(Subcriber subcriber);
}

