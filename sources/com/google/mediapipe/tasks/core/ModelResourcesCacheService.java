package com.google.mediapipe.tasks.core;

import com.google.mediapipe.framework.GraphService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ModelResourcesCacheService implements GraphService<ModelResourcesCache> {
    @Override // com.google.mediapipe.framework.GraphService
    public final /* bridge */ /* synthetic */ void installServiceObject(long j, ModelResourcesCache modelResourcesCache) {
        ModelResourcesCache modelResourcesCache2 = modelResourcesCache;
        nativeInstallServiceObject(j, modelResourcesCache2.b.get() ? modelResourcesCache2.a : 0L);
    }

    public native void nativeInstallServiceObject(long j, long j2);
}
