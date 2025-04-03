package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekq implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ felb b;

    public fekq(felb felbVar, Status status) {
        this.a = status;
        this.b = felbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fdxo fdxoVar = this.b.b;
        Status status = this.a;
        fdxoVar.c(status.getDescription(), status.t);
    }
}
