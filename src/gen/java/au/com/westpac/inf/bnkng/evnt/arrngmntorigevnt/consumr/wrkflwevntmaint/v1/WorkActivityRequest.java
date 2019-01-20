package au.com.westpac.inf.bnkng.evnt.arrngmntorigevnt.consumr.wrkflwevntmaint.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * This is an important object
 **/

/**
 * This is an important object
 */
@ApiModel(description = "This is an important object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-01-20T11:21:55.950+11:00")
public class WorkActivityRequest   {
  private Boolean isCompletionNotificationRequired = null;

  private Boolean isAdhocTask = null;

  /**
   * type of task
   */
  public enum TaskTypeEnum {
    TASK("TASK");

    private String value;

    TaskTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TaskTypeEnum taskType = null;

  private String taskStage = null;

  /**
   * task priority
   */
  public enum PriorityEnum {
    HIGH("HIGH"),
    
    MEDIUM("MEDIUM"),
    
    LOW("LOW");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PriorityEnum priority = null;

  private String ownerCategory = null;

  private String taskSummary = null;

  private String taskDescription = null;

  public WorkActivityRequest isCompletionNotificationRequired(Boolean isCompletionNotificationRequired) {
    this.isCompletionNotificationRequired = isCompletionNotificationRequired;
    return this;
  }

   /**
   * do we want to be notified
   * @return isCompletionNotificationRequired
  **/
  @ApiModelProperty(value = "do we want to be notified")
  public Boolean getIsCompletionNotificationRequired() {
    return isCompletionNotificationRequired;
  }

  public void setIsCompletionNotificationRequired(Boolean isCompletionNotificationRequired) {
    this.isCompletionNotificationRequired = isCompletionNotificationRequired;
  }

  public WorkActivityRequest isAdhocTask(Boolean isAdhocTask) {
    this.isAdhocTask = isAdhocTask;
    return this;
  }

   /**
   * run time activity
   * @return isAdhocTask
  **/
  @ApiModelProperty(value = "run time activity")
  public Boolean getIsAdhocTask() {
    return isAdhocTask;
  }

  public void setIsAdhocTask(Boolean isAdhocTask) {
    this.isAdhocTask = isAdhocTask;
  }

  public WorkActivityRequest taskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * type of task
   * @return taskType
  **/
  @ApiModelProperty(value = "type of task")
  public TaskTypeEnum getTaskType() {
    return taskType;
  }

  public void setTaskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
  }

  public WorkActivityRequest taskStage(String taskStage) {
    this.taskStage = taskStage;
    return this;
  }

   /**
   * at what stage the task exists
   * @return taskStage
  **/
  @ApiModelProperty(value = "at what stage the task exists")
  public String getTaskStage() {
    return taskStage;
  }

  public void setTaskStage(String taskStage) {
    this.taskStage = taskStage;
  }

  public WorkActivityRequest priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * task priority
   * @return priority
  **/
  @ApiModelProperty(value = "task priority")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public WorkActivityRequest ownerCategory(String ownerCategory) {
    this.ownerCategory = ownerCategory;
    return this;
  }

   /**
   * owner of task
   * @return ownerCategory
  **/
  @ApiModelProperty(value = "owner of task")
  public String getOwnerCategory() {
    return ownerCategory;
  }

  public void setOwnerCategory(String ownerCategory) {
    this.ownerCategory = ownerCategory;
  }

  public WorkActivityRequest taskSummary(String taskSummary) {
    this.taskSummary = taskSummary;
    return this;
  }

   /**
   * subject line
   * @return taskSummary
  **/
  @ApiModelProperty(value = "subject line")
  public String getTaskSummary() {
    return taskSummary;
  }

  public void setTaskSummary(String taskSummary) {
    this.taskSummary = taskSummary;
  }

  public WorkActivityRequest taskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
    return this;
  }

   /**
   * details of task
   * @return taskDescription
  **/
  @ApiModelProperty(value = "details of task")
  public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkActivityRequest workActivityRequest = (WorkActivityRequest) o;
    return Objects.equals(this.isCompletionNotificationRequired, workActivityRequest.isCompletionNotificationRequired) &&
        Objects.equals(this.isAdhocTask, workActivityRequest.isAdhocTask) &&
        Objects.equals(this.taskType, workActivityRequest.taskType) &&
        Objects.equals(this.taskStage, workActivityRequest.taskStage) &&
        Objects.equals(this.priority, workActivityRequest.priority) &&
        Objects.equals(this.ownerCategory, workActivityRequest.ownerCategory) &&
        Objects.equals(this.taskSummary, workActivityRequest.taskSummary) &&
        Objects.equals(this.taskDescription, workActivityRequest.taskDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCompletionNotificationRequired, isAdhocTask, taskType, taskStage, priority, ownerCategory, taskSummary, taskDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkActivityRequest {\n");
    
    sb.append("    isCompletionNotificationRequired: ").append(toIndentedString(isCompletionNotificationRequired)).append("\n");
    sb.append("    isAdhocTask: ").append(toIndentedString(isAdhocTask)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    taskStage: ").append(toIndentedString(taskStage)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    ownerCategory: ").append(toIndentedString(ownerCategory)).append("\n");
    sb.append("    taskSummary: ").append(toIndentedString(taskSummary)).append("\n");
    sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

