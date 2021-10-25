package hw7.Family.People;

import hw7.Family.DayOfWeek;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import org.junit.Assert;

public class FamilyToStringTest {
    Family module;
    Human kid1, kid2;
    Map<DayOfWeek, List<String>> schedule = new HashMap<>();


    @Before
    public void setUp() {
        schedule.put(DayOfWeek.SUNDAY, List.of("First day born"));
        schedule.put(DayOfWeek.MONDAY, List.of("First day born"));
        schedule.put(DayOfWeek.TUESDAY, List.of("First day born"));
        schedule.put(DayOfWeek.WEDNESDAY, List.of("Third day born"));
        module = new Family(new Man("Mother", "Ryab", 1960),
                new Woman("Father", "Ryab", 1960)
        );
        kid1 = new Man("Kid1", "Kidovich1", 2000,
                1, schedule, module);
        kid2 = new Man("Kid2", "Kidovich2", 2000,
                2, schedule, module);
        module.setChildren(kid1);
        module.setChildren(kid2);
    }

    @Test
    public void testToStringSuccess() {
        String substr1 = module.getChildren().get(0).toString();
        String substr2 = module.getChildren().get(1).toString();
        boolean k1 = substr1.contains("Kid1")
                && substr1.contains("Kidovich1")
                && substr1.contains("2000")
                && substr1.contains("First day born");
        boolean k2 = substr2.contains("Kid2")
                && substr2.contains("Kidovich2")
                && substr2.contains("2000");
        boolean kidTestPass = k1 && k2;
        boolean motherTestPass = module.toString().contains("Mother");
        boolean fatherTestPass = module.toString().contains("Father");
        boolean parentsToStringPass = motherTestPass && fatherTestPass;

        assertTrue(kidTestPass && parentsToStringPass);

    }
    @Test
    public void testToStringFailingChildrenArray() {
        String substr1 = module.getChildren().get(0).toString();
        String substr2 = module.getChildren().get(1).toString();
        boolean k1 = substr1.contains("blablabla")
                && substr1.contains("Kidovich1")
                && substr1.contains("2000")
                && substr1.contains("First day born");
        boolean k2 = substr2.contains("Kid2")
                && substr2.contains("Kidovich2")
                && substr2.contains("2000");
        boolean kidTestPass = k1 && k2;
        boolean motherTestPass = module.toString().contains("Mother");
        boolean fatherTestPass = module.toString().contains("Father");
        boolean parentsToStringPass = motherTestPass && fatherTestPass;

        assertFalse(kidTestPass && parentsToStringPass);
    }

    @Test
    public void testToStringFailingMotherField() {
        String substr1 = module.getChildren().get(0).toString();
        String substr2 = module.getChildren().get(1).toString();
        boolean k1 = substr1.contains("Kid1")
                && substr1.contains("Kidovich1")
                && substr1.contains("2000")
                && substr1.contains("First day born");
        boolean k2 = substr2.contains("Kid2")
                && substr2.contains("Kidovich2")
                && substr2.contains("2000");
        boolean kidTestPass = k1 && k2;
        boolean motherTestPass = module.toString().contains("blablabla");
        boolean fatherTestPass = module.toString().contains("Father");
        boolean parentsToStringPass = motherTestPass && fatherTestPass;

        assertFalse(kidTestPass && parentsToStringPass);
    }

}
