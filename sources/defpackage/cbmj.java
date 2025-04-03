package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbmj extends SearchQuery {
    private final List a;
    private final cboy b;
    private final CancellationSignal c;

    public cbmj(List list, cboy cboyVar, CancellationSignal cancellationSignal) {
        this.a = list;
        this.b = cboyVar;
        this.c = cancellationSignal;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery
    public final CancellationSignal a() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery
    public final cboy b() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        cboy cboyVar;
        CancellationSignal cancellationSignal;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchQuery) {
            SearchQuery searchQuery = (SearchQuery) obj;
            if (this.a.equals(searchQuery.c()) && ((cboyVar = this.b) != null ? cboyVar.equals(searchQuery.b()) : searchQuery.b() == null) && ((cancellationSignal = this.c) != null ? cancellationSignal.equals(searchQuery.a()) : searchQuery.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        cboy cboyVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (cboyVar == null ? 0 : cboyVar.hashCode())) * 1000003;
        CancellationSignal cancellationSignal = this.c;
        return hashCode2 ^ (cancellationSignal != null ? cancellationSignal.hashCode() : 0);
    }

    public final String toString() {
        CancellationSignal cancellationSignal = this.c;
        cboy cboyVar = this.b;
        return "SearchQuery{searchFilters=" + this.a.toString() + ", limits=" + String.valueOf(cboyVar) + ", cancellationSignal=" + String.valueOf(cancellationSignal) + "}";
    }
}
