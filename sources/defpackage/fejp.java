package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejp extends fekk {
    final /* synthetic */ fejq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fejp(fejq fejqVar) {
        super(fejqVar.c.e);
        this.a = fejqVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        fejq fejqVar = this.a;
        if (fejqVar.b != null) {
            return;
        }
        try {
            fejqVar.a.d();
        } catch (Throwable th) {
            this.a.b(Status.c.d(th).withDescription("Failed to call onReady."));
        }
    }
}
