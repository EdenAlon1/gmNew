package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepu implements Runnable {
    final /* synthetic */ fepv a;

    public fepu(fepv fepvVar) {
        this.a = fepvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fepv fepvVar = this.a;
        Collection collection = fepvVar.f.c.x;
        if (collection != null) {
            collection.remove(fepvVar);
            if (this.a.f.c.x.isEmpty()) {
                feqc feqcVar = this.a.f.c;
                feqcVar.S.c(feqcVar.y, false);
                feqc feqcVar2 = this.a.f.c;
                feqcVar2.x = null;
                if (feqcVar2.B.get()) {
                    this.a.f.c.A.a(feqc.b);
                }
            }
        }
    }
}
