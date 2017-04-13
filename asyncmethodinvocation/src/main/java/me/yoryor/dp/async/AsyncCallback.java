package me.yoryor.dp.async;

import java.util.Optional;

/**
 * AsyncCallback interface, handler for async result.
 *
 * @param <T>
 */
public interface AsyncCallback<T> {
    /**
     * Handler for an async task, called when the task finished or failed with exception.
     *
     * @param value
     * @param ex
     */
    void onComplete(T value, Optional<Exception> ex);
}
