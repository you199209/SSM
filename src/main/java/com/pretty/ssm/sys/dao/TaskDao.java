package com.pretty.ssm.sys.dao;

import com.pretty.ssm.entity.ScheduleJob;

import java.util.List;

/***
 * 定时任务数据的持久化操作
 *
 */
public interface TaskDao {

    /***
     * 分页查询
     *
     */
    public List<ScheduleJob> findAllTaskList(ScheduleJob scheduleJob, int start, int pageSize);

    /***
     * 查询所有的任务列表
     *
     */
    public List<ScheduleJob> getAllTask();

    /***
     * 删除
     *
     */
    public boolean deleteTask(String[] ids);

    /***
     * 新增
     *
     */
    public boolean addTask(ScheduleJob scheduleJob);

    /***
     * 通过id查询任务信息
     *
     */
    public ScheduleJob getTaskById(String id);

    /***
     * 更新
     *
     */
    public boolean updateTask(ScheduleJob scheduleJob);

}
