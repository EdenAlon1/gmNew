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
import defpackage.dfse;
import defpackage.dhoy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SearchQueriesResultCallbacks<R> extends ISearchQueriesCallbacks.Stub {
    private final dfse a;
    private final Class b;
    dhoy clientImpl;

    public SearchQueriesResultCallbacks(dfse<R> dfseVar, Class<R> cls, dhoy dhoyVar) {
        this.a = dfseVar;
        this.b = cls;
        this.clientImpl = dhoyVar;
    }

    private final void a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("should_log_stats")) {
            return;
        }
        bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
        try {
            ISearchQueriesService iSearchQueriesService = (ISearchQueriesService) this.clientImpl.M();
            Context context = this.clientImpl.c;
            iSearchQueriesService.logApiTraceEvents(bundle, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onAnnotateResponse(AnnotateCall$Response annotateCall$Response) {
        this.a.c(this.b.cast(annotateCall$Response));
        a(annotateCall$Response.c);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetDocumentsResponse(GetDocumentsCall$Response getDocumentsCall$Response) {
        this.a.c(this.b.cast(getDocumentsCall$Response));
        a(getDocumentsCall$Response.c);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGetPhraseAffinityResponse(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        this.a.c(this.b.cast(getPhraseAffinityCall$Response));
        a(getPhraseAffinityCall$Response.c);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onGlobalQueryResponse(GlobalQueryCall$Response globalQueryCall$Response) {
        this.a.c(this.b.cast(globalQueryCall$Response));
        a(globalQueryCall$Response.c);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQueryResponse(QueryCall$Response queryCall$Response) {
        this.a.c(this.b.cast(queryCall$Response));
        a(queryCall$Response.c);
    }

    @Override // com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks
    public void onQuerySuggestResponse(QuerySuggestCall$Response querySuggestCall$Response) {
        this.a.c(this.b.cast(querySuggestCall$Response));
        a(querySuggestCall$Response.c);
    }
}
