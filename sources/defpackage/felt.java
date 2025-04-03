package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felt implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fema b;

    public felt(fema femaVar, Status status) {
        this.a = status;
        this.b = femaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.c(this.a);
    }
}
