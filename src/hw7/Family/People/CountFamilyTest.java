package hw7.Family.People;

import hw7.Family.DayOfWeek;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CountFamilyTest {

    Family module;
    Human kid1, kid2;
    Map<DayOfWeek, List<String>> schedule = new HashMap<>();

    @Before
    public void setUp() {
        schedule.put(DayOfWeek.SUNDAY, List.of("First day born"));
        schedule.put(DayOfWeek.MONDAY, List.of("First day born"));
        schedule.put(DayOfWeek.TUESDAY, List.of("First day born"));
        schedule.put(DayOfWeek.WEDNESDAY, List.of("Third day born"));
        module = new Family(new Woman("Mother", "Ryab", 1960),
                new Man("Father", "Ryab", 1960)
        );
        kid1 = new Man("Kid1", "Kidovich1", 2000,
                1, schedule, module);
        kid2 = new Woman("Kid2", "Kidovich2", 2000,
                2, schedule, module);

        module.setChildren(kid1);
        module.setChildren(kid2);

    }

    @Test
    public void CountFamilySuccess() {
        assertEquals(4, module.countFamily(2));
    }

}
