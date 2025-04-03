package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uui implements erqj {
    final /* synthetic */ uuy a;

    public uui(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.aO = false;
        this.a.az.au(0);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (!(th instanceof CancellationException)) {
            throw new IllegalArgumentException("ensure loaded failed.", th);
        }
    }
}
