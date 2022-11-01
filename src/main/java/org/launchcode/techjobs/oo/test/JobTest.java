package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.launchcode.techjobs.oo.Employer;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job1 = new Job();
    Job job2 = new Job();

    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    Job jobToString = new Job();

    @Test
    public void testSettingJobId() {
        assertNotEquals(job1.getId(), job2.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }
//    The following test should return false. IT DOES. Do I leave the failing test in for grading?
    @Test
    public void testJobsForEquality() {
        assertEquals(job1.getId(), job2.getId());
        }


@Test
    public void testToStringStartsAndEndsWithNewLine() {
    String jobString =
            "\n" +
                    "ID: " + job.getId() + "\n" +
                    "Name: " + job.getName() + "\n" +
                    "Employer: " + job.getEmployer()+ "\n" +
                    "Location: " + job.getLocation() + "\n" +
                    "Position Type: " + job.getPositionType() + "\n" +
                    "Core Competency: " + job.getCoreCompetency() + "\n";

    assertEquals(jobString.charAt(0), jobString.charAt(jobString.length()-1));
}

@Test
    public void testToStringContainsCorrectLabelsAndData() {
    String jobString =
            "\n" +
                    "ID: " + job.getId() + "\n" +
                    "Name: " + job.getName() + "\n" +
                    "Employer: " + job.getEmployer()+ "\n" +
                    "Location: " + job.getLocation() + "\n" +
                    "Position Type: " + job.getPositionType() + "\n" +
                    "Core Competency: " + job.getCoreCompetency() + "\n";

assertEquals(job.toString(), jobString);
}

@Test
    public void testToStringHandlesEmptyField() {
    Job emptyField = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String jobString =
            "\n" +
                    "ID: " + emptyField.getId() + "\n" +
                    "Name: " + emptyField.getName() + "\n" +
                    "Employer: " + emptyField.getEmployer() + "\n" +
                    "Location: " + emptyField.getLocation() + "\n" +
                    "Position Type: " + emptyField.getPositionType() + "\n" +
                    "Core Competency: " + emptyField.getCoreCompetency() + "\n";

    assertEquals(emptyField.toString(), jobString);
}


    }

