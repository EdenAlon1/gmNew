package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eroo implements erqj {
    final /* synthetic */ erph a;
    final /* synthetic */ Executor b;

    public eroo(erph erphVar, Executor executor) {
        this.a = erphVar;
        this.b = executor;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.a.a((AutoCloseable) obj, this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
