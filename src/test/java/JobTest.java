import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/8/17.
 */
public class JobTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Job.clearAllJobs();
    }
    @Test
    public void JobObjectGetsCorrectlyCreated_true() throws Exception {
         Job job = new Job("cook", "mcDonalds", "1-2-2013", "flipped burgers");
        assertEquals(true, job instanceof Job);
    }
    @Test
    public void JobInstantiatesWithValue_true() throws Exception {
        Job job = new Job("cook", "mcDonalds", "1-2-2013", "flipped burgers");
        assertEquals("cook", job.getValue());
    }
    @Test
    public void AllJobsAreCorrectlyReturned_true() {
        Job job = new Job ("cook", "mcDonalds", "1-2-2013", "flipped burgers");
        Job job2 = new Job ("thug", "Security R Us", "8-6-2017", "beat up");
        assertEquals(2, Job.getAll().size());
    }
    @Test
    public void AllJobsContainsAllJobs_true() {
        Job job = new Job ("cook", "mcDonalds", "1-2-2013", "flipped burgers");
        Job job2 = new Job ("thug", "Security R Us", "8-6-2017", "beat up");
        assertTrue(Job.getAll().contains(job));
        assertTrue(Job.getAll().contains(job2));
    }

}