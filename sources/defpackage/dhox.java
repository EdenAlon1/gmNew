package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.internal.ISearchQueriesService;
import com.google.android.gms.search.queries.internal.SearchQueriesCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhox extends dfra implements dhou {
    public static final /* synthetic */ int a = 0;
    private static final dfqs b;
    private static final dfqj m;
    private static final dfqt n;

    static {
        dfqs dfqsVar = new dfqs();
        b = dfqsVar;
        dhow dhowVar = new dhow();
        m = dhowVar;
        n = new dfqt("SearchIndex.QUERIES_API", dhowVar, dfqsVar);
    }

    public dhox(Context context) {
        super(context, n, null, dfqz.a);
        context.getPackageName();
    }

    @Override // defpackage.dhou
    public final dhre a(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification) {
        final QueryCall$Request queryCall$Request = new QueryCall$Request();
        queryCall$Request.g = new Bundle();
        queryCall$Request.g.putLong("request_timestamp_ms", System.currentTimeMillis());
        queryCall$Request.a = str;
        queryCall$Request.b = str2;
        queryCall$Request.c = strArr;
        queryCall$Request.d = i;
        queryCall$Request.e = i2;
        queryCall$Request.f = querySpecification;
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dhov
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                dhoy dhoyVar = (dhoy) obj;
                int i3 = dhox.a;
                SearchQueriesCallbacks searchQueriesCallbacks = new SearchQueriesCallbacks(dhoyVar, (dhri) obj2);
                Context context = dhoyVar.c;
                ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                ((ISearchQueriesService) dhoyVar.w()).query(QueryCall$Request.this, searchQueriesCallbacks, new ApiMetadata(complianceOptions));
            }
        };
        dfunVar.c = 8117;
        return i(dfunVar.a());
    }
}
