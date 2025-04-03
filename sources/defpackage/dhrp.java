package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhrp implements Runnable {
    final /* synthetic */ dhrm a;
    final /* synthetic */ Callable b;

    public dhrp(dhrm dhrmVar, Callable callable) {
        this.a = dhrmVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.v(this.b.call());
        } catch (Exception e) {
            this.a.u(e);
        } catch (Throwable th) {
            this.a.u(new RuntimeException(th));
        }
    }
}
