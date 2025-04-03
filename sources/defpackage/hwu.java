package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwu implements View.OnAttachStateChangeListener, ljv {
    public final AndroidComposeView a;
    public jfs e;
    public boolean f;
    private final ffix i;
    private jht j;
    private long o;
    private final List k = new ArrayList();
    private final long l = 100;
    public int h = 1;
    public boolean b = true;
    private final ffwm m = ffwp.a(1, 0, 6);
    public final Handler c = new Handler(Looper.getMainLooper());
    private cmy n = cmz.a();
    public final cnw d = new cnw((byte[]) null);
    public final Runnable g = new Runnable() { // from class: hwo
        @Override // java.lang.Runnable
        public final void run() {
            char c;
            long j;
            long j2;
            long j3;
            long j4;
            cmy cmyVar;
            int[] iArr;
            long[] jArr;
            int i;
            cmy cmyVar2;
            int[] iArr2;
            long j5;
            long j6;
            long[] jArr2;
            int i2;
            int i3;
            long[] jArr3;
            Object[] objArr;
            long[] jArr4;
            Object[] objArr2;
            int i4;
            long j7;
            char c2;
            long j8;
            hwu hwuVar = hwu.this;
            if (hwuVar.n()) {
                hwuVar.a.r(true);
                cnw cnwVar = hwuVar.d;
                int[] iArr3 = cnwVar.b;
                long[] jArr5 = cnwVar.a;
                int length = jArr5.length - 2;
                char c3 = 7;
                long j9 = -9187201950435737472L;
                int i5 = 8;
                if (length >= 0) {
                    int i6 = 0;
                    j2 = 128;
                    while (true) {
                        long j10 = jArr5[i6];
                        j3 = 255;
                        if ((((~j10) << c3) & j10 & j9) != j9) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j10 & 255) < 128) {
                                    c2 = c3;
                                    int i9 = iArr3[(i6 << 3) + i8];
                                    j8 = j9;
                                    if (!hwuVar.g().b(i9)) {
                                        hwuVar.i(i9);
                                        hwuVar.j();
                                    }
                                } else {
                                    c2 = c3;
                                    j8 = j9;
                                }
                                j10 >>= 8;
                                i8++;
                                c3 = c2;
                                j9 = j8;
                            }
                            c = c3;
                            j = j9;
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            c = c3;
                            j = j9;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        c3 = c;
                        j9 = j;
                    }
                } else {
                    c = 7;
                    j = -9187201950435737472L;
                    j2 = 128;
                    j3 = 255;
                }
                hwuVar.k(hwuVar.a.l.a(), hwuVar.e);
                cmy g = hwuVar.g();
                int[] iArr4 = g.b;
                long[] jArr6 = g.a;
                int length2 = jArr6.length - 2;
                if (length2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j11 = jArr6[i10];
                        if ((((~j11) << c) & j11 & j) != j) {
                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j11 & j3) < j2) {
                                    int i13 = iArr4[(i10 << 3) + i12];
                                    jfs jfsVar = (jfs) hwuVar.d.a(i13);
                                    jft jftVar = (jft) g.a(i13);
                                    jjw jjwVar = jftVar != null ? jftVar.a : null;
                                    if (jjwVar == null) {
                                        imn.a("no value for specified key");
                                        throw new ffbx();
                                    }
                                    if (jfsVar == null) {
                                        cop copVar = jjwVar.c.a;
                                        j6 = j2;
                                        Object[] objArr3 = copVar.b;
                                        long[] jArr7 = copVar.a;
                                        int length3 = jArr7.length - 2;
                                        cmyVar2 = g;
                                        iArr2 = iArr4;
                                        if (length3 >= 0) {
                                            int i14 = i5;
                                            int i15 = 0;
                                            while (true) {
                                                long j12 = jArr7[i15];
                                                j5 = j11;
                                                if ((((~j12) << c) & j12 & j) != j) {
                                                    int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j12 & j3) < j6) {
                                                            jku jkuVar = (jku) objArr3[(i15 << 3) + i17];
                                                            jku jkuVar2 = jkm.a;
                                                            j7 = j12;
                                                            if (ffkj.e(jkuVar, jkm.z)) {
                                                                List list = (List) jjo.a(jjwVar.c, jkm.z);
                                                                hwuVar.l(jjwVar.e, String.valueOf(list != null ? (jlm) ffdx.M(list) : null));
                                                            }
                                                        } else {
                                                            j7 = j12;
                                                        }
                                                        j12 = j7 >> i14;
                                                    }
                                                    i3 = i14;
                                                    if (i16 != i3) {
                                                        jArr2 = jArr6;
                                                        i2 = length2;
                                                        break;
                                                    }
                                                }
                                                if (i15 == length3) {
                                                    break;
                                                }
                                                i15++;
                                                j11 = j5;
                                                i14 = 8;
                                            }
                                            jArr2 = jArr6;
                                            i2 = length2;
                                        } else {
                                            j5 = j11;
                                        }
                                    } else {
                                        cmyVar2 = g;
                                        iArr2 = iArr4;
                                        j5 = j11;
                                        j6 = j2;
                                        cop copVar2 = jjwVar.c.a;
                                        Object[] objArr4 = copVar2.b;
                                        long[] jArr8 = copVar2.a;
                                        int length4 = jArr8.length - 2;
                                        if (length4 >= 0) {
                                            int i18 = 0;
                                            while (true) {
                                                long j13 = jArr8[i18];
                                                jArr2 = jArr6;
                                                i2 = length2;
                                                if ((((~j13) << c) & j13 & j) != j) {
                                                    int i19 = 8 - ((~(i18 - length4)) >>> 31);
                                                    int i20 = 0;
                                                    while (i20 < i19) {
                                                        if ((j13 & j3) < j6) {
                                                            jArr4 = jArr8;
                                                            jku jkuVar3 = (jku) objArr4[(i18 << 3) + i20];
                                                            jku jkuVar4 = jkm.a;
                                                            objArr2 = objArr4;
                                                            if (ffkj.e(jkuVar3, jkm.z)) {
                                                                List list2 = (List) jjo.a(jfsVar.a, jkm.z);
                                                                jlm jlmVar = list2 != null ? (jlm) ffdx.M(list2) : null;
                                                                i4 = i20;
                                                                List list3 = (List) jjo.a(jjwVar.c, jkm.z);
                                                                jlm jlmVar2 = list3 != null ? (jlm) ffdx.M(list3) : null;
                                                                if (!ffkj.e(jlmVar, jlmVar2)) {
                                                                    hwuVar.l(jjwVar.e, String.valueOf(jlmVar2));
                                                                }
                                                                j13 >>= 8;
                                                                i20 = i4 + 1;
                                                                objArr4 = objArr2;
                                                                jArr8 = jArr4;
                                                            }
                                                        } else {
                                                            jArr4 = jArr8;
                                                            objArr2 = objArr4;
                                                        }
                                                        i4 = i20;
                                                        j13 >>= 8;
                                                        i20 = i4 + 1;
                                                        objArr4 = objArr2;
                                                        jArr8 = jArr4;
                                                    }
                                                    jArr3 = jArr8;
                                                    objArr = objArr4;
                                                    i3 = 8;
                                                    if (i19 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr8;
                                                    objArr = objArr4;
                                                }
                                                if (i18 == length4) {
                                                    break;
                                                }
                                                i18++;
                                                jArr6 = jArr2;
                                                length2 = i2;
                                                objArr4 = objArr;
                                                jArr8 = jArr3;
                                            }
                                        }
                                        jArr2 = jArr6;
                                        i2 = length2;
                                    }
                                    i3 = 8;
                                    i12++;
                                    i5 = i3;
                                    jArr6 = jArr2;
                                    length2 = i2;
                                    j2 = j6;
                                    j11 = j5 >> i3;
                                    g = cmyVar2;
                                    iArr4 = iArr2;
                                } else {
                                    cmyVar2 = g;
                                    iArr2 = iArr4;
                                    j5 = j11;
                                    j6 = j2;
                                }
                                jArr2 = jArr6;
                                i2 = length2;
                                i3 = i5;
                                i12++;
                                i5 = i3;
                                jArr6 = jArr2;
                                length2 = i2;
                                j2 = j6;
                                j11 = j5 >> i3;
                                g = cmyVar2;
                                iArr4 = iArr2;
                            }
                            cmyVar = g;
                            iArr = iArr4;
                            jArr = jArr6;
                            j4 = j2;
                            i = length2;
                            if (i11 != i5) {
                                break;
                            }
                        } else {
                            cmyVar = g;
                            iArr = iArr4;
                            jArr = jArr6;
                            j4 = j2;
                            i = length2;
                        }
                        if (i10 == i) {
                            break;
                        }
                        i10++;
                        jArr6 = jArr;
                        length2 = i;
                        j2 = j4;
                        g = cmyVar;
                        iArr4 = iArr;
                        i5 = 8;
                    }
                } else {
                    j4 = j2;
                }
                hwuVar.d.e();
                cmy g2 = hwuVar.g();
                int[] iArr5 = g2.b;
                Object[] objArr5 = g2.c;
                long[] jArr9 = g2.a;
                int length5 = jArr9.length - 2;
                if (length5 >= 0) {
                    int i21 = 0;
                    while (true) {
                        long j14 = jArr9[i21];
                        if ((((~j14) << c) & j14 & j) != j) {
                            int i22 = 8 - ((~(i21 - length5)) >>> 31);
                            for (int i23 = 0; i23 < i22; i23++) {
                                if ((j14 & j3) < j4) {
                                    int i24 = (i21 << 3) + i23;
                                    hwuVar.d.f(iArr5[i24], new jfs(((jft) objArr5[i24]).a, hwuVar.g()));
                                }
                                j14 >>= 8;
                            }
                            if (i22 != 8) {
                                break;
                            }
                        }
                        if (i21 == length5) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                hwuVar.e = new jfs(hwuVar.a.l.a(), hwuVar.g());
                hwuVar.f = false;
            }
        }
    };

    public hwu(AndroidComposeView androidComposeView, ffix ffixVar) {
        this.a = androidComposeView;
        this.i = ffixVar;
        this.e = new jfs(androidComposeView.l.a(), cmz.a());
    }

    private final void o(jjw jjwVar, ffjm ffjmVar) {
        List i = jjwVar.i();
        int size = i.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = i.get(i3);
            if (g().b(((jjw) obj).e)) {
                ffjmVar.a(Integer.valueOf(i2), obj);
                i2++;
            }
        }
    }

    private final void p() {
        jht jhtVar = this.j;
        if (jhtVar == null || Build.VERSION.SDK_INT < 29 || this.k.isEmpty()) {
            return;
        }
        List list = this.k;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hwv hwvVar = (hwv) list.get(i);
            if (hwvVar.c - 1 != 0) {
                AutofillId a = jhtVar.a(hwvVar.a);
                if (a != null && Build.VERSION.SDK_INT >= 29) {
                    hwu$$ExternalSyntheticApiModelOutline0.m(jhtVar.a).notifyViewDisappeared(a);
                }
            } else {
                jhv jhvVar = hwvVar.b;
                if (jhvVar != null && Build.VERSION.SDK_INT >= 29) {
                    hwu$$ExternalSyntheticApiModelOutline0.m(jhtVar.a).notifyViewAppeared((ViewStructure) jhvVar.a);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            hwu$$ExternalSyntheticApiModelOutline0.m(jhtVar.a).notifyViewsDisappeared(iy$$ExternalSyntheticApiModelOutline1.m414m(jhu.a(jhtVar.b).a), new long[]{Long.MIN_VALUE});
        }
        this.k.clear();
    }

    private final void q(jjw jjwVar) {
        if (n()) {
            i(jjwVar.e);
            List i = jjwVar.i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                q((jjw) i.get(i2));
            }
        }
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        q(this.a.l.a());
        p();
        this.j = null;
    }

    public final cmy g() {
        if (this.b) {
            this.b = false;
            this.n = jfu.b(this.a.l);
            this.o = System.currentTimeMillis();
        }
        return this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (defpackage.ffsw.c(100, r0) != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:11:0x0048). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.hwr
            if (r0 == 0) goto L13
            r0 = r9
            hwr r0 = (defpackage.hwr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hwr r0 = new hwr
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ffwc r2 = r0.e
            hwu r5 = r0.d
            defpackage.ffci.b(r9)
            goto L48
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            ffwc r2 = r0.e
            hwu r5 = r0.d
            defpackage.ffci.b(r9)
            goto L58
        L3e:
            defpackage.ffci.b(r9)
            ffwm r9 = r8.m
            ffwo r2 = r9.r()
            r5 = r8
        L48:
            r0.d = r5
            r9 = r2
            ffwc r9 = (defpackage.ffwc) r9
            r0.e = r9
            r0.c = r4
            java.lang.Object r9 = r2.a(r0)
            if (r9 != r1) goto L58
            goto L8d
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8e
            r2.b()
            boolean r9 = r5.n()
            if (r9 == 0) goto L6c
            r5.p()
        L6c:
            boolean r9 = r5.f
            if (r9 != 0) goto L79
            r5.f = r4
            android.os.Handler r9 = r5.c
            java.lang.Runnable r6 = r5.g
            r9.post(r6)
        L79:
            long r6 = r5.l
            r0.d = r5
            r9 = r2
            ffwc r9 = (defpackage.ffwc) r9
            r0.e = r9
            r0.c = r3
            r6 = 100
            java.lang.Object r9 = defpackage.ffsw.c(r6, r0)
            if (r9 == r1) goto L8d
            goto L48
        L8d:
            return r1
        L8e:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwu.h(ffgu):java.lang.Object");
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        this.j = (jht) this.i.invoke();
        m(-1, this.a.l.a());
        p();
    }

    public final void i(int i) {
        this.k.add(new hwv(i, this.o, 2, null));
    }

    public final void j() {
        this.m.b(ffcu.a);
    }

    public final void k(jjw jjwVar, jfs jfsVar) {
        o(jjwVar, new hws(jfsVar, this));
        List i = jjwVar.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            jjw jjwVar2 = (jjw) i.get(i2);
            if (g().b(jjwVar2.e) && this.d.b(jjwVar2.e)) {
                Object a = this.d.a(jjwVar2.e);
                if (a == null) {
                    imn.a("node not present in pruned tree before this change");
                    throw new ffbx();
                }
                k(jjwVar2, (jfs) a);
            }
        }
    }

    public final void l(int i, String str) {
        jht jhtVar;
        if (Build.VERSION.SDK_INT >= 29 && (jhtVar = this.j) != null) {
            AutofillId a = jhtVar.a(i);
            if (a == null) {
                imn.a("Invalid content capture ID");
                throw new ffbx();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                hwu$$ExternalSyntheticApiModelOutline0.m(jhtVar.a).notifyViewTextChanged(a, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v13 java.lang.Object, still in use, count: 2, list:
          (r4v13 java.lang.Object) from 0x0092: IF  (r4v13 java.lang.Object) == (null java.lang.Object)  -> B:14:0x0075 A[HIDDEN] (LINE:147)
          (r4v13 java.lang.Object) from 0x0097: PHI (r4v7 java.lang.Object) = (r4v6 java.lang.Object), (r4v13 java.lang.Object) binds: [B:71:0x0095, B:25:0x0092] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r17, defpackage.jjw r18) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwu.m(int, jjw):void");
    }

    public final boolean n() {
        return this.j != null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.removeCallbacks(this.g);
        this.j = null;
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
