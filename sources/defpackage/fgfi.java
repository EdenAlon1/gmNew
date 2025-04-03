package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgfi extends ffhr implements ffxy, ffhs {
    public final ffxy a;
    public final ffhd b;
    public final int c;
    private ffhd d;
    private ffgu e;

    public fgfi(ffxy ffxyVar, ffhd ffhdVar) {
        super(fgfe.a, ffhe.a);
        this.a = ffxyVar;
        this.b = ffhdVar;
        this.c = ((Number) ffhdVar.fold(0, new ffjm() { // from class: fgfh
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            }
        })).intValue();
    }

    @Override // defpackage.ffhp
    protected final Object b(Object obj) {
        Throwable c = ffch.c(obj);
        if (c != null) {
            this.d = new fgew(c, u());
        }
        ffgu ffguVar = this.e;
        if (ffguVar != null) {
            ffguVar.w(obj);
        }
        return ffhh.a;
    }

    @Override // defpackage.ffhp, defpackage.ffhs
    public final ffhs dI() {
        ffgu ffguVar = this.e;
        if (ffguVar instanceof ffhs) {
            return (ffhs) ffguVar;
        }
        return null;
    }

    @Override // defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        try {
            ffhd u = ffguVar.u();
            ffui.f(u);
            ffhd ffhdVar = this.d;
            if (ffhdVar != u) {
                if (ffhdVar instanceof fgew) {
                    throw new IllegalStateException(ffpc.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((fgew) ffhdVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) u.fold(0, new ffjm() { // from class: fgfl
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
                    
                        if (r1 == null) goto L20;
                     */
                    @Override // defpackage.ffjm
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object a(java.lang.Object r5, java.lang.Object r6) {
                        /*
                            r4 = this;
                            java.lang.Integer r5 = (java.lang.Integer) r5
                            int r5 = r5.intValue()
                            ffha r6 = (defpackage.ffha) r6
                            ffhb r0 = r6.getKey()
                            fgfi r1 = defpackage.fgfi.this
                            ffhd r1 = r1.b
                            ffha r1 = r1.get(r0)
                            ffuc r2 = defpackage.ffud.c
                            if (r0 == r2) goto L20
                            if (r6 == r1) goto L1d
                            r5 = -2147483648(0xffffffff80000000, float:-0.0)
                            goto L45
                        L1d:
                            int r5 = r5 + 1
                            goto L45
                        L20:
                            ffud r1 = (defpackage.ffud) r1
                            r6.getClass()
                            ffud r6 = (defpackage.ffud) r6
                        L27:
                            r0 = 0
                            if (r6 != 0) goto L2c
                            r6 = r0
                            goto L41
                        L2c:
                            if (r6 == r1) goto L41
                            boolean r2 = r6 instanceof defpackage.fghk
                            if (r2 == 0) goto L41
                            fghk r6 = (defpackage.fghk) r6
                            ffrm r6 = r6.I()
                            if (r6 == 0) goto L3f
                            ffud r6 = r6.c()
                            goto L27
                        L3f:
                            r6 = r0
                            goto L27
                        L41:
                            if (r6 != r1) goto L4a
                            if (r1 != 0) goto L1d
                        L45:
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            return r5
                        L4a:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                            java.lang.String r2 = ", expected child of "
                            java.lang.String r3 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                            java.lang.String r6 = defpackage.a.k(r1, r6, r0, r2, r3)
                            r5.<init>(r6)
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgfl.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                })).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + u + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = u;
            }
            this.e = ffguVar;
            ffjn ffjnVar = fgfk.a;
            ffxy ffxyVar = this.a;
            ffxyVar.getClass();
            Object a = ffjnVar.a(ffxyVar, obj, this);
            if (!ffkj.e(a, ffhh.a)) {
                this.e = null;
            }
            ffhh ffhhVar = ffhh.a;
            if (a == ffhhVar) {
                ffguVar.getClass();
            }
            return a == ffhhVar ? a : ffcu.a;
        } catch (Throwable th) {
            this.d = new fgew(th, ffguVar.u());
            throw th;
        }
    }

    @Override // defpackage.ffhr, defpackage.ffhp
    public final void g() {
        super.g();
    }

    @Override // defpackage.ffhr, defpackage.ffgu
    public final ffhd u() {
        ffhd ffhdVar = this.d;
        return ffhdVar == null ? ffhe.a : ffhdVar;
    }

    @Override // defpackage.ffhp, defpackage.ffhs
    public final void dJ() {
    }
}
