package defpackage;

import io.grpc.Status;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepb extends fetu {
    final /* synthetic */ febs a;
    final /* synthetic */ fdxj b;
    final /* synthetic */ fdyn c;
    final /* synthetic */ fepc d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fepb(defpackage.fepc r14, defpackage.febs r15, defpackage.febo r16, defpackage.fdxj r17, defpackage.fetv r18, defpackage.fene r19, defpackage.fdyn r20) {
        /*
            r13 = this;
            r2 = r17
            r13.a = r15
            r13.b = r2
            r4 = r20
            r13.c = r4
            r13.d = r14
            feqc r4 = r14.b
            fetd r3 = r4.O
            long r5 = r4.P
            r8 = r5
            long r6 = r4.Q
            java.util.concurrent.Executor r2 = r4.h(r2)
            fejx r4 = r4.i
            java.util.concurrent.ScheduledExecutorService r4 = r4.c()
            fett r12 = r14.a
            r0 = r8
            r9 = r4
            r4 = r0
            r0 = r13
            r1 = r15
            r10 = r18
            r11 = r19
            r8 = r2
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fepb.<init>(fepc, febs, febo, fdxj, fetv, fene, fdyn):void");
    }

    @Override // defpackage.fetu
    public final Status p() {
        feqb feqbVar = this.d.b.A;
        synchronized (feqbVar.a) {
            Status status = feqbVar.c;
            if (status != null) {
                return status;
            }
            feqbVar.b.add(this);
            return null;
        }
    }

    @Override // defpackage.fetu
    public final fejs q(febo feboVar, fdxs fdxsVar, int i, boolean z) {
        fdxj g = this.b.g(fdxsVar);
        fdxt[] l = fend.l(g);
        fdyn a = this.c.a();
        try {
            return this.d.b.z.d(this.a, feboVar, g, l);
        } finally {
            this.c.f(a);
        }
    }

    @Override // defpackage.fetu
    public final void r() {
        Status status;
        feqb feqbVar = this.d.b.A;
        synchronized (feqbVar.a) {
            feqbVar.b.remove(this);
            if (feqbVar.b.isEmpty()) {
                status = feqbVar.c;
                feqbVar.b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            feqbVar.d.z.n(status);
        }
    }
}
