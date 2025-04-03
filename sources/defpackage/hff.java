package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hff extends hfr {
    public final Set a = new LinkedHashSet();
    public final hho b = new hic(hqb.d, hji.a);
    final /* synthetic */ hfm c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private Set g;

    public hff(hfm hfmVar, int i, boolean z, boolean z2) {
        this.c = hfmVar;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.hfr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.hfr
    public final hfq b() {
        return this.c.f;
    }

    @Override // defpackage.hfr
    public final hhm c(hhn hhnVar) {
        return this.c.b.c(hhnVar);
    }

    @Override // defpackage.hfr
    public final ffhd d() {
        return this.c.b.d();
    }

    @Override // defpackage.hfr
    public final void e(hgh hghVar, ffjm ffjmVar) {
        this.c.b.e(hghVar, ffjmVar);
    }

    @Override // defpackage.hfr
    public final void f(hhn hhnVar) {
        this.c.b.f(hhnVar);
    }

    public final void g() {
        if (this.a.isEmpty()) {
            return;
        }
        Set set = this.g;
        if (set != null) {
            for (hfm hfmVar : this.a) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(hfmVar.c);
                }
            }
        }
        this.a.clear();
    }

    @Override // defpackage.hfr
    public final void h() {
        hfm hfmVar = this.c;
        hfmVar.p--;
    }

    @Override // defpackage.hfr
    public final void i(hgh hghVar) {
        hfm hfmVar = this.c;
        hfmVar.b.i(hfmVar.f);
        this.c.b.i(hghVar);
    }

    @Override // defpackage.hfr
    public final void j(hhn hhnVar, hhm hhmVar, hep hepVar) {
        this.c.b.j(hhnVar, hhmVar, hepVar);
    }

    @Override // defpackage.hfr
    public final void k(Set set) {
        Set set2 = this.g;
        if (set2 == null) {
            set2 = new HashSet();
            this.g = set2;
        }
        set2.add(set);
    }

    @Override // defpackage.hfr
    public final void l(hfd hfdVar) {
        this.a.add(hfdVar);
    }

    @Override // defpackage.hfr
    public final void m(hgh hghVar) {
        this.c.b.m(hghVar);
    }

    @Override // defpackage.hfr
    public final void n() {
        this.c.p++;
    }

    @Override // defpackage.hfr
    public final void o(hfd hfdVar) {
        Set set = this.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(((hfm) hfdVar).c);
            }
        }
        Set set2 = this.a;
        fflf.f(set2);
        set2.remove(hfdVar);
    }

    @Override // defpackage.hfr
    public final void p(hgh hghVar) {
        this.c.b.p(hghVar);
    }

    @Override // defpackage.hfr
    public final boolean q() {
        return this.c.b.q();
    }

    @Override // defpackage.hfr
    public final boolean r() {
        return this.e;
    }

    @Override // defpackage.hfr
    public final boolean s() {
        return this.f;
    }

    @Override // defpackage.hfr
    public final hqb t() {
        return (hqb) this.b.a();
    }
}
