
package com.example.bootstrapper.worker;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;

@Component
public class DomainItemJobWorker {

    @JobWorker(type = "domainitem-post")
    public void handlePostJob(final ActivatedJob job) {
        // Implement logic to handle post job for DomainItem
        // Obtain input variable from Zeebe service task as entity's requestDto
        // Create a new database entry using entity's JPA repository's default method
        // Complete the job with responseDto as an output variable
    }

    @JobWorker(type = "domainitem-put")
    public void handlePutJob(final ActivatedJob job) {
        // Implement logic to handle put job for DomainItem
        // Obtain input variable from Zeebe service task as entity's requestDto
        // Update an identified database entry using entity's JPA repository's default method
        // Complete the job with responseDto as an output variable
    }
}
