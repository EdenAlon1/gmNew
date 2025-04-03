package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepd extends fekk {
    final /* synthetic */ fdxn a;
    final /* synthetic */ Status b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fepd(fepe fepeVar, fdxn fdxnVar, Status status) {
        super(fepeVar.a);
        this.a = fdxnVar;
        this.b = status;
    }

    @Override // defpackage.fekk
    public final void a() {
        this.a.a(this.b, new febo());
    }
}
