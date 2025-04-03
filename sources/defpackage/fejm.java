package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejm extends fekk {
    final /* synthetic */ febo a;
    final /* synthetic */ fejq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fejm(fejq fejqVar, febo feboVar) {
        super(fejqVar.c.e);
        this.a = feboVar;
        this.b = fejqVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        fejq fejqVar = this.b;
        if (fejqVar.b != null) {
            return;
        }
        try {
            fejqVar.a.b(this.a);
        } catch (Throwable th) {
            this.b.b(Status.c.d(th).withDescription("Failed to read headers"));
        }
    }
}
