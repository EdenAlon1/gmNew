package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evdp extends fdzb {
    final /* synthetic */ evdq a;
    private febo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evdp(evdq evdqVar, fdxn fdxnVar) {
        super(fdxnVar);
        this.a = evdqVar;
    }

    @Override // defpackage.fech, defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        Status.Code code = status.getCode();
        if (!code.equals(Status.Code.UNAUTHENTICATED) && !code.equals(Status.Code.PERMISSION_DENIED)) {
            febo feboVar2 = this.b;
            if (feboVar2 != null) {
                this.f.b(feboVar2);
                this.b = null;
            }
            this.f.a(status, feboVar);
            return;
        }
        evdq evdqVar = this.a;
        synchronized (evdqVar.a) {
            evdqVar.c = evdqVar.d.a(evdqVar.e, evdqVar.f.f(evbt.a, true));
            Iterator it = evdqVar.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.fech, defpackage.fdxn
    public final void b(febo feboVar) {
        this.b = feboVar;
    }

    @Override // defpackage.fdzc, defpackage.fdxn
    public final void c(Object obj) {
        febo feboVar = this.b;
        if (feboVar != null) {
            this.f.b(feboVar);
            this.b = null;
        }
        this.f.c(obj);
    }
}
