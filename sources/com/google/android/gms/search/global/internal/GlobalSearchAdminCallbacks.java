package com.google.android.gms.search.global.internal;

import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GlobalSearchAdminCallbacks<T> extends IGlobalSearchAdminCallbacks.Stub {
    private final dhri a;

    public GlobalSearchAdminCallbacks(dhri<T> dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetCurrentExperimentIdsResponse(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        dfup.b(getCurrentExperimentIdsCall$Response.a, getCurrentExperimentIdsCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetGlobalSearchSourcesResponse(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        dfup.b(getGlobalSearchSourcesCall$Response.a, getGlobalSearchSourcesCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onGetPendingExperimentIdsResponse(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        dfup.b(getPendingExperimentIdsCall$Response.a, getPendingExperimentIdsCall$Response.b, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetExperimentIdsResponse(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        dfup.b(setExperimentIdsCall$Response.a, null, this.a);
    }

    @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks
    public void onSetIncludeInGlobalSearchResponse(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        dfup.b(setIncludeInGlobalSearchCall$Response.a, null, this.a);
    }
}
