package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksr implements Runnable {
    final /* synthetic */ dkst a;

    public dksr(dkst dkstVar) {
        this.a = dkstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkty.c("Retrying all", new Object[0]);
        Iterator it = this.a.a.values().iterator();
        if (it.hasNext()) {
            dkss dkssVar = (dkss) it.next();
            Object obj = dkssVar.a;
            dksq dksqVar = dkssVar.b;
            dkty.c("Retrying element: %s", null);
            throw null;
        }
    }
}
