package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceuc {
    private static final cskc d = cskc.g("BugleWorkQueue", "ExecutionState");
    public String a;
    public Future c;
    private final long e;
    public final SettableFuture b = SettableFuture.create();
    private ceub f = ceub.PENDING;

    public ceuc(long j) {
        this.e = j;
    }

    final void a() {
        Future future = this.c;
        if (future != null) {
            future.cancel(true);
        }
    }

    public final void b() {
        this.b.set(ceyt.k());
    }

    final void c(ceub ceubVar) {
        csjb d2 = d.d();
        d2.I("setting execution state");
        d2.z("rowId", this.e);
        d2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        d2.A("fromState", this.f);
        d2.A("toState", ceubVar);
        d2.r();
        if (this.f == ceubVar) {
            return;
        }
        int ordinal = ceubVar.ordinal();
        if (ordinal != 0 && (ordinal == 1 ? this.f == ceub.UNKNOWN : !(ordinal == 2 ? this.f != ceub.PENDING : ordinal == 3 ? this.f != ceub.SUBMITTED : ordinal == 4 && this.f != ceub.EXECUTING))) {
            this.f = ceubVar;
            return;
        }
        throw new IllegalStateException("illegal state transition from " + String.valueOf(this.f) + " to " + String.valueOf(ceubVar) + " for id " + this.e);
    }

    final boolean d(ceub ceubVar) {
        return this.f == ceubVar;
    }

    public final String toString() {
        return "{" + this.a + "; " + String.valueOf(this.f) + "}";
    }
}
