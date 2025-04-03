package com.google.android.gms.search.queries.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks;
import defpackage.dfup;
import defpackage.dhoy;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SearchQueriesCallbacks<T> extends ISearchQueriesCallbacks.Stub {
    private final dhoy a;
    private final dhri b;

    public SearchQueriesCallbacks(dhoy dhoyVar, dhri<T> dhriVar) {
        this.a = dhoyVar;
        this.b = dhriVar;
    }

    private final void a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("should_log_stats")) {
            return;
        }
        bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
        try {
            ISearchQueriesService iSearchQueriesService = (ISearchQueriesService) this.a.M();
            Context context = this.a.c;
            iSearchQueriesService.logApiTraceEvents(bundle, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onAnnotateResponse(AnnotateCall$Response annotateCall$Response) {
        a(annotateCall$Response.c);
        dfup.b(annotateCall$Response.a, annotateCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetDocumentsResponse(GetDocumentsCall$Response getDocumentsCall$Response) {
        a(getDocumentsCall$Response.c);
        dfup.b(getDocumentsCall$Response.a, getDocumentsCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetPhraseAffinityResponse(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        a(getPhraseAffinityCall$Response.c);
        dfup.b(getPhraseAffinityCall$Response.a, getPhraseAffinityCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGlobalQueryResponse(GlobalQueryCall$Response globalQueryCall$Response) {
        a(globalQueryCall$Response.c);
        dfup.b(globalQueryCall$Response.a, globalQueryCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQueryResponse(QueryCall$Response queryCall$Response) {
        a(queryCall$Response.c);
        dfup.b(queryCall$Response.a, queryCall$Response.b, this.b);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQuerySuggestResponse(QuerySuggestCall$Response querySuggestCall$Response) {
        a(querySuggestCall$Response.c);
        dfup.b(querySuggestCall$Response.a, querySuggestCall$Response.b, this.b);
    }
}
