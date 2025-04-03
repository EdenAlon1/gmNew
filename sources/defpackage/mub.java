package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mub implements mtj, mti {
    public final mtj[] a;
    private final IdentityHashMap b;
    private final ArrayList c = new ArrayList();
    private final HashMap d = new HashMap();
    private mti e;
    private mvo f;
    private mtj[] g;
    private mve h;

    public mub(long[] jArr, mtj... mtjVarArr) {
        this.a = mtjVarArr;
        int i = engw.d;
        engw engwVar = enou.a;
        this.h = new msp(engwVar, engwVar);
        this.b = new IdentityHashMap();
        this.g = new mtj[0];
        for (int i2 = 0; i2 < mtjVarArr.length; i2++) {
            long j = jArr[i2];
            if (j != 0) {
                this.a[i2] = new mvl(mtjVarArr[i2], j);
            }
        }
    }

    @Override // defpackage.mtj
    public final long a(long j, min minVar) {
        mtj[] mtjVarArr = this.g;
        return (mtjVarArr.length > 0 ? mtjVarArr[0] : this.a[0]).a(j, minVar);
    }

    @Override // defpackage.mvd
    public final /* bridge */ /* synthetic */ void b(mve mveVar) {
        mti mtiVar = this.e;
        lti.f(mtiVar);
        mtiVar.b(this);
    }

    @Override // defpackage.mti
    public final void c(mtj mtjVar) {
        this.c.remove(mtjVar);
        if (!this.c.isEmpty()) {
            return;
        }
        int i = 0;
        for (mtj mtjVar2 : this.a) {
            i += mtjVar2.i().b;
        }
        lrv[] lrvVarArr = new lrv[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            mtj[] mtjVarArr = this.a;
            if (i2 >= mtjVarArr.length) {
                this.f = new mvo(lrvVarArr);
                mti mtiVar = this.e;
                lti.f(mtiVar);
                mtiVar.c(this);
                return;
            }
            mvo i4 = mtjVarArr[i2].i();
            int i5 = i4.b;
            int i6 = 0;
            while (i6 < i5) {
                lrv b = i4.b(i6);
                lqc[] lqcVarArr = new lqc[b.a];
                for (int i7 = 0; i7 < b.a; i7++) {
                    lqc a = b.a(i7);
                    lqb lqbVar = new lqb(a);
                    String str = a.a;
                    if (str == null) {
                        str = "";
                    }
                    lqbVar.a = i2 + ":" + str;
                    lqcVarArr[i7] = new lqc(lqbVar);
                }
                lrv lrvVar = new lrv(i2 + ":" + b.b, lqcVarArr);
                this.d.put(lrvVar, b);
                lrvVarArr[i3] = lrvVar;
                i6++;
                i3++;
            }
            i2++;
        }
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long d() {
        return this.h.d();
    }

    @Override // defpackage.mtj, defpackage.mve
    public final long e() {
        return this.h.e();
    }

    @Override // defpackage.mtj
    public final long f() {
        long j = -9223372036854775807L;
        for (mtj mtjVar : this.g) {
            long f = mtjVar.f();
            if (f != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (mtj mtjVar2 : this.g) {
                        if (mtjVar2 == mtjVar) {
                            break;
                        }
                        if (mtjVar2.g(f) != f) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = f;
                } else if (f != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && mtjVar.g(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.mtj
    public final long g(long j) {
        long g = this.g[0].g(j);
        int i = 1;
        while (true) {
            mtj[] mtjVarArr = this.g;
            if (i >= mtjVarArr.length) {
                return g;
            }
            if (mtjVarArr[i].g(g) != g) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.mtj
    public final long h(mxf[] mxfVarArr, boolean[] zArr, mvc[] mvcVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = mxfVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = mxfVarArr.length;
            if (i2 >= length) {
                break;
            }
            mvc mvcVar = mvcVarArr[i2];
            Integer num = mvcVar == null ? null : (Integer) this.b.get(mvcVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            mxf mxfVar = mxfVarArr[i2];
            if (mxfVar != null) {
                String str = mxfVar.g().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.b.clear();
        mvc[] mvcVarArr2 = new mvc[length];
        mvc[] mvcVarArr3 = new mvc[length];
        mxf[] mxfVarArr2 = new mxf[length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.a.length) {
            for (int i4 = i; i4 < mxfVarArr.length; i4++) {
                mvcVarArr3[i4] = iArr[i4] == i3 ? mvcVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    mxf mxfVar2 = mxfVarArr[i4];
                    lti.f(mxfVar2);
                    lrv lrvVar = (lrv) this.d.get(mxfVar2.g());
                    lti.f(lrvVar);
                    mxfVarArr2[i4] = new mua(mxfVar2, lrvVar);
                } else {
                    mxfVarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long h = this.a[i3].h(mxfVarArr2, zArr, mvcVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = h;
            } else if (h != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < mxfVarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    mvc mvcVar2 = mvcVarArr3[i5];
                    lti.f(mvcVar2);
                    mvcVarArr2[i5] = mvcVarArr3[i5];
                    this.b.put(mvcVar2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    lti.c(mvcVarArr3[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.a[i3]);
            }
            i3++;
            arrayList = arrayList2;
            i = 0;
        }
        int i6 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(mvcVarArr2, i6, mvcVarArr, i6, length);
        this.g = (mtj[]) arrayList3.toArray(new mtj[i6]);
        this.h = new msp(arrayList3, enkr.g(arrayList3, new emwl() { // from class: mtz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return engw.n(enkr.g(((mtj) obj).i().c, new emwl() { // from class: mvn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        mvo mvoVar = mvo.a;
                        return Integer.valueOf(((lrv) obj2).c);
                    }
                }));
            }
        }));
        return j2;
    }

    @Override // defpackage.mtj
    public final mvo i() {
        mvo mvoVar = this.f;
        lti.f(mvoVar);
        return mvoVar;
    }

    @Override // defpackage.mtj
    public final void j() {
        int i = 0;
        while (true) {
            mtj[] mtjVarArr = this.a;
            if (i >= mtjVarArr.length) {
                return;
            }
            mtjVarArr[i].j();
            i++;
        }
    }

    @Override // defpackage.mtj
    public final void k(mti mtiVar, long j) {
        this.e = mtiVar;
        Collections.addAll(this.c, this.a);
        int i = 0;
        while (true) {
            mtj[] mtjVarArr = this.a;
            if (i >= mtjVarArr.length) {
                return;
            }
            mtjVarArr[i].k(this, j);
            i++;
        }
    }

    @Override // defpackage.mtj, defpackage.mve
    public final void l(long j) {
        this.h.l(j);
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean n(mhc mhcVar) {
        if (this.c.isEmpty()) {
            return this.h.n(mhcVar);
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((mtj) this.c.get(i)).n(mhcVar);
        }
        return false;
    }

    @Override // defpackage.mtj, defpackage.mve
    public final boolean o() {
        return this.h.o();
    }

    @Override // defpackage.mtj
    public final void q(long j) {
        for (mtj mtjVar : this.g) {
            mtjVar.q(j);
        }
    }
}
