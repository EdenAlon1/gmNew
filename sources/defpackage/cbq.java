package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbq {
    public ksr a;

    final ListenableFuture a(final Object obj) {
        biw.b();
        return kfg.a(new kfd() { // from class: cbp
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                cbq cbqVar = cbq.this;
                ksr ksrVar = cbqVar.a;
                if (ksrVar != null) {
                    kfb kfbVar2 = (kfb) ksrVar.a;
                    kfbVar2.getClass();
                    kfbVar2.d();
                }
                Object obj2 = obj;
                cbqVar.a = new ksr(kfbVar, obj2);
                Objects.toString(obj2);
                return "PendingValue ".concat(obj2.toString());
            }
        });
    }

    final void b(afd afdVar) {
        biw.b();
        ksr ksrVar = this.a;
        if (ksrVar != null) {
            ListenableFuture listenableFuture = (ListenableFuture) afdVar.a(ksrVar.b);
            kfb kfbVar = (kfb) this.a.a;
            kfbVar.getClass();
            bkj.j(listenableFuture, kfbVar);
            this.a = null;
        }
    }
}
