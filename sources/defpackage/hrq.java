package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hrq extends hrw {
    private static final int[] l = new int[0];
    public final ffji a;
    public final ffji b;
    public int c;
    public coq d;
    public hsd e;
    public int[] f;
    public boolean g;
    private List m;
    private int n;

    public hrq(long j, hsd hsdVar, ffji ffjiVar, ffji ffjiVar2) {
        super(j, hsdVar);
        this.a = ffjiVar;
        this.b = ffjiVar2;
        this.e = hsd.a;
        this.f = l;
        this.n = 1;
    }

    private final void F() {
        if (!this.g || this.k >= 0) {
            return;
        }
        hih.b("Unsupported operation on a disposed or applied snapshot");
    }

    public hrq a(ffji ffjiVar, ffji ffjiVar2) {
        ffji p;
        C();
        F();
        q(v());
        synchronized (hsj.c) {
            try {
                long j = hsj.e;
                hsj.e = j + 1;
                hsj.d = hsj.d.d(j);
                hsd x = x();
                A(x.d(j));
                hsd d = hsj.d(x, v() + 1, j);
                p = hsj.p(ffjiVar, k(), true);
                try {
                    hrr hrrVar = new hrr(j, d, p, hsj.q(ffjiVar2, m()), this);
                    if (this.g || this.j) {
                        return hrrVar;
                    }
                    long v = v();
                    synchronized (hsj.c) {
                        long j2 = hsj.e;
                        hsj.e = j2 + 1;
                        B(j2);
                        hsj.d = hsj.d.d(v());
                    }
                    A(hsj.d(x(), v + 1, v()));
                    return hrrVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.hrw
    public hrw b(ffji ffjiVar) {
        ffji p;
        C();
        F();
        long v = v();
        q(v());
        synchronized (hsj.c) {
            try {
                long j = hsj.e;
                hsj.e = j + 1;
                hsj.d = hsj.d.d(j);
                hsd d = hsj.d(x(), v + 1, j);
                p = hsj.p(ffjiVar, k(), true);
                try {
                    hrs hrsVar = new hrs(j, d, p, this);
                    if (this.g || this.j) {
                        return hrsVar;
                    }
                    long v2 = v();
                    synchronized (hsj.c) {
                        long j2 = hsj.e;
                        hsj.e = j2 + 1;
                        B(j2);
                        hsj.d = hsj.d.d(v());
                    }
                    A(hsj.d(x(), v2 + 1, v()));
                    return hrsVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[LOOP:1: B:31:0x00a6->B:32:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b A[Catch: all -> 0x0161, TryCatch #0 {, blocks: (B:37:0x00b7, B:39:0x00c7, B:42:0x00d3, B:44:0x00df, B:46:0x00e9, B:48:0x00ef, B:50:0x00fa, B:56:0x010b, B:59:0x0115, B:61:0x011f, B:63:0x0129, B:65:0x012f, B:67:0x0139, B:73:0x0141, B:75:0x0144, B:77:0x0148, B:79:0x014f, B:81:0x015b, B:87:0x0102), top: B:36:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148 A[Catch: all -> 0x0161, TryCatch #0 {, blocks: (B:37:0x00b7, B:39:0x00c7, B:42:0x00d3, B:44:0x00df, B:46:0x00e9, B:48:0x00ef, B:50:0x00fa, B:56:0x010b, B:59:0x0115, B:61:0x011f, B:63:0x0129, B:65:0x012f, B:67:0x0139, B:73:0x0141, B:75:0x0144, B:77:0x0148, B:79:0x014f, B:81:0x015b, B:87:0x0102), top: B:36:0x00b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.hrz c() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrq.c():hrz");
    }

    @Override // defpackage.hrw
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.hrw
    public void e() {
        if (this.g || this.j) {
            return;
        }
        n();
    }

    @Override // defpackage.hrw
    public void f() {
        this.n++;
    }

    @Override // defpackage.hrw
    public void g() {
        int i;
        if (this.n <= 0) {
            hih.a("no pending nested snapshots");
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 != 0 || this.g) {
            return;
        }
        coq i3 = i();
        if (i3 != null) {
            if (this.g) {
                hih.b("Unsupported operation on a snapshot that has been applied");
            }
            s(null);
            long v = v();
            Object[] objArr = i3.b;
            long[] jArr = i3.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = ~(i4 - length);
                        int i6 = 0;
                        while (true) {
                            i = 8 - (i5 >>> 31);
                            if (i6 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                for (hto d = ((htm) objArr[(i4 << 3) + i6]).d(); d != null; d = d.h) {
                                    long j2 = d.g;
                                    if (j2 == v || ffdx.au(this.e, Long.valueOf(j2))) {
                                        ffji ffjiVar = hsj.a;
                                        d.g = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                            i6++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        y();
    }

    @Override // defpackage.hrw
    public int h() {
        return this.c;
    }

    public coq i() {
        return this.d;
    }

    public final hrz j(long j, coq coqVar, Map map, hsd hsdVar) {
        List list;
        hsd hsdVar2;
        Object[] objArr;
        long[] jArr;
        hsd hsdVar3;
        long[] jArr2;
        int i;
        ArrayList arrayList;
        long j2;
        int i2;
        hto g;
        hsd c = x().d(v()).c(this.e);
        Object[] objArr2 = coqVar.b;
        long[] jArr3 = coqVar.a;
        int length = jArr3.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            list = null;
            int i3 = 0;
            while (true) {
                long j3 = jArr3[i3];
                ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    objArr = objArr2;
                    arrayList2 = arrayList3;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            hsdVar2 = c;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j3 & 255) < 128) {
                                htm htmVar = (htm) objArr[(i3 << 3) + i5];
                                jArr2 = jArr3;
                                hto d = htmVar.d();
                                i = i4;
                                arrayList = arrayList2;
                                hto k = hsj.k(d, j, hsdVar);
                                if (k != null) {
                                    j2 = j3;
                                    hto k2 = hsj.k(d, v(), c);
                                    if (k2 == null) {
                                        hsdVar3 = c;
                                    } else {
                                        i2 = i5;
                                        if (k2.g == 1 || ffkj.e(k, k2)) {
                                            hsdVar3 = c;
                                        } else {
                                            hsdVar3 = c;
                                            hto k3 = hsj.k(d, v(), x());
                                            if (k3 == null) {
                                                hsj.z();
                                                throw new ffbx();
                                            }
                                            if (map == null || (g = (hto) map.get(k)) == null) {
                                                g = htmVar.g(k2, k, k3);
                                            }
                                            if (g == null) {
                                                return new hrx();
                                            }
                                            if (!ffkj.e(g, k3)) {
                                                if (ffkj.e(g, k)) {
                                                    ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList4.add(new ffcf(htmVar, k.a(v())));
                                                    if (list == null) {
                                                        list = new ArrayList();
                                                    }
                                                    list.add(htmVar);
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList2.add(!ffkj.e(g, k2) ? new ffcf(htmVar, g) : new ffcf(htmVar, k2.a(v())));
                                                }
                                                j3 = j2 >> 8;
                                                i5 = i2 + 1;
                                                jArr3 = jArr2;
                                                i4 = i;
                                                c = hsdVar3;
                                            }
                                        }
                                    }
                                } else {
                                    hsdVar3 = c;
                                    j2 = j3;
                                }
                                i2 = i5;
                            } else {
                                hsdVar3 = c;
                                jArr2 = jArr3;
                                i = i4;
                                arrayList = arrayList2;
                                j2 = j3;
                                i2 = i5;
                            }
                            arrayList2 = arrayList;
                            j3 = j2 >> 8;
                            i5 = i2 + 1;
                            jArr3 = jArr2;
                            i4 = i;
                            c = hsdVar3;
                        }
                    }
                } else {
                    hsdVar2 = c;
                    objArr = objArr2;
                    jArr = jArr3;
                    arrayList2 = arrayList3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr2 = objArr;
                jArr3 = jArr;
                c = hsdVar2;
            }
        } else {
            list = null;
        }
        if (arrayList2 != null) {
            n();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                ffcf ffcfVar = (ffcf) arrayList2.get(i7);
                htm htmVar2 = (htm) ffcfVar.a;
                hto htoVar = (hto) ffcfVar.b;
                htoVar.g = j;
                synchronized (hsj.c) {
                    htoVar.h = htmVar2.d();
                    htmVar2.e(htoVar);
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                coqVar.i((htm) list.get(i8));
            }
            List list2 = this.m;
            if (list2 != null) {
                list = ffdx.ad(list2, list);
            }
            this.m = list;
        }
        return hry.a;
    }

    @Override // defpackage.hrw
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ffji k() {
        return this.a;
    }

    @Override // defpackage.hrw
    public ffji m() {
        return this.b;
    }

    public final void n() {
        q(v());
        if (this.g || this.j) {
            return;
        }
        long v = v();
        synchronized (hsj.c) {
            long j = hsj.e;
            hsj.e = j + 1;
            B(j);
            hsj.d = hsj.d.d(v());
        }
        A(hsj.d(x(), v + 1, v()));
    }

    @Override // defpackage.hrw
    public final void o() {
        hsj.d = hsj.d.b(v()).a(this.e);
    }

    @Override // defpackage.hrw
    public void p(htm htmVar) {
        coq i = i();
        if (i == null) {
            int i2 = cpj.a;
            i = new coq((byte[]) null);
            s(i);
        }
        i.g(htmVar);
    }

    public final void q(long j) {
        synchronized (hsj.c) {
            this.e = this.e.d(j);
        }
    }

    @Override // defpackage.hrw
    public final void r() {
        int length = this.f.length;
        for (int i = 0; i < length; i++) {
            hsj.v(this.f[i]);
        }
        z();
    }

    public void s(coq coqVar) {
        this.d = coqVar;
    }

    @Override // defpackage.hrw
    public void t(int i) {
        this.c = i;
    }

    @Override // defpackage.hrw
    public boolean u() {
        return false;
    }
}
