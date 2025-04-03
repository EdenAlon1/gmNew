package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gze extends ffkk implements ffix {
    final /* synthetic */ gzl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gze(gzl gzlVar) {
        super(0);
        this.a = gzlVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        Object i = this.a.i();
        if (i != null) {
            return i;
        }
        gzl gzlVar = this.a;
        float b = gzlVar.b();
        if (Float.isNaN(b)) {
            return gzlVar.h();
        }
        Object h = gzlVar.h();
        hbq p = gzlVar.p();
        float b2 = p.b(h);
        if (b2 != b && !Float.isNaN(b2)) {
            if (b2 < b) {
                Object d = p.d(b, true);
                if (d != null) {
                    return d;
                }
            } else {
                Object d2 = p.d(b, false);
                if (d2 != null) {
                    return d2;
                }
            }
        }
        return h;
    }
}
