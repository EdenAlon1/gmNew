package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degq implements cnjv {
    public final ffbr a;
    private final ffbr b;

    public degq(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.cnjv
    public final elfl fM(final boolean z) {
        return elfo.g(new Callable() { // from class: degp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (!z) {
                    return null;
                }
                deii deiiVar = (deii) degq.this.a.b();
                cetp cetpVar = new cetp();
                cetpVar.b = "sync_data_to_wearable_app_dedupe";
                deiiVar.a(cetpVar.a());
                return null;
            }
        }, (Executor) this.b.b());
    }
}
