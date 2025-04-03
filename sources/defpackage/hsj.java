package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsj {
    public static hsd d;
    public static long e;
    public static List g;
    public static List h;
    public static final hrp i;
    private static final hpm k;
    public static final ffji a = hsf.a;
    public static final hqg b = new hqg();
    public static final Object c = new Object();
    public static final hsa f = new hsa();
    private static final htf j = new htf();

    static {
        d = hsd.a;
        e = 2L;
        ffel ffelVar = ffel.a;
        g = ffelVar;
        h = ffelVar;
        long j2 = e;
        e = 1 + j2;
        hrp hrpVar = new hrp(j2, hsd.a);
        d = d.d(hrpVar.i);
        i = hrpVar;
        k = new hpm();
    }

    public static final void A() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean B(htm htmVar) {
        long a2 = f.a(e);
        hto htoVar = null;
        int i2 = 0;
        hto htoVar2 = null;
        for (hto d2 = htmVar.d(); d2 != null; d2 = d2.h) {
            long j2 = d2.g;
            if (j2 != 0) {
                if (j2 >= a2) {
                    i2++;
                } else if (htoVar == null) {
                    i2++;
                    htoVar = d2;
                } else {
                    long j3 = htoVar.g;
                    hto htoVar3 = j2 < j3 ? d2 : htoVar;
                    if (j2 >= j3) {
                        htoVar = d2;
                    }
                    if (htoVar2 == null) {
                        htoVar2 = htmVar.d();
                        hto htoVar4 = htoVar2;
                        while (true) {
                            if (htoVar2 == null) {
                                htoVar2 = htoVar4;
                                break;
                            }
                            long j4 = htoVar2.g;
                            if (j4 >= a2) {
                                break;
                            }
                            if (htoVar4.g < j4) {
                                htoVar4 = htoVar2;
                            }
                            htoVar2 = htoVar2.h;
                        }
                    }
                    htoVar3.g = 0L;
                    htoVar3.b(htoVar2);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean C(hto htoVar, long j2, hsd hsdVar) {
        long j3 = htoVar.g;
        return (j3 == 0 || j3 > j2 || hsdVar.e(j3)) ? false : true;
    }

    public static final hrw a(hrw hrwVar, ffji ffjiVar, boolean z) {
        boolean z2 = hrwVar instanceof hrq;
        if (z2 || hrwVar == null) {
            return new htr(z2 ? (hrq) hrwVar : null, ffjiVar, null, false, z);
        }
        return new hts(hrwVar, ffjiVar, z);
    }

    public static final hrw b() {
        hrw hrwVar = (hrw) b.a();
        return hrwVar == null ? i : hrwVar;
    }

    public static final hrw c(ffji ffjiVar) {
        return (hrw) m(new hsi(ffjiVar));
    }

    public static final hsd d(hsd hsdVar, long j2, long j3) {
        while (j2 < j3) {
            hsdVar = hsdVar.d(j2);
            j2++;
        }
        return hsdVar;
    }

    public static final hto e(hto htoVar) {
        hto k2;
        hrw b2 = b();
        hto k3 = k(htoVar, b2.v(), b2.x());
        if (k3 != null) {
            return k3;
        }
        synchronized (c) {
            hrw b3 = b();
            k2 = k(htoVar, b3.v(), b3.x());
        }
        if (k2 != null) {
            return k2;
        }
        z();
        throw new ffbx();
    }

    public static final hto f(hto htoVar, hrw hrwVar) {
        hto k2;
        hto k3 = k(htoVar, hrwVar.v(), hrwVar.x());
        if (k3 != null) {
            return k3;
        }
        synchronized (c) {
            k2 = k(htoVar, hrwVar.v(), hrwVar.x());
        }
        if (k2 != null) {
            return k2;
        }
        z();
        throw new ffbx();
    }

    public static final hto g(hto htoVar, htm htmVar) {
        hto d2 = htmVar.d();
        long a2 = f.a(e) - 1;
        hsd hsdVar = hsd.a;
        hto htoVar2 = null;
        hto htoVar3 = null;
        while (true) {
            if (d2 == null) {
                break;
            }
            if (d2.g == 0) {
                break;
            }
            if (C(d2, a2, hsdVar)) {
                if (htoVar3 == null) {
                    htoVar3 = d2;
                } else if (d2.g >= htoVar3.g) {
                    htoVar2 = htoVar3;
                }
            }
            d2 = d2.h;
        }
        htoVar2 = d2;
        if (htoVar2 != null) {
            htoVar2.g = Long.MAX_VALUE;
            return htoVar2;
        }
        hto a3 = htoVar.a(Long.MAX_VALUE);
        a3.h = htmVar.d();
        htmVar.e(a3);
        return a3;
    }

    public static final hto h(hto htoVar, htm htmVar, hrw hrwVar) {
        hto g2 = g(htoVar, htmVar);
        g2.b(htoVar);
        g2.g = hrwVar.v();
        return g2;
    }

    public static final hto i(hto htoVar, htm htmVar, hrw hrwVar, hto htoVar2) {
        hto g2;
        if (hrwVar.u()) {
            hrwVar.p(htmVar);
        }
        long v = hrwVar.v();
        if (htoVar2.g == v) {
            return htoVar2;
        }
        synchronized (c) {
            g2 = g(htoVar, htmVar);
        }
        g2.g = v;
        if (htoVar2.g != 1) {
            hrwVar.p(htmVar);
        }
        return g2;
    }

    public static final hto j(hto htoVar, htm htmVar) {
        hto k2;
        hrw b2 = b();
        ffji k3 = b2.k();
        if (k3 != null) {
            k3.invoke(htmVar);
        }
        hto k4 = k(htoVar, b2.v(), b2.x());
        if (k4 != null) {
            return k4;
        }
        synchronized (c) {
            hrw b3 = b();
            hto d2 = htmVar.d();
            d2.getClass();
            k2 = k(d2, b3.v(), b3.x());
            if (k2 == null) {
                z();
                throw new ffbx();
            }
        }
        return k2;
    }

    public static final hto k(hto htoVar, long j2, hsd hsdVar) {
        hto htoVar2 = null;
        while (htoVar != null) {
            if (C(htoVar, j2, hsdVar) && (htoVar2 == null || htoVar2.g < htoVar.g)) {
                htoVar2 = htoVar;
            }
            htoVar = htoVar.h;
        }
        if (htoVar2 != null) {
            return htoVar2;
        }
        return null;
    }

    public static final hto l(hto htoVar, htm htmVar, hrw hrwVar) {
        hto k2;
        if (hrwVar.u()) {
            hrwVar.p(htmVar);
        }
        long v = hrwVar.v();
        hto k3 = k(htoVar, v, hrwVar.x());
        if (k3 == null) {
            z();
            throw new ffbx();
        }
        if (k3.g == hrwVar.v()) {
            return k3;
        }
        synchronized (c) {
            k2 = k(htmVar.d(), v, hrwVar.x());
            if (k2 == null) {
                z();
                throw new ffbx();
            }
            if (k2.g != v) {
                k2 = h(k2, htmVar, hrwVar);
            }
        }
        if (k3.g != 1) {
            hrwVar.p(htmVar);
        }
        return k2;
    }

    public static final Object m(ffji ffjiVar) {
        coq coqVar;
        Object n;
        int i2;
        hrp hrpVar = i;
        synchronized (c) {
            coqVar = hrpVar.d;
            if (coqVar != null) {
                k.addAndGet(1);
            }
            n = n(hrpVar, ffjiVar);
        }
        if (coqVar != null) {
            try {
                List list = g;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ffjm) list.get(i3)).a(new hnh(coqVar), hrpVar);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            s();
            if (coqVar != null) {
                Object[] objArr = coqVar.b;
                long[] jArr = coqVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j2 = jArr[i4];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = ~(i4 - length);
                            int i6 = 0;
                            while (true) {
                                i2 = 8 - (i5 >>> 31);
                                if (i6 >= i2) {
                                    break;
                                }
                                if ((255 & j2) < 128) {
                                    u((htm) objArr[(i4 << 3) + i6]);
                                }
                                j2 >>= 8;
                                i6++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return n;
    }

    public static final Object n(hrp hrpVar, ffji ffjiVar) {
        long j2 = hrpVar.i;
        Object invoke = ffjiVar.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        d = d.b(j2);
        hrpVar.i = j3;
        hrpVar.h = d;
        hrpVar.c = 0;
        hrpVar.d = null;
        hrpVar.z();
        d = d.d(j3);
        return invoke;
    }

    public static final Map o(long j2, hrq hrqVar, hsd hsdVar) {
        long[] jArr;
        Map map;
        hsd hsdVar2;
        long[] jArr2;
        char c2;
        hsd hsdVar3;
        hto k2;
        long j3 = j2;
        coq i2 = hrqVar.i();
        Map map2 = null;
        if (i2 == null) {
            return null;
        }
        hsd c3 = hrqVar.x().d(hrqVar.v()).c(hrqVar.e);
        Object[] objArr = i2.b;
        long[] jArr3 = i2.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap hashMap = null;
        int i3 = 0;
        while (true) {
            long j4 = jArr3[i3];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    map = map2;
                    int i6 = 8 - ((~i4) >>> 31);
                    if (i5 < i6) {
                        if ((j4 & 255) < 128) {
                            htm htmVar = (htm) objArr[(i3 << 3) + i5];
                            hto d2 = htmVar.d();
                            jArr2 = jArr3;
                            c2 = '\b';
                            hto k3 = k(d2, j3, hsdVar);
                            if (k3 != null && (k2 = k(d2, j3, c3)) != null && !ffkj.e(k3, k2)) {
                                hsdVar3 = c3;
                                hto k4 = k(d2, hrqVar.v(), hrqVar.x());
                                if (k4 == null) {
                                    z();
                                    throw new ffbx();
                                }
                                hto g2 = htmVar.g(k2, k3, k4);
                                if (g2 == null) {
                                    return map;
                                }
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(k3, g2);
                                j4 >>= c2;
                                i5++;
                                j3 = j2;
                                map2 = map;
                                jArr3 = jArr2;
                                c3 = hsdVar3;
                            }
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                        }
                        hsdVar3 = c3;
                        j4 >>= c2;
                        i5++;
                        j3 = j2;
                        map2 = map;
                        jArr3 = jArr2;
                        c3 = hsdVar3;
                    } else {
                        jArr = jArr3;
                        hsdVar2 = c3;
                        if (i6 != 8) {
                            return hashMap;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                map = map2;
                hsdVar2 = c3;
            }
            if (i3 == length) {
                return hashMap;
            }
            i3++;
            j3 = j2;
            map2 = map;
            jArr3 = jArr;
            c3 = hsdVar2;
        }
    }

    public static final ffji p(ffji ffjiVar, ffji ffjiVar2, boolean z) {
        if (true != z) {
            ffjiVar2 = null;
        }
        return (ffjiVar == null || ffjiVar2 == null || ffjiVar == ffjiVar2) ? ffjiVar == null ? ffjiVar2 : ffjiVar : new hsg(ffjiVar, ffjiVar2);
    }

    public static final ffji q(ffji ffjiVar, ffji ffjiVar2) {
        return (ffjiVar == null || ffjiVar2 == null || ffjiVar == ffjiVar2) ? ffjiVar == null ? ffjiVar2 : ffjiVar : new hsh(ffjiVar, ffjiVar2);
    }

    public static final void r() {
        m(a);
    }

    public static final void s() {
        htf htfVar = j;
        int i2 = htfVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            hql hqlVar = htfVar.c[i3];
            Object obj = hqlVar != null ? hqlVar.get() : null;
            if (obj != null && B((htm) obj)) {
                if (i4 != i3) {
                    htfVar.c[i4] = hqlVar;
                    int[] iArr = htfVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            htfVar.c[i5] = null;
            htfVar.b[i5] = 0;
        }
        if (i4 != i2) {
            htfVar.a = i4;
        }
    }

    public static final void t(hrw hrwVar, htm htmVar) {
        hrwVar.t(hrwVar.h() + 1);
        ffji m = hrwVar.m();
        if (m != null) {
            m.invoke(htmVar);
        }
    }

    public static final void u(htm htmVar) {
        if (B(htmVar)) {
            htf htfVar = j;
            int i2 = htfVar.a;
            int identityHashCode = System.identityHashCode(htmVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = htfVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = htfVar.b[i6];
                        if (i7 >= identityHashCode) {
                            if (i7 <= identityHashCode) {
                                hql hqlVar = htfVar.c[i6];
                                if (htmVar != (hqlVar != null ? hqlVar.get() : null)) {
                                    i3 = i6 - 1;
                                    while (i3 >= 0 && htfVar.b[i3] == identityHashCode) {
                                        hql hqlVar2 = htfVar.c[i3];
                                        if ((hqlVar2 != null ? hqlVar2.get() : null) == htmVar) {
                                            break;
                                        } else {
                                            i3--;
                                        }
                                    }
                                    i6++;
                                    int i8 = htfVar.a;
                                    while (i6 < i8) {
                                        if (htfVar.b[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        } else {
                                            hql hqlVar3 = htfVar.c[i6];
                                            if ((hqlVar3 != null ? hqlVar3.get() : null) != htmVar) {
                                                i6++;
                                            }
                                        }
                                    }
                                    i5 = htfVar.a;
                                }
                                i3 = i6;
                                break;
                            } else {
                                i4 = i6 - 1;
                            }
                        } else {
                            i5 = i6 + 1;
                        }
                    } else {
                        break;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            hql[] hqlVarArr = htfVar.c;
            int length = hqlVarArr.length;
            if (i2 == length) {
                int i11 = length + length;
                hql[] hqlVarArr2 = new hql[i11];
                int[] iArr = new int[i11];
                System.arraycopy(hqlVarArr, i9, hqlVarArr2, i10, i2 - i9);
                System.arraycopy(htfVar.c, 0, hqlVarArr2, 0, i9);
                ffdo.l(htfVar.b, iArr, i10, i9, i2);
                ffdo.p(htfVar.b, iArr, 0, i9, 6);
                htfVar.c = hqlVarArr2;
                htfVar.b = iArr;
            } else {
                System.arraycopy(hqlVarArr, i9, hqlVarArr, i10, i2 - i9);
                int[] iArr2 = htfVar.b;
                ffdo.l(iArr2, iArr2, i10, i9, i2);
            }
            htfVar.c[i9] = new hql(htmVar);
            htfVar.b[i9] = identityHashCode;
            htfVar.a++;
        }
    }

    public static final void v(int i2) {
        hsa hsaVar = f;
        int i3 = hsaVar.d[i2];
        hsaVar.c(i3, hsaVar.a - 1);
        hsaVar.a--;
        hsaVar.b(i3);
        long[] jArr = hsaVar.b;
        int i4 = hsaVar.a >> 1;
        while (i3 < i4) {
            int i5 = i3 + 1;
            int i6 = i5 + i5;
            int i7 = i6 - 1;
            if (i6 < hsaVar.a) {
                long j2 = jArr[i6];
                if (j2 < jArr[i7]) {
                    if (j2 >= jArr[i3]) {
                        break;
                    }
                    hsaVar.c(i6, i3);
                    i3 = i6;
                }
            }
            if (jArr[i7] >= jArr[i3]) {
                break;
            }
            hsaVar.c(i7, i3);
            i3 = i7;
        }
        hsaVar.d[i2] = hsaVar.e;
        hsaVar.e = i2;
    }

    public static final void w(hrw hrwVar) {
        long a2;
        if (d.e(hrwVar.v())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(hrwVar.v());
        sb.append(", disposed=");
        sb.append(hrwVar.j);
        sb.append(", applied=");
        hrq hrqVar = hrwVar instanceof hrq ? (hrq) hrwVar : null;
        sb.append(hrqVar != null ? Boolean.valueOf(hrqVar.g) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            a2 = f.a(-1L);
        }
        sb.append(a2);
        throw new IllegalStateException(sb.toString());
    }

    public static final void z() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
}
