package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhy {
    public final mhx d;
    public final mir g;
    public final lua h;
    public boolean i;
    public lxp j;
    private final mlu l;
    public mvf k = new mvf();
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();
    public final HashMap e = new HashMap();
    public final Set f = new HashSet();

    public mhy(mhx mhxVar, mir mirVar, lua luaVar, mlu mluVar) {
        this.l = mluVar;
        this.d = mhxVar;
        this.g = mirVar;
        this.h = luaVar;
    }

    private final void h(int i, int i2) {
        while (i < this.a.size()) {
            ((mhw) this.a.get(i)).d += i2;
            i++;
        }
    }

    private final void i(mhw mhwVar) {
        mhv mhvVar = (mhv) this.e.get(mhwVar);
        if (mhvVar != null) {
            mhvVar.a.f(mhvVar.b);
        }
    }

    private final void j(mhw mhwVar) {
        if (mhwVar.e && mhwVar.c.isEmpty()) {
            mhv mhvVar = (mhv) this.e.remove(mhwVar);
            lti.f(mhvVar);
            mhvVar.a.m(mhvVar.b);
            mhvVar.a.p(mhvVar.c);
            mhvVar.a.o(mhvVar.c);
            this.f.remove(mhwVar);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final lru b() {
        if (this.a.isEmpty()) {
            return lru.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            mhw mhwVar = (mhw) this.a.get(i2);
            mhwVar.d = i;
            i += mhwVar.a.d.c();
        }
        return new mif(this.a, this.k);
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            mhw mhwVar = (mhw) it.next();
            if (mhwVar.c.isEmpty()) {
                i(mhwVar);
                it.remove();
            }
        }
    }

    public final void d(mhw mhwVar) {
        mtg mtgVar = mhwVar.a;
        mtm mtmVar = new mtm() { // from class: mhj
            @Override // defpackage.mtm
            public final void a(mtn mtnVar, lru lruVar) {
                mgx mgxVar = (mgx) mhy.this.d;
                mgxVar.e.a(2);
                mgxVar.e.i(22);
            }
        };
        mhu mhuVar = new mhu(this, mhwVar);
        this.e.put(mhwVar, new mhv(mtgVar, mtmVar, mhuVar));
        mtgVar.e(lvf.D(), mhuVar);
        mtgVar.d(lvf.D(), mhuVar);
        mtgVar.j(mtmVar, this.j, this.l);
    }

    public final void e(mtj mtjVar) {
        mhw mhwVar = (mhw) this.b.remove(mtjVar);
        lti.f(mhwVar);
        mhwVar.a.v(mtjVar);
        mhwVar.c.remove(((mtd) mtjVar).a);
        if (!this.b.isEmpty()) {
            c();
        }
        j(mhwVar);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            mhw mhwVar = (mhw) this.a.remove(i2);
            this.c.remove(mhwVar.b);
            h(i2, -mhwVar.a.d.c());
            mhwVar.e = true;
            if (this.i) {
                j(mhwVar);
            }
        }
    }

    public final lru g(int i, List list, mvf mvfVar) {
        if (!list.isEmpty()) {
            this.k = mvfVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                mhw mhwVar = (mhw) list.get(i2 - i);
                if (i2 > 0) {
                    mhw mhwVar2 = (mhw) this.a.get(i2 - 1);
                    mhwVar.c(mhwVar2.d + mhwVar2.a.d.c());
                } else {
                    mhwVar.c(0);
                }
                h(i2, mhwVar.a.d.c());
                this.a.add(i2, mhwVar);
                this.c.put(mhwVar.b, mhwVar);
                if (this.i) {
                    d(mhwVar);
                    if (this.b.isEmpty()) {
                        this.f.add(mhwVar);
                    } else {
                        i(mhwVar);
                    }
                }
            }
        }
        return b();
    }
}
