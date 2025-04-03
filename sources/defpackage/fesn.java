package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesn implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ fets b;
    final /* synthetic */ Future c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Future e;
    final /* synthetic */ fetu f;

    public fesn(fetu fetuVar, Collection collection, fets fetsVar, Future future, boolean z, Future future2) {
        this.a = collection;
        this.b = fetsVar;
        this.c = future;
        this.d = z;
        this.e = future2;
        this.f = fetuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (fets fetsVar : this.a) {
            if (fetsVar != this.b) {
                fetsVar.a.c(fetu.g);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
            if (!this.d && this.f.z.decrementAndGet() == Integer.MIN_VALUE) {
                fetu fetuVar = this.f;
                fetuVar.l.execute(new fesm(this));
            }
        }
        Future future2 = this.e;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f.r();
    }
}
