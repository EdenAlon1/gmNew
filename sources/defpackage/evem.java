package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evem implements erqj {
    final /* synthetic */ fdxn a;
    final /* synthetic */ even b;

    public evem(even evenVar, fdxn fdxnVar) {
        this.a = fdxnVar;
        this.b = evenVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fdxo fdxoVar = (fdxo) obj;
        try {
            even evenVar = this.b;
            evenVar.b = fdxoVar;
            Iterator it = evenVar.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } catch (Throwable th) {
            hx(th);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.b.d = true;
        this.a.a(Status.c(th), new febo());
    }
}
