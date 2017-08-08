import java.util.ArrayList;

public class Job {
    private final String jobName;
    private final String company;
    private final String date;
    private final String description;
    private static ArrayList<Job> jobArray = new ArrayList<>();

    public Job(String jobName, String company, String date, String description){
        this.jobName = jobName;
        this.company = company;
        this.date = date;
        this.description = description;
        jobArray.add(this);
    }


    public static ArrayList<Job> getAll() {
        return jobArray;
    }





    public String getJobName() {
        return jobName;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public static void clearAllJobs(){
        jobArray.clear();
    }


}
