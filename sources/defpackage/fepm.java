package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepm implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ fepn b;

    public fepm(fepn fepnVar, Status status) {
        this.a = status;
        this.b = fepnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
