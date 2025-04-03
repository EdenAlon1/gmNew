package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojq implements ejxi {
    final /* synthetic */ cojr a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public cojq(cojr cojrVar) {
        this.a = cojrVar;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return cojr.a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        if (!((Boolean) ((cfup) cojg.a.get()).e()).booleanValue()) {
            elfl e = elfo.e(Optional.of(new coje()));
            e.getClass();
            return e;
        }
        if (!this.b.getAndSet(true)) {
            cojr cojrVar = this.a;
            ekzz f = eleg.f("ScreenDetectionListener.loadData.initialRegistration");
            try {
                axol.k(cojrVar.d, null, new cojp(cojrVar, null), 3);
                ffig.a(f, null);
            } finally {
            }
        }
        elfl e2 = elfo.e(Optional.ofNullable(this.a.e.get()));
        e2.getClass();
        return e2;
    }
}
