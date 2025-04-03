package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enwa implements Callable {
    final /* synthetic */ Callable a;
    final /* synthetic */ enwb b;

    public enwa(enwb enwbVar, Callable callable) {
        this.a = callable;
        this.b = enwbVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        enwd a = this.b.a();
        try {
            Object call = this.a.call();
            enwf.b(a, false);
            return call;
        } catch (Throwable th) {
            enwf.b(a, true);
            throw th;
        }
    }
}
