package defpackage;

import android.content.Context;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akmd implements fbbf {
    private final akis a;
    private final akme b;

    public akmd(akis akisVar, akme akmeVar) {
        this.a = akisVar;
        this.b = akmeVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        return new PeriodicWorker((Context) this.a.q.b(), this.b.a, (dwub) this.a.a.iQ.b(), (errl) this.a.aK.b());
    }
}
