package androidx.work.impl;

import defpackage.orp;
import defpackage.osg;
import defpackage.oti;
import defpackage.oxk;
import defpackage.oxn;
import defpackage.psr;
import defpackage.pss;
import defpackage.pst;
import defpackage.psu;
import defpackage.psv;
import defpackage.psw;
import defpackage.psx;
import defpackage.psy;
import defpackage.psz;
import defpackage.pwz;
import defpackage.pxb;
import defpackage.pxd;
import defpackage.pxf;
import defpackage.pxg;
import defpackage.pxj;
import defpackage.pxm;
import defpackage.pxq;
import defpackage.pxu;
import defpackage.pxw;
import defpackage.pxy;
import defpackage.pyc;
import defpackage.pyk;
import defpackage.pzg;
import defpackage.pzj;
import defpackage.pzm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile pyk l;
    private volatile pwz m;
    private volatile pzj n;
    private volatile pxm o;
    private volatile pxu p;
    private volatile pxy q;
    private volatile pxd r;
    private volatile pxg s;

    @Override // androidx.work.impl.WorkDatabase
    public final pxm A() {
        pxm pxmVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new pxq(this);
            }
            pxmVar = this.o;
        }
        return pxmVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pxu B() {
        pxu pxuVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new pxw(this);
            }
            pxuVar = this.p;
        }
        return pxuVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pxy C() {
        pxy pxyVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new pyc(this);
            }
            pxyVar = this.q;
        }
        return pxyVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pyk D() {
        pyk pykVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new pzg(this);
            }
            pykVar = this.l;
        }
        return pykVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pzj E() {
        pzj pzjVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new pzm(this);
            }
            pzjVar = this.n;
        }
        return pzjVar;
    }

    @Override // defpackage.otb
    protected final osg a() {
        return new osg(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.otb
    protected final oxn d(orp orpVar) {
        oti otiVar = new oti(orpVar, new psz(this));
        return orpVar.c.a(oxk.a(orpVar.a, orpVar.b, otiVar, false, false));
    }

    @Override // defpackage.otb
    protected final Map g() {
        HashMap hashMap = new HashMap();
        hashMap.put(pyk.class, Collections.EMPTY_LIST);
        hashMap.put(pwz.class, Collections.EMPTY_LIST);
        hashMap.put(pzj.class, Collections.EMPTY_LIST);
        hashMap.put(pxm.class, Collections.EMPTY_LIST);
        hashMap.put(pxu.class, Collections.EMPTY_LIST);
        hashMap.put(pxy.class, Collections.EMPTY_LIST);
        hashMap.put(pxd.class, Collections.EMPTY_LIST);
        hashMap.put(pxg.class, Collections.EMPTY_LIST);
        return hashMap;
    }

    @Override // defpackage.otb
    public final Set h() {
        return new HashSet();
    }

    @Override // defpackage.otb
    public final List v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new psr());
        arrayList.add(new pss());
        arrayList.add(new pst());
        arrayList.add(new psu());
        arrayList.add(new psv());
        arrayList.add(new psw());
        arrayList.add(new psx());
        arrayList.add(new psy());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pwz x() {
        pwz pwzVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new pxb(this);
            }
            pwzVar = this.m;
        }
        return pwzVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pxd y() {
        pxd pxdVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new pxf(this);
            }
            pxdVar = this.r;
        }
        return pxdVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final pxg z() {
        pxg pxgVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new pxj(this);
            }
            pxgVar = this.s;
        }
        return pxgVar;
    }
}
