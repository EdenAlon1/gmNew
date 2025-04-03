package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feta implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fejt b;
    final /* synthetic */ febo c;
    final /* synthetic */ fetu d;

    public feta(fetu fetuVar, Status status, fejt fejtVar, febo feboVar) {
        this.a = status;
        this.b = fejtVar;
        this.c = feboVar;
        this.d = fetuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.G = true;
        this.d.C.a(this.a, this.b, this.c);
    }
}
