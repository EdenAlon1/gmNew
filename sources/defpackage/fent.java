package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fent implements Runnable {
    final /* synthetic */ fenu a;

    public fent(fenu fenuVar) {
        this.a = fenuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feoi feoiVar = this.a.b;
        feqr feqrVar = feoiVar.m;
        feoiVar.l = null;
        feoiVar.m = null;
        feqrVar.n(Status.p.withDescription("InternalSubchannel closed transport due to address change"));
    }
}
