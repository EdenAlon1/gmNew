package com.google.android.gms.search.global.internal;

import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.dfse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlobalSearchAdminResultCallbacks<R> extends IGlobalSearchAdminCallbacks.Stub {
    private final dfse a;
    private final Class b;

    public GlobalSearchAdminResultCallbacks(dfse<R> dfseVar, Class<R> cls) {
        this.a = dfseVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetCurrentExperimentIdsResponse(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        this.a.c(this.b.cast(getCurrentExperimentIdsCall$Response));
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetGlobalSearchSourcesResponse(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        this.a.c(this.b.cast(getGlobalSearchSourcesCall$Response));
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetPendingExperimentIdsResponse(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        this.a.c(this.b.cast(getPendingExperimentIdsCall$Response));
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetExperimentIdsResponse(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        this.a.c(this.b.cast(setExperimentIdsCall$Response));
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetIncludeInGlobalSearchResponse(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        this.a.c(this.b.cast(setIncludeInGlobalSearchCall$Response));
    }
}
