package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uur implements ejlr<Void, Boolean> {
    final /* synthetic */ uuy a;

    public uur(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        this.a.v(0);
        this.a.az.ay();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        csjy.p("Bugle", th, "Error: scrolling to bottom. ".concat(String.valueOf(String.valueOf(this.a.ap))));
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
