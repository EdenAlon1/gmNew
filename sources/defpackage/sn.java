package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sn implements ut {
    public final sl a;
    public final zt b;
    public final ya f;
    public final List c = new ArrayList();
    public final IdentityHashMap d = new IdentityHashMap();
    public final List e = new ArrayList();
    private sm g = new sm();

    public sn(sl slVar, sk skVar) {
        this.a = slVar;
        if (skVar.b) {
            this.b = new zp();
        } else {
            this.b = new zr();
        }
        this.f = new ya();
    }

    public final int a(uu uuVar) {
        uu uuVar2;
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext() && (uuVar2 = (uu) it.next()) != uuVar) {
            i += uuVar2.d;
        }
        return i;
    }

    public final sm b(int i) {
        sm smVar = this.g;
        if (smVar.c) {
            smVar = new sm();
        } else {
            smVar.c = true;
        }
        Iterator it = this.e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uu uuVar = (uu) it.next();
            int i3 = uuVar.d;
            if (i3 > i2) {
                smVar.a = uuVar;
                smVar.b = i2;
                break;
            }
            i2 -= i3;
        }
        if (smVar.a != null) {
            return smVar;
        }
        throw new IllegalArgumentException(a.h(i, "Cannot find wrapper for "));
    }

    public final uu c(wr wrVar) {
        uu uuVar = (uu) this.d.get(wrVar);
        if (uuVar != null) {
            return uuVar;
        }
        throw new IllegalStateException(a.j(this, wrVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
    }

    public final void d() {
        int i;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            uu uuVar = (uu) it.next();
            int i2 = uuVar.b.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && uuVar.d == 0)) {
                break;
            }
        }
        sl slVar = this.a;
        if (i != slVar.c) {
            slVar.m(i);
        }
    }

    @Override // defpackage.ut
    public final void e(uu uuVar, int i, int i2, Object obj) {
        this.a.v(i + a(uuVar), i2, obj);
    }

    public final void f(sm smVar) {
        smVar.c = false;
        smVar.a = null;
        smVar.b = -1;
        this.g = smVar;
    }
}
