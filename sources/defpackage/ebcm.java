package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebcm extends ebei {
    public final ebfq a;
    private final ebfp x;
    private final llh y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ebcm(defpackage.ebfp r7) {
        /*
            r6 = this;
            ebej r0 = defpackage.ebek.e()
            java.lang.String r1 = r7.n()
            emxc r2 = r7.m()
            ebco r3 = new ebco
            r3.<init>(r1, r2)
            r1 = r0
            ebcp r1 = (defpackage.ebcp) r1
            r1.b = r3
            android.graphics.drawable.Drawable r2 = r7.d()
            r3 = 1
            if (r2 != 0) goto L38
            int r2 = r7.a()
            ebcv r4 = new ebcv
            r4.<init>()
            r5 = 0
            r4.a = r5
            r4.b(r2)
            r2 = 0
            r4.c(r2)
            r4.c(r3)
            ebff r2 = r4.d()
            goto L40
        L38:
            android.graphics.drawable.Drawable r2 = r7.d()
            ebff r2 = defpackage.ebff.g(r2)
        L40:
            r1.a = r2
            int r2 = r7.b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            emxc r2 = defpackage.emxc.j(r2)
            r1.c = r2
            ebct r2 = new ebct
            r2.<init>()
            int r4 = r7.c()
            r2.b(r4)
            r4 = 90535(0x161a7, float:1.26867E-40)
            r2.c(r4)
            r2.d(r4)
            ebeh r2 = r2.a()
            r1.d = r2
            ebek r0 = r0.a()
            r6.<init>(r0)
            lld r0 = r7.f()
            ebcj r1 = new ebcj
            r1.<init>()
            r6.y = r1
            r6.x = r7
            ebfq r0 = r7.k()
            if (r0 != 0) goto L8d
            ebcl r0 = new ebcl
            r0.<init>()
            r0.b(r3)
        L8d:
            r6.a = r0
            android.view.View$OnClickListener r0 = r7.e()
            r6.m(r0)
            emxc r7 = r7.l()
            r6.h = r7
            super.g()
            ebef r7 = defpackage.ebef.CUSTOM_ACTION_CARD
            r6.j(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebcm.<init>(ebfp):void");
    }

    @Override // defpackage.ebdf
    public final void a(lkr lkrVar) {
        lld f = this.x.f();
        if (f != null) {
            f.f(lkrVar, this.y);
        }
    }

    @Override // defpackage.ebdf
    public final void b(final lkr lkrVar, final llh llhVar) {
        ebpa.a(new Runnable() { // from class: ebci
            @Override // java.lang.Runnable
            public final void run() {
                ebcm ebcmVar = ebcm.this;
                ebcmVar.a.a();
                ebcmVar.a.b.f(lkrVar, llhVar);
            }
        });
    }

    @Override // defpackage.ebdf
    public final void c(final lkr lkrVar) {
        ebpa.a(new Runnable() { // from class: ebck
            @Override // java.lang.Runnable
            public final void run() {
                efbd.c();
                ebcm.this.a.b.l(lkrVar);
            }
        });
    }

    @Override // defpackage.ebdf
    protected final void d() {
        lld f = this.x.f();
        if (f != null) {
            f.k(this.y);
        }
    }
}
