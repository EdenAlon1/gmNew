package com.google.mediapipe.framework;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface GlSyncToken {
    long nativeToken();

    void release();

    void waitOnCpu();

    void waitOnGpu();
}
