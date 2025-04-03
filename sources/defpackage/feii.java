package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feii implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fejt b;
    final /* synthetic */ febo c;
    final /* synthetic */ feij d;

    public feii(feij feijVar, Status status, fejt fejtVar, febo feboVar) {
        this.a = status;
        this.b = fejtVar;
        this.c = feboVar;
        this.d = feijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.h(this.a, this.b, this.c);
    }
}
