package defpackage;

import android.os.Trace;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfu implements hgh, hjo, hiq {
    public final hep a;
    public final AtomicReference b = new AtomicReference(null);
    public final Object c = new Object();
    public final Set d;
    public final hjr e;
    public final cop f;
    public final cop g;
    public final hle h;
    public final hle i;
    public cop j;
    public hfu k;
    public int l;
    public final hfm m;
    public boolean n;
    private final hfr o;
    private final coq p;
    private final coq q;
    private final cop r;
    private boolean s;
    private ffjm t;

    public /* synthetic */ hfu(hfr hfrVar, hep hepVar) {
        this.o = hfrVar;
        this.a = hepVar;
        cot cotVar = new cot(new coq((byte[]) null));
        this.d = cotVar;
        hjr hjrVar = new hjr();
        if (hfrVar.q()) {
            hjrVar.e();
        }
        if (hfrVar.s()) {
            hjrVar.f();
        }
        this.e = hjrVar;
        long[] jArr = cpg.a;
        this.f = new cop((byte[]) null);
        this.p = new coq((byte[]) null);
        this.q = new coq((byte[]) null);
        this.g = new cop((byte[]) null);
        hle hleVar = new hle();
        this.h = hleVar;
        hle hleVar2 = new hle();
        this.i = hleVar2;
        this.r = new cop((byte[]) null);
        this.j = new cop((byte[]) null);
        hfm hfmVar = new hfm(hepVar, hfrVar, hjrVar, cotVar, hleVar, hleVar2, this);
        hfrVar.l(hfmVar);
        this.m = hfmVar;
        this.t = hex.a;
    }

    private final void A(Object obj) {
        int i;
        Object f = this.f.f(obj);
        if (f == null) {
            return;
        }
        if (!(f instanceof coq)) {
            hio hioVar = (hio) f;
            if (hioVar.o(obj) == 4) {
                hni.a(this.r, obj, hioVar);
                return;
            }
            return;
        }
        coq coqVar = (coq) f;
        Object[] objArr = coqVar.b;
        long[] jArr = coqVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        hio hioVar2 = (hio) objArr[(i2 << 3) + i4];
                        if (hioVar2.o(obj) == 4) {
                            hni.a(this.r, obj, hioVar2);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final boolean B(hio hioVar, Object obj) {
        return s() && this.m.ah(hioVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r9 < r7) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        if (r6 != defpackage.hjp.a) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int C(defpackage.hio r22, defpackage.hen r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfu.C(hio, hen, java.lang.Object):int");
    }

    public static final void v() {
        ffkj.e(null, null);
    }

    private final void w(Object obj, boolean z) {
        int i;
        Object f = this.f.f(obj);
        if (f == null) {
            return;
        }
        if (!(f instanceof coq)) {
            hio hioVar = (hio) f;
            if (hni.c(this.r, obj, hioVar) || hioVar.o(obj) == 1) {
                return;
            }
            if (!hioVar.m() || z) {
                this.p.g(hioVar);
                return;
            } else {
                this.q.g(hioVar);
                return;
            }
        }
        coq coqVar = (coq) f;
        Object[] objArr = coqVar.b;
        long[] jArr = coqVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        hio hioVar2 = (hio) objArr[(i2 << 3) + i4];
                        if (!hni.c(this.r, obj, hioVar2) && hioVar2.o(obj) != 1) {
                            if (!hioVar2.m() || z) {
                                this.p.g(hioVar2);
                            } else {
                                this.q.g(hioVar2);
                            }
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x012c, code lost:
    
        if (((defpackage.hio) r11).l() == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x(defpackage.hle r31) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfu.x(hle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r7.k() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        r1.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (r30.f.h((defpackage.hgl) r7) == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfu.y():void");
    }

    private final void z() {
        Object andSet = this.b.getAndSet(null);
        if (ffkj.e(andSet, hfv.a)) {
            return;
        }
        if (andSet instanceof Set) {
            h((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                h(set, false);
            }
            return;
        }
        if (andSet == null) {
            hfp.h("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new ffbx();
        }
        AtomicReference atomicReference = this.b;
        Objects.toString(atomicReference);
        hfp.h("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
        throw new ffbx();
    }

    @Override // defpackage.hgh, defpackage.hiq
    public final void a(Object obj) {
        hio O;
        int i;
        char c;
        hfm hfmVar = this.m;
        if (hfmVar.p <= 0 && (O = hfmVar.O()) != null) {
            O.n();
            if ((O.a & 32) == 0) {
                cog cogVar = O.f;
                if (cogVar == null) {
                    cogVar = new cog((byte[]) null);
                    O.f = cogVar;
                }
                if (cogVar.d(obj, O.e) == O.e) {
                    return;
                }
            }
            if (obj instanceof htn) {
                ((htn) obj).j(1);
            }
            hni.a(this.f, obj, O);
            if (obj instanceof hgl) {
                hgl hglVar = (hgl) obj;
                hgi f = hglVar.f();
                hni.b(this.g, obj);
                cov covVar = f.d;
                Object[] objArr = covVar.b;
                long[] jArr = covVar.a;
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
                                if ((j & 255) < 128) {
                                    htm htmVar = (htm) objArr[(i2 << 3) + i4];
                                    c = '\b';
                                    if (htmVar instanceof htn) {
                                        ((htn) htmVar).j(1);
                                    }
                                    hni.a(this.g, htmVar, obj);
                                } else {
                                    c = '\b';
                                }
                                j >>= c;
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
                Object obj2 = f.e;
                cop copVar = O.g;
                if (copVar == null) {
                    copVar = new cop((byte[]) null);
                    O.g = copVar;
                }
                copVar.e(hglVar, obj2);
            }
        }
    }

    @Override // defpackage.hiq
    public final void b() {
        this.s = true;
    }

    @Override // defpackage.hiq
    public final int c(hio hioVar, Object obj) {
        hfu hfuVar;
        if ((hioVar.a & 2) != 0) {
            hioVar.c(true);
        }
        hen henVar = hioVar.c;
        if (henVar != null && henVar.a()) {
            if (!this.e.h(henVar)) {
                synchronized (this.c) {
                    hfuVar = this.k;
                }
                return (hfuVar == null || !hfuVar.B(hioVar, obj)) ? 1 : 4;
            }
            if (hioVar.d != null) {
                return C(hioVar, henVar, obj);
            }
        }
        return 1;
    }

    @Override // defpackage.hfq
    public final void d() {
        synchronized (this.c) {
            if (this.m.r) {
                hih.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.n) {
                this.n = true;
                this.t = hex.b;
                hle hleVar = this.m.w;
                if (hleVar != null) {
                    x(hleVar);
                }
                boolean z = this.e.b > 0;
                if (z || !this.d.isEmpty()) {
                    hqe hqeVar = new hqe(this.d, this.m.P());
                    if (z) {
                        hjv d = this.e.d();
                        try {
                            hfp.l(d, hqeVar);
                            d.A(true);
                            this.a.c();
                            this.a.f();
                            hqeVar.c();
                        } catch (Throwable th) {
                            d.A(false);
                            throw th;
                        }
                    }
                    hqeVar.b();
                }
                hfm hfmVar = this.m;
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    hfmVar.b.o(hfmVar);
                    hfmVar.W();
                    hfmVar.a.c();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.o.p(this);
    }

    @Override // defpackage.hfq
    public final boolean e() {
        return this.n;
    }

    public final cop f() {
        cop copVar = this.j;
        long[] jArr = cpg.a;
        this.j = new cop((byte[]) null);
        return copVar;
    }

    @Override // defpackage.hgh
    public final void g() {
        this.b.set(null);
        this.h.a();
        this.i.a();
        Set set = this.d;
        if (set.isEmpty()) {
            return;
        }
        new hqe(set, this.m.P()).b();
    }

    public final void h(Set set, boolean z) {
        char c;
        long j;
        long j2;
        long j3;
        int i;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        int i4;
        long j4;
        boolean j5;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long j6;
        int i5;
        int i6;
        long j7;
        long j8;
        char c2;
        long j9;
        int i7;
        int i8;
        int i9;
        Object obj = null;
        char c3 = 7;
        long j10 = -9187201950435737472L;
        int i10 = 8;
        if (set instanceof hnh) {
            cpi cpiVar = ((hnh) set).a;
            Object[] objArr = cpiVar.b;
            long[] jArr6 = cpiVar.a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i11 = 0;
                j2 = 128;
                while (true) {
                    long j11 = jArr6[i11];
                    j3 = 255;
                    if ((((~j11) << c3) & j11 & j10) != j10) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j11 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i11 << 3) + i13];
                                j9 = j10;
                                if (obj2 instanceof hio) {
                                    ((hio) obj2).o(obj);
                                    j8 = j11;
                                    i8 = i10;
                                    i7 = length;
                                } else {
                                    w(obj2, z);
                                    Object f = this.g.f(obj2);
                                    if (f != null) {
                                        if (f instanceof coq) {
                                            coq coqVar = (coq) f;
                                            Object[] objArr2 = coqVar.b;
                                            long[] jArr7 = coqVar.a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                j8 = j11;
                                                int i14 = 0;
                                                while (true) {
                                                    long j12 = jArr7[i14];
                                                    int i15 = i10;
                                                    i7 = length;
                                                    if ((((~j12) << c2) & j12 & j9) != j9) {
                                                        int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                        int i17 = 0;
                                                        while (i17 < i16) {
                                                            if ((j12 & 255) < 128) {
                                                                i9 = i15;
                                                                w((hgl) objArr2[(i14 << 3) + i17], z);
                                                            } else {
                                                                i9 = i15;
                                                            }
                                                            j12 >>= i9;
                                                            i17++;
                                                            i15 = i9;
                                                        }
                                                        if (i16 != i15) {
                                                            break;
                                                        }
                                                    }
                                                    if (i14 == length2) {
                                                        break;
                                                    }
                                                    i14++;
                                                    length = i7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            j8 = j11;
                                            i7 = length;
                                            w((hgl) f, z);
                                        }
                                        i8 = 8;
                                    }
                                    j8 = j11;
                                }
                                i13++;
                                length = i7;
                                i10 = i8;
                                c3 = c2;
                                j10 = j9;
                                j11 = j8 >> i8;
                                obj = null;
                            } else {
                                j8 = j11;
                                c2 = c3;
                                j9 = j10;
                            }
                            i7 = length;
                            i8 = i10;
                            i13++;
                            length = i7;
                            i10 = i8;
                            c3 = c2;
                            j10 = j9;
                            j11 = j8 >> i8;
                            obj = null;
                        }
                        c = c3;
                        j = j10;
                        int i18 = length;
                        if (i12 != i10) {
                            break;
                        } else {
                            length = i18;
                        }
                    } else {
                        c = c3;
                        j = j10;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    c3 = c;
                    j10 = j;
                    obj = null;
                    i10 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj3 : set) {
                if (obj3 instanceof hio) {
                    ((hio) obj3).o(null);
                } else {
                    w(obj3, z);
                    Object f2 = this.g.f(obj3);
                    if (f2 != null) {
                        if (f2 instanceof coq) {
                            coq coqVar2 = (coq) f2;
                            Object[] objArr3 = coqVar2.b;
                            long[] jArr8 = coqVar2.a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j13 = jArr8[i];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i19 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            if ((j13 & 255) < 128) {
                                                w((hgl) objArr3[(i << 3) + i20], z);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i19 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            w((hgl) f2, z);
                        }
                    }
                }
            }
        }
        coq coqVar3 = this.q;
        coq coqVar4 = this.p;
        if (z && coqVar3.l()) {
            cop copVar = this.f;
            long[] jArr9 = copVar.a;
            int length4 = jArr9.length - 2;
            if (length4 >= 0) {
                int i21 = 0;
                while (true) {
                    long j14 = jArr9[i21];
                    if ((((~j14) << c) & j14 & j) != j) {
                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j14 & j3) < j2) {
                                int i24 = (i21 << 3) + i23;
                                Object obj4 = copVar.b[i24];
                                Object obj5 = copVar.c[i24];
                                if (obj5 instanceof coq) {
                                    obj5.getClass();
                                    coq coqVar5 = (coq) obj5;
                                    Object[] objArr4 = coqVar5.b;
                                    long[] jArr10 = coqVar5.a;
                                    int length5 = jArr10.length - 2;
                                    jArr5 = jArr9;
                                    j6 = j14;
                                    if (length5 >= 0) {
                                        int i25 = 0;
                                        while (true) {
                                            long j15 = jArr10[i25];
                                            Object[] objArr5 = objArr4;
                                            long[] jArr11 = jArr10;
                                            if ((((~j15) << c) & j15 & j) != j) {
                                                int i26 = 8 - ((~(i25 - length5)) >>> 31);
                                                i5 = length5;
                                                int i27 = 0;
                                                while (i27 < i26) {
                                                    if ((j15 & j3) < j2) {
                                                        i6 = i27;
                                                        int i28 = (i25 << 3) + i6;
                                                        j7 = j15;
                                                        hio hioVar = (hio) objArr5[i28];
                                                        if (coqVar3.j(hioVar) || coqVar4.j(hioVar)) {
                                                            coqVar5.f(i28);
                                                        }
                                                    } else {
                                                        i6 = i27;
                                                        j7 = j15;
                                                    }
                                                    j15 = j7 >> 8;
                                                    i27 = i6 + 1;
                                                }
                                                if (i26 != 8) {
                                                    break;
                                                }
                                            } else {
                                                i5 = length5;
                                            }
                                            if (i25 == i5) {
                                                break;
                                            }
                                            i25++;
                                            length5 = i5;
                                            objArr4 = objArr5;
                                            jArr10 = jArr11;
                                        }
                                    }
                                    if (!coqVar5.k()) {
                                    }
                                    copVar.c(i24);
                                } else {
                                    jArr5 = jArr9;
                                    j6 = j14;
                                    obj5.getClass();
                                    hio hioVar2 = (hio) obj5;
                                    if (!coqVar3.j(hioVar2) && !coqVar4.j(hioVar2)) {
                                    }
                                    copVar.c(i24);
                                }
                            } else {
                                jArr5 = jArr9;
                                j6 = j14;
                            }
                            j14 = j6 >> 8;
                            i23++;
                            jArr9 = jArr5;
                        }
                        jArr4 = jArr9;
                        if (i22 != 8) {
                            break;
                        }
                    } else {
                        jArr4 = jArr9;
                    }
                    if (i21 == length4) {
                        break;
                    }
                    i21++;
                    jArr9 = jArr4;
                }
            }
            coqVar3.a();
            y();
            return;
        }
        if (coqVar4.l()) {
            cop copVar2 = this.f;
            long[] jArr12 = copVar2.a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i29 = 0;
                while (true) {
                    long j16 = jArr12[i29];
                    if ((((~j16) << c) & j16 & j) != j) {
                        int i30 = 8 - ((~(i29 - length6)) >>> 31);
                        int i31 = 0;
                        while (i31 < i30) {
                            if ((j16 & j3) < j2) {
                                int i32 = (i29 << 3) + i31;
                                Object obj6 = copVar2.b[i32];
                                Object obj7 = copVar2.c[i32];
                                if (obj7 instanceof coq) {
                                    obj7.getClass();
                                    coq coqVar6 = (coq) obj7;
                                    Object[] objArr6 = coqVar6.b;
                                    long[] jArr13 = coqVar6.a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j16;
                                        int i33 = 0;
                                        while (true) {
                                            long j17 = jArr13[i33];
                                            i3 = length6;
                                            i4 = i29;
                                            if ((((~j17) << c) & j17 & j) != j) {
                                                int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                int i35 = 0;
                                                while (i35 < i34) {
                                                    if ((j17 & j3) < j2) {
                                                        int i36 = (i33 << 3) + i35;
                                                        jArr3 = jArr12;
                                                        if (coqVar4.j((hio) objArr6[i36])) {
                                                            coqVar6.f(i36);
                                                        }
                                                    } else {
                                                        jArr3 = jArr12;
                                                    }
                                                    j17 >>= 8;
                                                    i35++;
                                                    jArr12 = jArr3;
                                                }
                                                jArr2 = jArr12;
                                                if (i34 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr12;
                                            }
                                            if (i33 == length7) {
                                                break;
                                            }
                                            i33++;
                                            length6 = i3;
                                            i29 = i4;
                                            jArr12 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr12;
                                        i3 = length6;
                                        i4 = i29;
                                        j4 = j16;
                                    }
                                    j5 = coqVar6.k();
                                } else {
                                    jArr2 = jArr12;
                                    i3 = length6;
                                    i4 = i29;
                                    j4 = j16;
                                    obj7.getClass();
                                    j5 = coqVar4.j((hio) obj7);
                                }
                                if (j5) {
                                    copVar2.c(i32);
                                }
                            } else {
                                jArr2 = jArr12;
                                i3 = length6;
                                i4 = i29;
                                j4 = j16;
                            }
                            j16 = j4 >> 8;
                            i31++;
                            length6 = i3;
                            i29 = i4;
                            jArr12 = jArr2;
                        }
                        jArr = jArr12;
                        int i37 = length6;
                        int i38 = i29;
                        if (i30 != 8) {
                            break;
                        }
                        length6 = i37;
                        i2 = i38;
                    } else {
                        jArr = jArr12;
                        i2 = i29;
                    }
                    if (i2 == length6) {
                        break;
                    }
                    i29 = i2 + 1;
                    jArr12 = jArr;
                }
            }
            y();
            coqVar4.a();
        }
    }

    @Override // defpackage.hgh
    public final void i() {
        synchronized (this.c) {
            try {
                x(this.h);
                z();
            } catch (Throwable th) {
                try {
                    Set set = this.d;
                    if (!set.isEmpty()) {
                        new hqe(set, this.m.P()).b();
                    }
                    throw th;
                } catch (Exception e) {
                    g();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.hgh
    public final void j() {
        synchronized (this.c) {
            try {
                hle hleVar = this.i;
                if (hleVar.e()) {
                    x(hleVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.d;
                    if (!set.isEmpty()) {
                        new hqe(set, this.m.P()).b();
                    }
                    throw th;
                } catch (Exception e) {
                    g();
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.hgh
    public final void k() {
        synchronized (this.c) {
            try {
                hfm hfmVar = this.m;
                hfmVar.k = null;
                Set set = this.d;
                if (!set.isEmpty()) {
                    new hqe(set, hfmVar.P()).b();
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.d;
                    if (!set2.isEmpty()) {
                        new hqe(set2, this.m.P()).b();
                    }
                    throw th;
                } catch (Exception e) {
                    g();
                    throw e;
                }
            }
        }
    }

    public final void l(ffjm ffjmVar) {
        if (this.n) {
            hih.b("The composition is disposed");
        }
        this.t = ffjmVar;
        this.o.e(this, ffjmVar);
    }

    public final void m() {
        Object andSet = this.b.getAndSet(hfv.a);
        if (andSet != null) {
            if (ffkj.e(andSet, hfv.a)) {
                hfp.h("pending composition has not been applied");
                throw new ffbx();
            }
            if (andSet instanceof Set) {
                h((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AtomicReference atomicReference = this.b;
                Objects.toString(atomicReference);
                hfp.h("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new ffbx();
            }
            for (Set set : (Set[]) andSet) {
                h(set, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (r0 == null) goto L39;
     */
    @Override // defpackage.hgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.util.List r23) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfu.n(java.util.List):void");
    }

    @Override // defpackage.hgh
    public final void o() {
        synchronized (this.c) {
            for (Object obj : this.e.c) {
                hio hioVar = obj instanceof hio ? (hio) obj : null;
                if (hioVar != null) {
                    hioVar.a();
                }
            }
        }
    }

    @Override // defpackage.hgh
    public final void p(ffix ffixVar) {
        hfm hfmVar = this.m;
        if (hfmVar.r) {
            hfp.j("Preparing a composition while composing is not supported");
        }
        hfmVar.r = true;
        try {
            ffixVar.invoke();
        } finally {
            hfmVar.r = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    @Override // defpackage.hgh
    public final void q(Set set) {
        Set set2;
        while (true) {
            Object obj = this.b.get();
            if (obj == null || ffkj.e(obj, hfv.a)) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    AtomicReference atomicReference = this.b;
                    Objects.toString(atomicReference);
                    throw new IllegalStateException("corrupt pendingModifications: ".concat(atomicReference.toString()));
                }
                set2 = ffdo.h((Set[]) obj, set);
            }
            AtomicReference atomicReference2 = this.b;
            while (!atomicReference2.compareAndSet(obj, set2)) {
                if (atomicReference2.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.c) {
                    z();
                }
                return;
            }
            return;
        }
    }

    @Override // defpackage.hgh
    public final void r(Object obj) {
        int i;
        synchronized (this.c) {
            A(obj);
            Object f = this.g.f(obj);
            if (f != null) {
                if (f instanceof coq) {
                    coq coqVar = (coq) f;
                    Object[] objArr = coqVar.b;
                    long[] jArr = coqVar.a;
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
                                        A((hgl) objArr[(i2 << 3) + i4]);
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
                } else {
                    A((hgl) f);
                }
            }
        }
    }

    @Override // defpackage.hgh
    public final boolean s() {
        return this.m.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        return true;
     */
    @Override // defpackage.hgh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.hnh
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L5f
            hnh r1 = (defpackage.hnh) r1
            cpi r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7e
            r6 = r3
        L18:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5a
            int r9 = r6 - r5
            r10 = r3
        L2b:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L54
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            cop r13 = r0.f
            boolean r13 = r13.h(r11)
            if (r13 != 0) goto L53
            cop r13 = r0.g
            boolean r11 = r13.h(r11)
            if (r11 != 0) goto L53
            goto L54
        L53:
            return r4
        L54:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L2b
        L58:
            if (r11 != r12) goto L7e
        L5a:
            if (r6 == r5) goto L7e
            int r6 = r6 + 1
            goto L18
        L5f:
            java.util.Iterator r1 = r1.iterator()
        L63:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            cop r5 = r0.f
            boolean r5 = r5.h(r2)
            if (r5 != 0) goto L7d
            cop r5 = r0.g
            boolean r2 = r5.h(r2)
            if (r2 == 0) goto L63
        L7d:
            return r4
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfu.t(java.util.Set):boolean");
    }

    @Override // defpackage.hgh
    public final boolean u() {
        boolean e;
        synchronized (this.c) {
            m();
            try {
                cop f = f();
                try {
                    v();
                    hfm hfmVar = this.m;
                    if (!hfmVar.d.d()) {
                        hfp.j("Expected applyChanges() to have been called");
                    }
                    if (f.e > 0 || !hfmVar.j.isEmpty()) {
                        hfmVar.X(f, null);
                        e = hfmVar.d.e();
                    } else {
                        e = false;
                    }
                    if (!e) {
                        z();
                    }
                } catch (Exception e2) {
                    this.j = f;
                    throw e2;
                }
            } finally {
            }
        }
        return e;
    }
}
