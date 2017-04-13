package me.yoryor.dp.async;

import java.util.concurrent.ExecutionException;

/**
 * AsyncResult interface
 */
public interface AsyncResult<T> {

    /**
     * Status of the async task execution.
     * @return
     */
    boolean isCompleted();

    /**
     * Get the value of the completed async task.
     *
     * @return
     * @throws ExecutionException
     */
    T getValue() throws ExecutionException;

    /**
     * Blocks the current thread until the async task is finished.
     * @throws InterruptedException
     */
    void await() throws InterruptedException;
}
