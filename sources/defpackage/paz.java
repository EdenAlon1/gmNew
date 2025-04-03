package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class paz extends par {
    private par[] A;
    int w;
    ArrayList v = new ArrayList();
    private boolean y = true;
    boolean x = false;
    private int z = 0;

    private final void S(par parVar) {
        this.v.add(parVar);
        parVar.h = this;
    }

    private final void T(par[] parVarArr) {
        Arrays.fill(parVarArr, (Object) null);
        this.A = parVarArr;
    }

    private final par[] U() {
        par[] parVarArr = this.A;
        this.A = null;
        if (parVarArr == null) {
            parVarArr = new par[this.v.size()];
        }
        return (par[]) this.v.toArray(parVarArr);
    }

    @Override // defpackage.par
    public final void A(paa paaVar) {
        super.A(paaVar);
        this.z |= 4;
        if (this.v != null) {
            for (int i = 0; i < this.v.size(); i++) {
                ((par) this.v.get(i)).A(paaVar);
            }
        }
    }

    @Override // defpackage.par
    public final boolean C() {
        for (int i = 0; i < this.v.size(); i++) {
            if (((par) this.v.get(i)).C()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.par
    public final /* bridge */ /* synthetic */ void G(View view) {
        for (int i = 0; i < this.v.size(); i++) {
            ((par) this.v.get(i)).G(view);
        }
        super.G(view);
    }

    @Override // defpackage.par
    public final void H(Class cls) {
        for (int i = 0; i < this.v.size(); i++) {
            ((par) this.v.get(i)).H(cls);
        }
        super.H(cls);
    }

    @Override // defpackage.par
    public final /* bridge */ /* synthetic */ void J(View view) {
        for (int i = 0; i < this.v.size(); i++) {
            ((par) this.v.get(i)).J(view);
        }
        super.J(view);
    }

    @Override // defpackage.par
    public final void M() {
        this.z |= 2;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((par) this.v.get(i)).M();
        }
    }

    @Override // defpackage.par
    public final /* synthetic */ void N(long j) {
        this.a = j;
    }

    public final void O(par parVar) {
        S(parVar);
        long j = this.b;
        if (j >= 0) {
            parVar.K(j);
        }
        if ((this.z & 1) != 0) {
            parVar.L(this.c);
        }
        if ((this.z & 2) != 0) {
            parVar.M();
        }
        if ((this.z & 4) != 0) {
            parVar.A(this.r);
        }
        if ((this.z & 8) != 0) {
            parVar.z(this.q);
        }
    }

    @Override // defpackage.par
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void K(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.v) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((par) this.v.get(i)).K(j);
        }
    }

    public final void Q(int i) {
        this.y = i == 0;
    }

    @Override // defpackage.par
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void L(TimeInterpolator timeInterpolator) {
        this.z |= 1;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((par) this.v.get(i)).L(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.par
    public final void b(pbb pbbVar) {
        if (E(pbbVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                par parVar = (par) arrayList.get(i);
                if (parVar.E(pbbVar.b)) {
                    parVar.b(pbbVar);
                    pbbVar.c.add(parVar);
                }
            }
        }
    }

    @Override // defpackage.par
    public final void c(pbb pbbVar) {
        if (E(pbbVar.b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                par parVar = (par) arrayList.get(i);
                if (parVar.E(pbbVar.b)) {
                    parVar.c(pbbVar);
                    pbbVar.c.add(parVar);
                }
            }
        }
    }

    @Override // defpackage.par
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // defpackage.par
    public final boolean d() {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            if (!((par) this.v.get(i)).d()) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        return this.v.size();
    }

    public final par g(int i) {
        if (i < 0 || i >= this.v.size()) {
            return null;
        }
        return (par) this.v.get(i);
    }

    @Override // defpackage.par
    /* renamed from: i */
    public final par clone() {
        paz pazVar = (paz) super.clone();
        pazVar.v = new ArrayList();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            pazVar.S(((par) this.v.get(i)).clone());
        }
        return pazVar;
    }

    @Override // defpackage.par
    public final String m(String str) {
        String m = super.m(str);
        for (int i = 0; i < this.v.size(); i++) {
            m = m + "\n" + ((par) this.v.get(i)).m(str.concat("  "));
        }
        return m;
    }

    @Override // defpackage.par
    protected final void n() {
        super.n();
        par[] U = U();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            U[i].n();
        }
        T(U);
    }

    @Override // defpackage.par
    public final void o(pbb pbbVar) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((par) this.v.get(i)).o(pbbVar);
        }
    }

    @Override // defpackage.par
    public final void r(ViewGroup viewGroup, pbc pbcVar, pbc pbcVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.v.size();
        int i = 0;
        while (i < size) {
            par parVar = (par) this.v.get(i);
            if (j > 0) {
                if (!this.y) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = parVar.a;
                if (j2 > 0) {
                    parVar.N(j2 + j);
                } else {
                    parVar.N(j);
                }
            }
            parVar.r(viewGroup, pbcVar, pbcVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // defpackage.par
    public final void u(View view) {
        super.u(view);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((par) this.v.get(i)).u(view);
        }
    }

    @Override // defpackage.par
    public final void v() {
        this.s = 0L;
        pax paxVar = new pax(this);
        for (int i = 0; i < this.v.size(); i++) {
            par parVar = (par) this.v.get(i);
            parVar.F(paxVar);
            parVar.v();
            long j = parVar.s;
            if (this.y) {
                this.s = Math.max(this.s, j);
            } else {
                long j2 = this.s;
                parVar.u = j2;
                this.s = j2 + j;
            }
        }
    }

    @Override // defpackage.par
    public final void w(View view) {
        super.w(view);
        par[] U = U();
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            U[i].w(view);
        }
        T(U);
    }

    @Override // defpackage.par
    protected final void x() {
        if (this.v.isEmpty()) {
            B();
            s();
            return;
        }
        pay payVar = new pay(this);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((par) arrayList.get(i)).F(payVar);
        }
        this.w = this.v.size();
        if (this.y) {
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((par) arrayList2.get(i2)).x();
            }
            return;
        }
        for (int i3 = 1; i3 < this.v.size(); i3++) {
            ((par) this.v.get(i3 - 1)).F(new paw((par) this.v.get(i3)));
        }
        par parVar = (par) this.v.get(0);
        if (parVar != null) {
            parVar.x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.par
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.paz.y(long, long):void");
    }

    @Override // defpackage.par
    public final void z(pag pagVar) {
        this.q = pagVar;
        this.z |= 8;
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((par) this.v.get(i)).z(pagVar);
        }
    }
}
