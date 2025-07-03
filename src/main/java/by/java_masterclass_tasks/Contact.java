package by.java_masterclass_tasks;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {

    private String name;
    private String phoneNumber;

    @Override
    public String toString() {
        return name + " -> " + phoneNumber;
    }
}
