package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efjq {
    final /* synthetic */ efjy a;

    public efjq(efjy efjyVar) {
        this.a = efjyVar;
    }

    public final void a() {
        synchronized (this.a.j) {
            int i = this.a.m;
            emxf.n(i > 0, "Refcount went negative!", i);
            r1.m--;
            this.a.d();
        }
    }

    public final void b() {
        synchronized (this.a.j) {
            int i = this.a.m;
            if (i == 0) {
                throw new CancellationException("database is closed");
            }
            emxf.n(i > 0, "Refcount went negative!", i);
            this.a.m++;
        }
    }
}
