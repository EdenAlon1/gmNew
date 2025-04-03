package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgw implements dtan {
    public static final enru a = enru.c("com/google/android/libraries/compose/gifsticker/ui/screen/search/GifStickerSearchRenderer");
    public final ffsk b;
    public final dree c;
    public final drfe d;
    public final ffjm e;
    public final ffjm f;
    public final ffji g;
    public final ffix h;
    public ffud i;
    public ffud j;
    public final dtal k;
    public final drgk l;
    private final ffbr m;
    private final int n;
    private final ffji o = new ffji() { // from class: drgl
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return ffcu.a;
        }
    };
    private final dtak p;
    private final ffbz q;

    public drgw(ffsk ffskVar, dree dreeVar, ffbr ffbrVar, drfe drfeVar, int i, drgk drgkVar, ffjm ffjmVar, ffjm ffjmVar2, ffji ffjiVar, ffix ffixVar) {
        this.b = ffskVar;
        this.c = dreeVar;
        this.m = ffbrVar;
        this.d = drfeVar;
        this.l = drgkVar;
        this.e = ffjmVar;
        this.f = ffjmVar2;
        this.g = ffjiVar;
        this.h = ffixVar;
        this.n = i;
        this.p = drfeVar.e() ? (dtak) ffbrVar.b() : new drgp();
        this.k = new drgv(this);
        this.q = ffca.a(new ffix() { // from class: drgm
            @Override // defpackage.ffix
            public final Object invoke() {
                drgw drgwVar = drgw.this;
                if (drgwVar.d.c()) {
                    return new drgn(drgwVar);
                }
                return null;
            }
        });
    }

    @Override // defpackage.dtan
    public final int a() {
        return this.n;
    }

    @Override // defpackage.dtan
    public final dtaf b() {
        return (dtaf) this.q.a();
    }

    @Override // defpackage.dtan
    public final dtak c() {
        return this.p;
    }

    @Override // defpackage.dtan
    public final dtal d() {
        return this.k;
    }

    @Override // defpackage.dtan
    public final ffji e() {
        return this.o;
    }

    @Override // defpackage.dtan
    public final /* synthetic */ void f() {
        dtam.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r8 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.drgo
            if (r0 == 0) goto L13
            r0 = r8
            drgo r0 = (defpackage.drgo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            drgo r0 = new drgo
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r8)
            goto L66
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            drgw r7 = r0.d
            defpackage.ffci.b(r8)
            goto L53
        L39:
            defpackage.ffci.b(r8)
            boolean r8 = defpackage.ffpc.J(r7)
            if (r5 != r8) goto L43
            r7 = r3
        L43:
            if (r7 == 0) goto L59
            dree r8 = r6.c
            r0.d = r6
            r0.c = r5
            java.lang.Object r8 = r8.f(r7, r0)
            if (r8 != r1) goto L52
            goto L8a
        L52:
            r7 = r6
        L53:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L58
            goto L5a
        L58:
            return r8
        L59:
            r7 = r6
        L5a:
            dree r7 = r7.c
            r0.d = r3
            r0.c = r4
            java.lang.Object r8 = r7.d(r0)
            if (r8 == r1) goto L8a
        L66:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ffdx.n(r8, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L77:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r8.next()
            dref r0 = (defpackage.dref) r0
            java.lang.String r0 = r0.a
            r7.add(r0)
            goto L77
        L89:
            return r7
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drgw.g(java.lang.String, ffgu):java.lang.Object");
    }
}
