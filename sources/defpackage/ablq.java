package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablq {
    public final fgcq a;
    private final fgcl b;

    public ablq() {
        fgcl d = fgcu.d(1, 50, 2);
        this.b = d;
        this.a = d;
    }

    public final Object a(final ablt abltVar, ffgu ffguVar) {
        Object fQ = this.b.fQ(new ablt(abltVar.a, abltVar.b, abltVar.c, abltVar.d, abltVar.g, new ffix() { // from class: ablo
            @Override // defpackage.ffix
            public final Object invoke() {
                ablq ablqVar = ablq.this;
                ablt abltVar2 = abltVar;
                ablqVar.b(abltVar2);
                abltVar2.e.invoke();
                return ffcu.a;
            }
        }, new ffix() { // from class: ablp
            @Override // defpackage.ffix
            public final Object invoke() {
                ablq ablqVar = ablq.this;
                ablt abltVar2 = abltVar;
                ablqVar.b(abltVar2);
                abltVar2.f.invoke();
                return ffcu.a;
            }
        }), ffguVar);
        return fQ == ffhh.a ? fQ : ffcu.a;
    }

    public final void b(ablt abltVar) {
        ablt abltVar2 = (ablt) ffdx.M(this.b.d());
        if (ffkj.e(abltVar.a, abltVar2 != null ? abltVar2.a : null)) {
            this.b.e();
            this.b.h(null);
        }
    }
}
