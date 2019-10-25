/*
 * Ravimoshark Task API
 * This is an API to interact with Ravimoshark task database. # Introduction This API allow to create, modify and delete task, visits, technicians and interventions. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.task.calls;

import com.ravimoshark.apis.task.ApiException;
import com.ravimoshark.apis.task.model.CustomError;
import java.util.Date;
import com.ravimoshark.apis.task.model.Deleted;
import com.ravimoshark.apis.task.model.Finished;
import com.ravimoshark.apis.task.model.IdInteger;
import com.ravimoshark.apis.task.model.InlineResponse2001;
import com.ravimoshark.apis.task.model.Tasks;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
@Ignore
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    /**
     * Add one task.
     *
     * Add one task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTaskTest() throws ApiException {
        Tasks body = null;
        Tasks response = api.addTask(body);

        // TODO: test validations
    }
    /**
     * Delete one task.
     *
     * Delete one task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskTest() throws ApiException {
        Long id = null;
        IdInteger response = api.deleteTask(id);

        // TODO: test validations
    }
    /**
     * Edit one task.
     *
     * Edit one task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editTaskTest() throws ApiException {
        Tasks body = null;
        Tasks response = api.editTask(body);

        // TODO: test validations
    }
    /**
     * Get one task.
     *
     * Get one task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskByIdTest() throws ApiException {
        Long id = null;
        Deleted deleted = null;
        Tasks response = api.getTaskById(id, deleted);

        // TODO: test validations
    }
    /**
     * Get all tasks.
     *
     * Get all tasks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksTest() throws ApiException {
        Integer skip = null;
        Integer limit = null;
        String orderBy = null;
        String filterBy = null;
        Deleted deleted = null;
        Boolean metadata = null;
        String refClient = null;
        Finished finished = null;
        Long technicianId = null;
        Date dateFixFrom = null;
        Date dateCallUntil = null;
        Date dateCallFrom = null;
        Date dateFixUntil = null;
        InlineResponse2001 response = api.getTasks(skip, limit, orderBy, filterBy, deleted, metadata, refClient, finished, technicianId, dateFixFrom, dateCallUntil, dateCallFrom, dateFixUntil);

        // TODO: test validations
    }
}
