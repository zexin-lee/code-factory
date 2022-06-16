package com.amzexin.util.common;

import lombok.extern.slf4j.Slf4j;

/**
 * Description: SleepUtil
 *
 * @author Lizexin
 * @date 2022-06-09 17:42
 */
@Slf4j
public class SleepUtil {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
    }

    private SleepUtil() {
    }
}
