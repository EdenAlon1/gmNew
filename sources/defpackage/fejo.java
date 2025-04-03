package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejo extends fekk {
    final /* synthetic */ Status a;
    final /* synthetic */ febo b;
    final /* synthetic */ fejq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fejo(fejq fejqVar, Status status, febo feboVar) {
        super(fejqVar.c.e);
        this.a = status;
        this.b = feboVar;
        this.c = fejqVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        this.c.c.f.c();
        Status status = this.a;
        febo feboVar = this.b;
        Status status2 = this.c.b;
        if (status2 != null) {
            feboVar = new febo();
            status = status2;
        }
        try {
            fejr.g(this.c.a, status, feboVar);
        } finally {
            this.c.c.d.a(status.f());
        }
    }
}
