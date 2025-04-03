package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekn implements Runnable {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ felb b;

    public fekn(felb felbVar, StringBuilder sb) {
        this.a = sb;
        this.b = felbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(Status.f.withDescription(this.a.toString()), true);
    }
}
