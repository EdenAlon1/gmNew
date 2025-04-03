package com.google.mediapipe.tasks.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ModelResourcesCache {
    public final long a = nativeCreateModelResourcesCache();
    public final AtomicBoolean b = new AtomicBoolean(true);

    private native long nativeCreateModelResourcesCache();

    public native void nativeReleaseModelResourcesCache(long j);
}
