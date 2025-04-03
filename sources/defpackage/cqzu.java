package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqzu implements Callable {
    final /* synthetic */ awui a;
    final /* synthetic */ cqzx b;

    public cqzu(cqzx cqzxVar, awui awuiVar) {
        this.a = awuiVar;
        this.b = cqzxVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((bdrr) this.b.e.b()).c(this.a.d);
    }
}
