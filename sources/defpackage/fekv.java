package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekv extends fekk {
    final fdxn a;
    final Status b;

    public fekv(felb felbVar, fdxn fdxnVar, Status status) {
        super(felbVar.a);
        this.a = fdxnVar;
        this.b = status;
    }

    @Override // defpackage.fekk
    public final void a() {
        this.a.a(this.b, new febo());
    }
}
