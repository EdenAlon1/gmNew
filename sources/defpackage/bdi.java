package defpackage;

import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdi {
    public final Set a;
    public int b;
    public boolean c;
    public List d;
    public bfj e;
    public bcd f;
    private boolean g;
    private bfh h;

    public bdi() {
        this.a = new HashSet();
        this.h = bfh.a();
        this.b = -1;
        this.c = false;
        this.d = new ArrayList();
        this.g = false;
        this.e = bfj.a();
    }

    public final Range a() {
        return (Range) this.h.m(bdk.c, bgr.g);
    }

    public final bdk b() {
        ArrayList arrayList = new ArrayList(this.a);
        bfn f = bfn.f(this.h);
        int i = this.b;
        boolean z = this.c;
        ArrayList arrayList2 = new ArrayList(this.d);
        boolean z2 = this.g;
        bfj bfjVar = this.e;
        bgw bgwVar = bgw.a;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : bfjVar.d()) {
            arrayMap.put(str, bfjVar.c(str));
        }
        return new bdk(arrayList, f, i, z, arrayList2, z2, new bgw(arrayMap), this.f);
    }

    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((bbt) it.next());
        }
    }

    public final void d(bbt bbtVar) {
        if (this.d.contains(bbtVar)) {
            return;
        }
        this.d.add(bbtVar);
    }

    public final void e(bdn bdnVar, Object obj) {
        this.h.c(bdnVar, obj);
    }

    public final void f(bdp bdpVar) {
        for (bdn bdnVar : bdpVar.r()) {
            Object m = this.h.m(bdnVar, null);
            Object l = bdpVar.l(bdnVar);
            if (m instanceof bfg) {
                throw null;
            }
            if (l instanceof bfg) {
                l = ((bfg) l).clone();
            }
            this.h.d(bdnVar, bdpVar.h(bdnVar), l);
        }
    }

    public final void g(bdy bdyVar) {
        this.a.add(bdyVar);
    }

    public final void h(String str, Object obj) {
        this.e.b(str, obj);
    }

    public final void i() {
        this.a.clear();
    }

    public final void j(Range range) {
        e(bdk.c, range);
    }

    public final void k(bdp bdpVar) {
        this.h = bfh.b(bdpVar);
    }

    public final void l(int i) {
        if (i != 0) {
            e(bhh.y, Integer.valueOf(i));
        }
    }

    public final void m(int i) {
        if (i != 0) {
            e(bhh.z, Integer.valueOf(i));
        }
    }

    public final void n() {
        this.g = true;
    }

    public bdi(bdk bdkVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.h = bfh.a();
        this.b = -1;
        this.c = false;
        this.d = new ArrayList();
        this.g = false;
        this.e = bfj.a();
        hashSet.addAll(bdkVar.d);
        this.h = bfh.b(bdkVar.e);
        this.b = bdkVar.f;
        this.d.addAll(bdkVar.h);
        this.g = bdkVar.i;
        bgw bgwVar = bdkVar.j;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : bgwVar.d()) {
            arrayMap.put(str, bgwVar.c(str));
        }
        this.e = new bfj(arrayMap);
        this.c = bdkVar.g;
    }
}
