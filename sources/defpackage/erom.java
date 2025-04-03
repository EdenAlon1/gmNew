package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erom implements Callable {
    final /* synthetic */ erov a;
    final /* synthetic */ erou b;

    public erom(erov erovVar, erou erouVar) {
        this.a = erovVar;
        this.b = erouVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b.a);
    }

    public final String toString() {
        return this.a.toString();
    }
}
