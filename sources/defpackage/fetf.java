package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetf implements Runnable {
    final /* synthetic */ fets a;
    final /* synthetic */ fetg b;

    public fetf(fetg fetgVar, fets fetsVar) {
        this.a = fetsVar;
        this.b = fetgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fete feteVar;
        boolean z;
        fett fettVar;
        synchronized (this.b.b.q) {
            fetg fetgVar = this.b;
            feteVar = null;
            if (fetgVar.a.c) {
                z = true;
            } else {
                fetu fetuVar = fetgVar.b;
                fetuVar.w = fetuVar.w.a(this.a);
                fetu fetuVar2 = this.b.b;
                if (fetuVar2.z(fetuVar2.w) && ((fettVar = this.b.b.u) == null || fettVar.a())) {
                    fetu fetuVar3 = this.b.b;
                    feteVar = new fete(fetuVar3.q);
                    fetuVar3.E = feteVar;
                } else {
                    fetu fetuVar4 = this.b.b;
                    fetuVar4.w = fetuVar4.w.b();
                    this.b.b.E = null;
                }
                z = false;
            }
        }
        if (z) {
            fets fetsVar = this.a;
            fetsVar.a.m(new fetr(this.b.b, fetsVar));
            this.a.a.c(Status.c.withDescription("Unneeded hedging"));
        } else {
            if (feteVar != null) {
                fetu fetuVar5 = this.b.b;
                feteVar.b(fetuVar5.m.schedule(new fetg(fetuVar5, feteVar), fetuVar5.o.b, TimeUnit.NANOSECONDS));
            }
            this.b.b.w(this.a);
        }
    }
}
