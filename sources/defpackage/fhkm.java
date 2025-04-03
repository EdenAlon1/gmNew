package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkm extends fhmq {
    final /* synthetic */ fhkn a;

    public fhkm(fhkn fhknVar) {
        this.a = fhknVar;
    }

    @Override // defpackage.fhmq
    protected final void a() {
        this.a.l(9);
        fhkf fhkfVar = this.a.b;
        synchronized (fhkfVar) {
            long j = fhkfVar.n;
            long j2 = fhkfVar.m;
            if (j >= j2) {
                fhkfVar.m = j2 + 1;
                fhkfVar.p = System.nanoTime() + 1000000000;
                fhkfVar.i.f(new fhkc(String.valueOf(fhkfVar.d).concat(" ping"), fhkfVar));
            }
        }
    }

    public final void b() {
        if (f()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
