package androidx.compose.foundation.lazy.layout;

import defpackage.cop;
import defpackage.coq;
import defpackage.cpg;
import defpackage.cpj;
import defpackage.eiq;
import defpackage.eir;
import defpackage.eis;
import defpackage.eix;
import defpackage.ejs;
import defpackage.elp;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.hvi;
import defpackage.iga;
import defpackage.itg;
import defpackage.ivp;
import defpackage.kaa;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator {
    public final List a;
    public itg b;
    public final hvi c;
    private final cop d;
    private int e;
    private final coq f;
    private final List g;
    private final List h;
    private final List i;
    private final List j;
    private elp k;

    /* compiled from: PG */
    private static final class DisplayingDisappearingItemsElement extends ivp<eir> {
        private final LazyLayoutItemAnimator a;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.a = lazyLayoutItemAnimator;
        }

        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ hvh d() {
            return new eir(this.a);
        }

        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
            eir eirVar = (eir) hvhVar;
            LazyLayoutItemAnimator lazyLayoutItemAnimator = eirVar.a;
            LazyLayoutItemAnimator lazyLayoutItemAnimator2 = this.a;
            if (ffkj.e(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !eirVar.p.z) {
                return;
            }
            eirVar.a.c();
            lazyLayoutItemAnimator2.b = eirVar;
            eirVar.a = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && ffkj.e(this.a, ((DisplayingDisappearingItemsElement) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = cpg.a;
        this.d = new cop((byte[]) null);
        int i = cpj.a;
        this.f = new coq((byte[]) null);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.a = new ArrayList();
        this.c = new DisplayingDisappearingItemsElement(this);
    }

    static /* synthetic */ void d(LazyLayoutItemAnimator lazyLayoutItemAnimator, ejs ejsVar, int i) {
        Object f = lazyLayoutItemAnimator.d.f(ejsVar.h());
        f.getClass();
        j(ejsVar, i, (eis) f);
    }

    private final void f() {
        int i;
        cop copVar = this.d;
        if (copVar.k()) {
            Object[] objArr = copVar.c;
            long[] jArr = copVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                for (eiq eiqVar : ((eis) objArr[(i2 << 3) + i4]).a) {
                                    if (eiqVar != null) {
                                        eiqVar.d();
                                    }
                                }
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.d.d();
        }
    }

    private final void g(Object obj) {
        eiq[] eiqVarArr;
        eis eisVar = (eis) this.d.b(obj);
        if (eisVar == null || (eiqVarArr = eisVar.a) == null) {
            return;
        }
        for (eiq eiqVar : eiqVarArr) {
            if (eiqVar != null) {
                eiqVar.d();
            }
        }
    }

    private static final boolean h(ejs ejsVar) {
        int d = ejsVar.d();
        for (int i = 0; i < d; i++) {
            if (eix.a(ejsVar.i(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private static final int i(ejs ejsVar) {
        long g = ejsVar.g(0);
        return ejsVar.m() ? kaa.b(g) : kaa.a(g);
    }

    private static final void j(ejs ejsVar, int i, eis eisVar) {
        int i2 = 0;
        long g = ejsVar.g(0);
        long g2 = ejsVar.m() ? kaa.g(g, 0, i, 1) : kaa.g(g, i, 0, 2);
        eiq[] eiqVarArr = eisVar.a;
        int length = eiqVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            eiq eiqVar = eiqVarArr[i2];
            int i4 = i3 + 1;
            if (eiqVar != null) {
                eiqVar.b = kaa.d(g2, kaa.c(ejsVar.g(i3), g));
            }
            i2++;
            i3 = i4;
        }
    }

    private final void k(ejs ejsVar) {
        Object f = this.d.f(ejsVar.h());
        f.getClass();
        eiq[] eiqVarArr = ((eis) f).a;
        int length = eiqVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            eiq eiqVar = eiqVarArr[i];
            int i3 = i2 + 1;
            if (eiqVar != null) {
                eiqVar.b = ejsVar.g(i2);
            }
            i++;
            i2 = i3;
        }
    }

    private static final int l(int[] iArr, ejs ejsVar) {
        int b = ejsVar.b();
        int e = ejsVar.e() + b;
        int i = 0;
        while (b < e) {
            int c = iArr[b] + ejsVar.c();
            iArr[b] = c;
            i = Math.max(i, c);
            b++;
        }
        return i;
    }

    public final long a() {
        List list = this.a;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            eiq eiqVar = (eiq) list.get(i);
            iga igaVar = eiqVar.d;
            if (igaVar != null) {
                j = (Math.max((int) (j & 4294967295L), kaa.b(eiqVar.b) + ((int) (igaVar.n & 4294967295L))) & 4294967295L) | (Math.max((int) (j >> 32), kaa.a(eiqVar.b) + ((int) (igaVar.n >> 32))) << 32);
            }
        }
        return j;
    }

    public final eiq b(Object obj, int i) {
        eiq[] eiqVarArr;
        eis eisVar = (eis) this.d.f(obj);
        if (eisVar == null || (eiqVarArr = eisVar.a) == null) {
            return null;
        }
        return eiqVarArr[i];
    }

    public final void c() {
        f();
        this.k = null;
        this.e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r37, int r38, int r39, java.util.List r40, defpackage.elp r41, defpackage.ejv r42, boolean r43, boolean r44, int r45, boolean r46, int r47, int r48, defpackage.ffsk r49, defpackage.iaw r50) {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e(int, int, int, java.util.List, elp, ejv, boolean, boolean, int, boolean, int, int, ffsk, iaw):void");
    }
}
