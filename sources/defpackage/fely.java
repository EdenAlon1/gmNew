package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fely implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fejt b;
    final /* synthetic */ febo c;
    final /* synthetic */ felz d;

    public fely(felz felzVar, Status status, fejt fejtVar, febo feboVar) {
        this.a = status;
        this.b = fejtVar;
        this.c = feboVar;
        this.d = felzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
