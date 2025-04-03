package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dehb extends cpdo {
    public final ffbr a;
    private final errl b;

    public dehb(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = errlVar;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("WearableSyncStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        return elfo.g(new Callable() { // from class: deha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                deii deiiVar = (deii) dehb.this.a.b();
                cetp cetpVar = new cetp();
                cetpVar.b = "sync_data_to_wearable_app_dedupe";
                deiiVar.b(cetpVar.a());
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
