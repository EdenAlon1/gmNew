package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class ocd {
    public final mw a;
    public final mc b;
    public final Executor c = aer.a;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public oiv e;
    public oiv f;
    public int g;
    public final oio h;
    public final ffmq i;
    public final List j;
    public final oil k;

    @ffbs
    public ocd(mw mwVar, mc mcVar) {
        ocb ocbVar = new ocb(this);
        this.h = ocbVar;
        this.i = new oca(ocbVar);
        this.j = new CopyOnWriteArrayList();
        this.k = new occ(this);
        this.a = mwVar;
        this.b = mcVar;
    }

    public final int a() {
        oiv c = c();
        if (c != null) {
            return c.l();
        }
        return 0;
    }

    public final mw b() {
        mw mwVar = this.a;
        if (mwVar != null) {
            return mwVar;
        }
        ffkj.c("updateCallback");
        return null;
    }

    public final oiv c() {
        oiv oivVar = this.f;
        return oivVar == null ? this.e : oivVar;
    }

    public final void d(oiv oivVar, oiv oivVar2) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((obz) it.next()).a.a(oivVar, oivVar2);
        }
    }
}
