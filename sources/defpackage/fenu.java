package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenu implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ feoi b;

    public fenu(feoi feoiVar, List list) {
        this.a = list;
        this.b = feoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feqr feqrVar;
        feoc feocVar = this.b.h;
        SocketAddress b = feocVar.b();
        feocVar.a = this.a;
        feocVar.c();
        this.b.i = this.a;
        if (this.b.r.a == fdyc.READY || this.b.r.a == fdyc.CONNECTING) {
            feoi feoiVar = this.b;
            int i = 0;
            while (true) {
                feoc feocVar2 = feoiVar.h;
                if (i < feocVar2.a.size()) {
                    int indexOf = ((fdyw) feocVar2.a.get(i)).b.indexOf(b);
                    if (indexOf != -1) {
                        feocVar2.b = i;
                        feocVar2.c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.b.r.a == fdyc.READY) {
                    feoi feoiVar2 = this.b;
                    feqrVar = feoiVar2.q;
                    feoiVar2.q = null;
                    this.b.h.c();
                    this.b.b(fdyc.IDLE);
                } else {
                    this.b.p.n(Status.p.withDescription("InternalSubchannel closed pending transport due to address change"));
                    this.b.p = null;
                    this.b.h.c();
                    this.b.h();
                }
            }
        }
        feqrVar = null;
        if (feqrVar != null) {
            feoi feoiVar3 = this.b;
            if (feoiVar3.l != null) {
                feoiVar3.m.n(Status.p.withDescription("InternalSubchannel closed transport early due to address change"));
                this.b.l.a();
                feoi feoiVar4 = this.b;
                feoiVar4.l = null;
                feoiVar4.m = null;
            }
            feoi feoiVar5 = this.b;
            feoiVar5.m = feqrVar;
            feoiVar5.l = feoiVar5.g.a(new fent(this), 5L, TimeUnit.SECONDS, feoiVar5.b);
        }
    }
}
