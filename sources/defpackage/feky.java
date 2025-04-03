package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feky implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ febo b;
    final /* synthetic */ fela c;

    public feky(fela felaVar, Status status, febo feboVar) {
        this.a = status;
        this.b = feboVar;
        this.c = felaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
