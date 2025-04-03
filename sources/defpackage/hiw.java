package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hiw extends ffkk implements ffji {
    final /* synthetic */ hjh a;
    final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiw(hjh hjhVar, Throwable th) {
        super(1);
        this.a = hjhVar;
        this.b = th;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = this.b;
        Throwable th2 = (Throwable) obj;
        hjh hjhVar = this.a;
        synchronized (hjhVar.d) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                if (true == (th2 instanceof CancellationException)) {
                    th2 = null;
                }
                if (th2 != null) {
                    ffbt.a(th, th2);
                }
            }
            hjhVar.f = th;
            hjhVar.q.f(hiu.a);
        }
        return ffcu.a;
    }
}
