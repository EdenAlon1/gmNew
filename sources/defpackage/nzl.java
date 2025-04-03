package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzl extends nzh implements Iterable<nzh>, fflg {
    public static final /* synthetic */ int n = 0;
    public final cpo a;
    public int b;
    public String m;

    public nzl(oaj oajVar) {
        super(oajVar);
        this.a = new cpo(null);
    }

    @Override // defpackage.nzh
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, oat.d);
        obtainAttributes.getClass();
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.j) {
            this.b = resourceId;
            this.m = null;
            this.m = nzb.a(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    @Override // defpackage.nzh
    public final nzc e(nyz nyzVar) {
        return j(nyzVar, false, this);
    }

    @Override // defpackage.nzh
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof nzl) && super.equals(obj)) {
            nzl nzlVar = (nzl) obj;
            if (this.a.c() == nzlVar.a.c() && this.b == nzlVar.b) {
                Iterator a = ffno.b(new cpr(this.a)).a();
                while (a.hasNext()) {
                    nzh nzhVar = (nzh) a.next();
                    if (!ffkj.e(nzhVar, cpp.a(nzlVar.a, nzhVar.j))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final nzh g(int i) {
        return h(i, this, false, null);
    }

    public final nzh h(int i, nzh nzhVar, boolean z, nzh nzhVar2) {
        nzh nzhVar3;
        nzh nzhVar4 = (nzh) cpp.a(this.a, i);
        if (nzhVar2 == null ? nzhVar4 != null : ffkj.e(nzhVar4, nzhVar2) && ffkj.e(nzhVar4.d, nzhVar2.d)) {
            return nzhVar4;
        }
        if (z) {
            Iterator a = ffno.b(new cpr(this.a)).a();
            while (a.hasNext()) {
                nzh nzhVar5 = (nzh) a.next();
                nzhVar3 = (!(nzhVar5 instanceof nzl) || ffkj.e(nzhVar5, nzhVar)) ? null : ((nzl) nzhVar5).h(i, this, true, nzhVar2);
                if (nzhVar3 != null) {
                    break;
                }
            }
        }
        nzhVar3 = null;
        if (nzhVar3 != null) {
            return nzhVar3;
        }
        nzl nzlVar = this.d;
        if (nzlVar == null || ffkj.e(nzlVar, nzhVar)) {
            return null;
        }
        nzl nzlVar2 = this.d;
        nzlVar2.getClass();
        return nzlVar2.h(i, this, z, nzhVar2);
    }

    @Override // defpackage.nzh
    public final int hashCode() {
        int i = this.b;
        cpo cpoVar = this.a;
        int c = cpoVar.c();
        for (int i2 = 0; i2 < c; i2++) {
            i = (((i * 31) + cpoVar.b(i2)) * 31) + ((nzh) cpoVar.e(i2)).hashCode();
        }
        return i;
    }

    public final void i(nzh nzhVar) {
        int i = nzhVar.j;
        String str = nzhVar.k;
        if (i == 0) {
            if (str == null) {
                throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            }
            i = 0;
        }
        String str2 = this.k;
        if (str2 != null && ffkj.e(str, str2)) {
            throw new IllegalArgumentException(a.j(this, nzhVar, "Destination ", " cannot have the same route as graph "));
        }
        if (i == this.j) {
            throw new IllegalArgumentException(a.j(this, nzhVar, "Destination ", " cannot have the same id as graph "));
        }
        nzh nzhVar2 = (nzh) cpp.a(this.a, i);
        if (nzhVar2 != nzhVar) {
            if (nzhVar.d != null) {
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            if (nzhVar2 != null) {
                nzhVar2.d = null;
            }
            nzhVar.d = this;
            this.a.f(nzhVar.j, nzhVar);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<nzh> iterator() {
        return new nzk(this);
    }

    public final nzc j(nyz nyzVar, boolean z, nzh nzhVar) {
        nzc nzcVar;
        nzhVar.getClass();
        nzc e = super.e(nyzVar);
        ArrayList arrayList = new ArrayList();
        nzk nzkVar = new nzk(this);
        while (true) {
            if (!nzkVar.hasNext()) {
                break;
            }
            nzh next = nzkVar.next();
            nzcVar = ffkj.e(next, nzhVar) ? null : next.e(nyzVar);
            if (nzcVar != null) {
                arrayList.add(nzcVar);
            }
        }
        nzc nzcVar2 = (nzc) ffdx.F(arrayList);
        nzl nzlVar = this.d;
        if (nzlVar != null && z && !ffkj.e(nzlVar, nzhVar)) {
            nzcVar = nzlVar.j(nyzVar, true, this);
        }
        return (nzc) ffdx.F(ffdo.J(new nzc[]{e, nzcVar2, nzcVar}));
    }

    @Override // defpackage.nzh
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        nzh g = g(this.b);
        sb.append(" startDestination=");
        if (g == null) {
            String str = this.m;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x".concat(String.valueOf(Integer.toHexString(this.b))));
            }
        } else {
            sb.append("{");
            sb.append(g.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
