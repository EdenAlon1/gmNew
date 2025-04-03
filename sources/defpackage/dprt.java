package defpackage;

import android.net.Uri;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprt implements dpqm {
    public static final enru a = enru.c("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl");
    private static final Duration m = ernk.d(500);
    public final Executor b;
    public final ffsk c;
    public final ffsk d;
    public final dpvm e;
    public final dqhs f;
    public final drpd g;
    public final dprw h;
    public final dpqo i;
    public final fgcl j;
    public final dpwf k;
    public final fgdj l;
    private final Executor n;
    private final drdl o;
    private ffud p;
    private ffud q;
    private final dprq r;

    public dprt(Executor executor, ffsk ffskVar, ffsk ffskVar2, Executor executor2, dpvm dpvmVar, dqhs dqhsVar, drpd drpdVar, drdl drdlVar, dpwg dpwgVar, dprw dprwVar, dpqo dpqoVar) {
        executor.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        executor2.getClass();
        dpvmVar.getClass();
        dqhsVar.getClass();
        drpdVar.getClass();
        dpwgVar.getClass();
        this.b = executor;
        this.c = ffskVar;
        this.d = ffskVar2;
        this.n = executor2;
        this.e = dpvmVar;
        this.f = dqhsVar;
        this.g = drpdVar;
        this.o = drdlVar;
        this.h = dprwVar;
        this.i = dpqoVar;
        this.j = fgcu.e(0, 0, 0, 7);
        dpvy dpvyVar = dpqoVar.f;
        this.k = dpvyVar != null ? dpwgVar.a(dpvyVar) : null;
        ffxx a2 = lkb.a(dpvmVar.d());
        int i = fgcz.a;
        this.l = fgbn.b(a2, ffskVar, fgcy.b, null);
        this.r = new dprq(this);
        if (dpqoVar.g.a) {
            dpvmVar.i(5);
        } else {
            dpvmVar.i(1);
        }
        dpvmVar.u();
        dpvmVar.k(executor2);
        dpvmVar.g(dpqoVar.c);
        dpvmVar.v();
        dpvmVar.w();
    }

    private final dpgo t(dpgl dpglVar) {
        String str;
        dpvw dpvwVar;
        atl c = this.e.c();
        int i = ffkj.e(c, atl.a) ? 3 : ffkj.e(c, atl.b) ? 2 : 1;
        boolean z = this.e.a() == 1;
        dpwf dpwfVar = this.k;
        if (dpwfVar != null && (dpvwVar = (dpvw) dpwfVar.f.c()) != null) {
            String str2 = dpvwVar.a;
            if (!ffkj.e(str2, "no_effect")) {
                str = str2;
                return new dpgo(dpglVar, i, 1, z, null, str, 16);
            }
        }
        str = null;
        return new dpgo(dpglVar, i, 1, z, null, str, 16);
    }

    private final Object u(drlx drlxVar, ffgu ffguVar) {
        return ffra.a(this.d.hT(), new dpre(this, drlxVar, null), ffguVar);
    }

    private final void v(lkr lkrVar, ffix ffixVar) {
        this.e.r();
        ffixVar.invoke();
        this.e.e(lkrVar);
    }

    private final Object w(int i, ffgu ffguVar) {
        Object a2;
        return (dprw.a() && (a2 = ffra.a(this.d.hT(), new dprg(this, i, null), ffguVar)) == ffhh.a) ? a2 : ffcu.a;
    }

    @Override // defpackage.dpqm
    public final Duration a() {
        return this.i.d;
    }

    @Override // defpackage.dpqm
    public final Duration b() {
        return this.i.b;
    }

    @Override // defpackage.dpqm
    public final Object c(lkr lkrVar, ixm ixmVar, ffgu ffguVar) {
        if (ixmVar.a == null) {
            throw new IllegalArgumentException("PreviewView cannot be null during bind.");
        }
        lkrVar.P().c(this.r);
        try {
            v(lkrVar, new ffix() { // from class: dpqr
                @Override // defpackage.ffix
                public final Object invoke() {
                    enru enruVar = dprt.a;
                    return ffcu.a;
                }
            });
            this.e.m(ixmVar);
        } catch (IllegalStateException e) {
            Object fQ = this.j.fQ(new dpqg(e), ffguVar);
            if (fQ == ffhh.a) {
                return fQ;
            }
        }
        return ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r8.fQ(r2, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.dpqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dpqt
            if (r0 == 0) goto L13
            r0 = r8
            dpqt r0 = (defpackage.dpqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpqt r0 = new dpqt
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3c
            if (r2 == r3) goto L36
            if (r2 != r5) goto L2e
            defpackage.ffci.b(r8)
            goto L90
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            dprt r2 = r0.d
            defpackage.ffci.b(r8)
            goto L71
        L3c:
            dprt r2 = r0.d
            defpackage.ffci.b(r8)
            goto L65
        L42:
            defpackage.ffci.b(r8)
            ffud r8 = r7.q
            if (r8 == 0) goto L4c
            defpackage.ffub.a(r8)
        L4c:
            r7.q = r6
            drdl r8 = r7.o
            boolean r8 = r8.b()
            if (r8 == 0) goto L80
            fgcl r8 = r7.j
            dpqi r2 = defpackage.dpqi.a
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r8.fQ(r2, r0)
            if (r8 == r1) goto L8f
            r2 = r7
        L65:
            drdl r8 = r2.o
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 == r1) goto L8f
        L71:
            android.net.Uri r8 = (android.net.Uri) r8
            if (r8 == 0) goto L81
            ffsk r3 = r2.d
            dpqu r4 = new dpqu
            r4.<init>(r2, r8, r6)
            defpackage.ffqy.d(r3, r6, r6, r4, r5)
            goto L81
        L80:
            r2 = r7
        L81:
            fgcl r8 = r2.j
            dpqf r2 = defpackage.dpqf.a
            r0.d = r6
            r0.c = r5
            java.lang.Object r8 = r8.fQ(r2, r0)
            if (r8 != r1) goto L90
        L8f:
            return r1
        L90:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprt.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|111|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0057, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01de, code lost:
    
        if (r13.fQ(r2, r0) == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c9, code lost:
    
        if (r14 == r1) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f8 A[Catch: all -> 0x024d, TryCatch #11 {all -> 0x024d, blocks: (B:56:0x01f4, B:58:0x01f8, B:61:0x01fd, B:62:0x01fe), top: B:55:0x01f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r12v0, types: [dprt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [dpgl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [fflb] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v21, types: [fflb] */
    /* JADX WARN: Type inference failed for: r13v22, types: [fflb] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32, types: [fflb] */
    /* JADX WARN: Type inference failed for: r13v36, types: [fflb] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dprt] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [dprt, java.lang.Object] */
    @Override // defpackage.dpqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dpgl r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprt.e(dpgl, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (defpackage.ernj.a(r4, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r11.w(4, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r11.o(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.dpqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dpgl r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprt.f(dpgl, ffgu):java.lang.Object");
    }

    @Override // defpackage.dpqm
    public final Object g(Uri uri, ffgu ffguVar) {
        Object a2 = ffra.a(this.d.hT(), new dprd(this, uri, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.dpqm
    public final Object h(dpvw dpvwVar, ffgu ffguVar) {
        Object a2;
        dpwf dpwfVar = this.k;
        return (dpwfVar == null || (a2 = dpwfVar.a(dpvwVar, new dprh(this), ffguVar)) != ffhh.a) ? ffcu.a : a2;
    }

    @Override // defpackage.dpqm
    public final Object i(dpgl dpglVar, ffgu ffguVar) {
        ffud ffudVar = this.q;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        Object s = s(dpglVar, ffguVar);
        return s == ffhh.a ? s : ffcu.a;
    }

    @Override // defpackage.dpqm
    public final fgcq j() {
        return new fgcn(this.j);
    }

    @Override // defpackage.dpqm
    public final fgdj k() {
        fgdj fgdjVar;
        dpwf dpwfVar = this.k;
        return (dpwfVar == null || (fgdjVar = dpwfVar.n) == null) ? fgdm.a(new dpwi(null)) : fgdjVar;
    }

    @Override // defpackage.dpqm
    public final fgdj l() {
        return this.l;
    }

    @Override // defpackage.dpqm
    public final void m(lkr lkrVar, final atl atlVar) {
        if (this.e.s(atlVar)) {
            v(lkrVar, new ffix() { // from class: dpqs
                @Override // defpackage.ffix
                public final Object invoke() {
                    dprt.this.e.g(atlVar);
                    return ffcu.a;
                }
            });
        } else {
            ((enrr) a.j().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl", "setCamera", 191, "CameraManagerImpl.kt")).t("Attempted to set camera to CameraSelector: %s when this camera does not exist on this device.", atlVar);
        }
    }

    @Override // defpackage.dpqm
    public final void n(lkr lkrVar, final int i) {
        if (this.i.g.a) {
            return;
        }
        v(lkrVar, new ffix() { // from class: dpqq
            @Override // defpackage.ffix
            public final Object invoke() {
                dprt.this.e.i(i);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.dpqm
    public final void o(int i) {
        this.e.j(i);
    }

    @Override // defpackage.dpqm
    public final void p(float f) {
        this.e.x(f);
    }

    @Override // defpackage.dpqm
    public final void q(lkr lkrVar) {
        atl c = this.e.c();
        atl atlVar = ffkj.e(c, atl.a) ? atl.b : ffkj.e(c, atl.b) ? atl.a : null;
        if (atlVar != null) {
            m(lkrVar, atlVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.dpqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.dpgl r19, defpackage.drcy r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprt.r(dpgl, drcy, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (r11.fQ(r2, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r11.fQ(r12, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r12 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.dpgl r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dprt.s(dpgl, ffgu):java.lang.Object");
    }
}
