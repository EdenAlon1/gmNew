package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duit extends fdzb {
    final /* synthetic */ duix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duit(fdxn fdxnVar, duix duixVar) {
        super(fdxnVar);
        this.a = duixVar;
    }

    @Override // defpackage.fech, defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        duix duixVar = this.a;
        synchronized (duixVar.a) {
            if (!duixVar.c) {
                duixVar.c = true;
                duiv duivVar = duixVar.b;
                if (duivVar == null) {
                    duixVar.d.s = status.getCode().value();
                    ecdc.a().g(duixVar.d);
                } else {
                    synchronized (duivVar.a) {
                        duivVar.b.b(duivVar.d, duivVar.e);
                        duivVar.b.s = status.getCode().value();
                        ecdc.a().g(duivVar.b);
                        duivVar.c = true;
                    }
                }
            }
        }
        super.a(status, feboVar);
    }
}
