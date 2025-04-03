package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlg {
    public final lrs a;
    public engw b;
    public mtl c;
    public mtl d;
    public mtl e;
    private enhk f;

    public mlg(lrs lrsVar) {
        this.a = lrsVar;
        int i = engw.d;
        this.b = enou.a;
        this.f = enoz.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mtl b(lro lroVar, engw engwVar, mtl mtlVar, lrs lrsVar) {
        lru I = lroVar.I();
        int aJ = lroVar.aJ();
        Object f = I.q() ? null : I.f(aJ);
        int i = -1;
        if (!lroVar.aa() && !I.q()) {
            i = I.n(aJ, lrsVar).b(lvf.u(lroVar.z()) - lrsVar.e);
        }
        int i2 = i;
        for (int i3 = 0; i3 < engwVar.size(); i3++) {
            mtl mtlVar2 = (mtl) engwVar.get(i3);
            if (e(mtlVar2, f, lroVar.aa(), lroVar.aG(), lroVar.aH(), i2)) {
                return mtlVar2;
            }
        }
        if (engwVar.isEmpty() && mtlVar != null && e(mtlVar, f, lroVar.aa(), lroVar.aG(), lroVar.aH(), i2)) {
            return mtlVar;
        }
        return null;
    }

    private final void d(enhd enhdVar, mtl mtlVar, lru lruVar) {
        if (mtlVar == null) {
            return;
        }
        if (lruVar.a(mtlVar.a) != -1) {
            enhdVar.k(mtlVar, lruVar);
            return;
        }
        lru lruVar2 = (lru) this.f.get(mtlVar);
        if (lruVar2 != null) {
            enhdVar.k(mtlVar, lruVar2);
        }
    }

    private static boolean e(mtl mtlVar, Object obj, boolean z, int i, int i2, int i3) {
        if (mtlVar.a.equals(obj)) {
            return z ? mtlVar.b == i && mtlVar.c == i2 : mtlVar.b == -1 && mtlVar.e == i3;
        }
        return false;
    }

    public final lru a(mtl mtlVar) {
        return (lru) this.f.get(mtlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(lru lruVar) {
        enhd enhdVar = new enhd();
        if (this.b.isEmpty()) {
            d(enhdVar, this.d, lruVar);
            if (!emxb.a(this.e, this.d)) {
                d(enhdVar, this.e, lruVar);
            }
            if (!emxb.a(this.c, this.d) && !emxb.a(this.c, this.e)) {
                d(enhdVar, this.c, lruVar);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                d(enhdVar, (mtl) this.b.get(i), lruVar);
            }
            if (!this.b.contains(this.c)) {
                d(enhdVar, this.c, lruVar);
            }
        }
        this.f = enhdVar.c();
    }
}
