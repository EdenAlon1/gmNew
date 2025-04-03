package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabz implements apyd {
    final /* synthetic */ aaca a;

    public aabz(aaca aacaVar) {
        this.a = aacaVar;
    }

    @Override // defpackage.apyd
    public final /* synthetic */ apyv a() {
        return apyc.a(this);
    }

    @Override // defpackage.apyd
    public final /* synthetic */ apyv b(aqux aquxVar) {
        return apyc.b(this, aquxVar);
    }

    @Override // defpackage.apyd
    public final /* synthetic */ apza c(aqux aquxVar) {
        return apyc.c(this, aquxVar);
    }

    @Override // defpackage.apyd
    public final engw d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            apyd i = ((alxr) it.next()).i();
            Iterable d = i != null ? i.d() : null;
            if (d == null) {
                d = ffel.a;
            }
            ffdx.w(arrayList, d);
        }
        return engq.a(arrayList);
    }
}
