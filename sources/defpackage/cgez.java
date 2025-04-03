package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgez implements ejxi {
    final /* synthetic */ cgfd a;

    public cgez(cgfd cgfdVar) {
        this.a = cgfdVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return cgfd.a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        Object cgddVar;
        if (adhu.a()) {
            cgfd cgfdVar = this.a;
            if (!((Optional) ((cgdo) cgfdVar.g.b()).c.get()).isEmpty()) {
                cgddVar = (cgdh) ((Optional) ((cgdo) cgfdVar.g.b()).c.get()).get();
                return elfo.e(cgddVar);
            }
        }
        cgddVar = new cgdd();
        return elfo.e(cgddVar);
    }
}
