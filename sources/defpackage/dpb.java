package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dpb extends isz implements ixl {
    private dwd a;
    private ilx b;
    private dwn c;
    public dqs e;
    public ffji f;
    public boolean g;
    public ffwm h;
    public boolean i;

    public dpb(ffji ffjiVar, boolean z, dwn dwnVar, dqs dqsVar) {
        this.e = dqsVar;
        this.f = ffjiVar;
        this.g = z;
        this.c = dwnVar;
    }

    public final void A() {
        dwd dwdVar = this.a;
        if (dwdVar != null) {
            dwn dwnVar = this.c;
            if (dwnVar != null) {
                dwnVar.b(new dwc(dwdVar));
            }
            this.a = null;
        }
    }

    public final void B(ffji ffjiVar, boolean z, dwn dwnVar, dqs dqsVar, boolean z2) {
        this.f = ffjiVar;
        if (this.g != z) {
            this.g = z;
            z2 = true;
            if (!z) {
                A();
                ilx ilxVar = this.b;
                if (ilxVar != null) {
                    L(ilxVar);
                }
                this.b = null;
            }
        }
        if (!ffkj.e(this.c, dwnVar)) {
            A();
            this.c = dwnVar;
        }
        if (this.e != dqsVar) {
            this.e = dqsVar;
        } else if (!z2) {
            return;
        }
        ilx ilxVar2 = this.b;
        if (ilxVar2 != null) {
            ilxVar2.q();
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ long a() {
        return ixt.a;
    }

    public abstract Object b(ffjm ffjmVar, ffgu ffguVar);

    @Override // defpackage.hvh
    public /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.ixl
    public final void dU() {
        ilx ilxVar = this.b;
        if (ilxVar != null) {
            ilxVar.dU();
        }
    }

    @Override // defpackage.ixl
    public void dV(iki ikiVar, ikk ikkVar, long j) {
        if (this.g && this.b == null) {
            dov dovVar = new dov(this);
            iki ikiVar2 = ilv.a;
            imf imfVar = new imf(null, null, null, dovVar);
            M(imfVar);
            this.b = imfVar;
        }
        ilx ilxVar = this.b;
        if (ilxVar != null) {
            ilxVar.dV(ikiVar, ikkVar, j);
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    public abstract void g(long j);

    public abstract void h(long j);

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dow
            if (r0 == 0) goto L13
            r0 = r6
            dow r0 = (defpackage.dow) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dow r0 = new dow
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.ffci.b(r6)
            dwd r6 = r5.a
            if (r6 == 0) goto L55
            dwn r2 = r5.c
            if (r2 == 0) goto L4d
            dwc r4 = new dwc
            r4.<init>(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r2.a(r4, r0)
            if (r6 == r1) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            r0 = r5
        L4e:
            r6 = r0
            dpb r6 = (defpackage.dpb) r6
            r1 = 0
            r6.a = r1
            goto L56
        L55:
            r0 = r5
        L56:
            dpb r0 = (defpackage.dpb) r0
            r1 = 0
            r0.h(r1)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpb.s(ffgu):java.lang.Object");
    }

    @Override // defpackage.hvh
    public final void t() {
        this.i = false;
        A();
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r4.a(r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r2.a(r5, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.dnn r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dox
            if (r0 == 0) goto L13
            r0 = r8
            dox r0 = (defpackage.dox) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dox r0 = new dox
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            dwd r7 = r0.f
            dnn r1 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r8)
            goto L7d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            dnn r7 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r8)
            goto L5e
        L40:
            defpackage.ffci.b(r8)
            dwd r8 = r6.a
            if (r8 == 0) goto L5d
            dwn r2 = r6.c
            if (r2 == 0) goto L5d
            dwc r5 = new dwc
            r5.<init>(r8)
            r0.a = r6
            r0.e = r7
            r0.d = r4
            java.lang.Object r8 = r2.a(r5, r0)
            if (r8 != r1) goto L5d
            goto L79
        L5d:
            r2 = r6
        L5e:
            dwd r8 = new dwd
            r8.<init>()
            r4 = r2
            dpb r4 = (defpackage.dpb) r4
            dwn r4 = r4.c
            if (r4 == 0) goto L7a
            r0.a = r2
            r0.e = r7
            r0.f = r8
            r0.d = r3
            java.lang.Object r0 = r4.a(r8, r0)
            if (r0 == r1) goto L79
            goto L7a
        L79:
            return r1
        L7a:
            r1 = r7
            r7 = r8
            r0 = r2
        L7d:
            dpb r0 = (defpackage.dpb) r0
            r0.a = r7
            long r7 = r1.a
            r0.g(r7)
            ffcu r7 = defpackage.ffcu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpb.x(dnn, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.dno r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.doy
            if (r0 == 0) goto L13
            r0 = r7
            doy r0 = (defpackage.doy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            doy r0 = new doy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dno r6 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r7)
            goto L51
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            dwd r7 = r5.a
            if (r7 == 0) goto L58
            dwn r2 = r5.c
            if (r2 == 0) goto L50
            dwe r4 = new dwe
            r4.<init>(r7)
            r0.a = r5
            r0.e = r6
            r0.d = r3
            java.lang.Object r7 = r2.a(r4, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r7 = r0
            dpb r7 = (defpackage.dpb) r7
            r1 = 0
            r7.a = r1
            goto L59
        L58:
            r0 = r5
        L59:
            dpb r0 = (defpackage.dpb) r0
            long r6 = r6.a
            r0.h(r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpb.z(dno, ffgu):java.lang.Object");
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }
}
