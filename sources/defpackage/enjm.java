package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enjm extends enbj {
    final /* synthetic */ Iterator a;
    final /* synthetic */ emxg b;

    public enjm(Iterator it, emxg emxgVar) {
        this.a = it;
        this.b = emxgVar;
    }

    @Override // defpackage.enbj
    protected final Object a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
            emxg emxgVar = this.b;
            Object next = it.next();
            if (emxgVar.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
