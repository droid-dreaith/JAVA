package Mid_DataStructureActs;
import java.util.LinkedList;  
import java.util.Queue;       

public class PrintQueue {

    static class PrintJob {  // Inner class representing a print job
        private int jobId;           // Unique identifier for the print job
        private String documentName;  // Name of the document to be printed
        private int pages;            // Number of pages in the document

        // Constructor to initialize a print job
        public PrintJob(int jobId, String documentName, int pages) {
            this.jobId = jobId;
            this.documentName = documentName;
            this.pages = pages;
        }

        // Getter method for jobId
        public int getJobId() {
            return jobId;
        }

        // Getter method for documentName
        public String getDocumentName() {
            return documentName;
        }

        // Getter method for pages
        public int getPages() {
            return pages;
        }

        // Overriding the toString method to display print job details
        @Override
        public String toString() {
            return "Job ID: " + jobId + ", Document: " + documentName + ", Pages: " + pages;
        }
    }

    static class PrintQueueManager {  // Inner class to manage the print queue
        private Queue<PrintJob> queue;  // Queue to hold print jobs

        // Constructor initializing the queue
        public PrintQueueManager() {
            this.queue = new LinkedList<>();  // Using LinkedList to implement the queue
        }

        // Method to add a print job to the queue
        public void addJob(PrintJob job) {
            queue.add(job);  // Adding job to the queue
            System.out.println("Job added: " + job);  // Displaying the added job
        }

        // Method to process (remove) the next print job from the queue
        public PrintJob processJob() {
            if (!queue.isEmpty()) {  // Checking if the queue is not empty
                return queue.poll();  // Removing and returning the next job
            } else {
                System.out.println("No jobs in the queue.");  // If queue is empty
                return null;
            }
        }

        // Method to peek at the next print job without removing it
        public PrintJob peekNextJob() {
            if (!queue.isEmpty()) {  // Checking if the queue is not empty
                return queue.peek();  // Peeking at the next job
            } else {
                System.out.println("No jobs in the queue.");  // If queue is empty
                return null;
            }
        }

        // Method to display all jobs in the queue
        public void displayAllJobs() {
            if (!queue.isEmpty()) {  // Checking if the queue is not empty
                System.out.println("All jobs in the queue:");  // Displaying the list of jobs
                for (PrintJob job : queue) {
                    System.out.println(job);  // Printing each job
                }
            } else {
                System.out.println("No jobs in the queue.");  // If queue is empty
            }
        }
    }

    public static void main(String[] args) {
        PrintQueueManager printQueueManager = new PrintQueueManager();

        // Adding jobs
        printQueueManager.addJob(new PrintJob(1, "Document1.pdf", 5));
        printQueueManager.addJob(new PrintJob(2, "Report.docx", 10));
        printQueueManager.addJob(new PrintJob(3, "Presentation.pptx", 15));

        // Displaying next job
        printQueueManager.peekNextJob();

        // Displaying all jobs
        printQueueManager.displayAllJobs();

        // Processing a job
        printQueueManager.processJob();

        // Displaying remaining jobs
        printQueueManager.displayAllJobs();
    }
}

