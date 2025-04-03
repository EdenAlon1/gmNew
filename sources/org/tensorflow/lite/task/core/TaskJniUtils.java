package org.tensorflow.lite.task.core;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class TaskJniUtils {
    public static final String a = "TaskJniUtils";

    private TaskJniUtils() {
    }

    public static void a() {
        try {
            System.loadLibrary("task_text_jni");
        } catch (UnsatisfiedLinkError e) {
            Log.e(a, "Error loading native library: task_text_jni", e);
            throw new UnsatisfiedLinkError("Error loading native library: task_text_jni");
        }
    }
}
