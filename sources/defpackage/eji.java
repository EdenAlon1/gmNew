package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eji implements iri {
    private final ejc a;
    private final cog b;

    public eji(ejc ejcVar) {
        this.a = ejcVar;
        int i = cow.a;
        this.b = new cog((byte[]) null);
    }

    @Override // defpackage.iri
    public final void a(irh irhVar) {
        this.b.a();
        for (Object obj : irhVar) {
            Object a = this.a.a(obj);
            int g = this.b.g(a, 0);
            if (g == 7) {
                irhVar.remove(obj);
            } else {
                this.b.c(a, g + 1);
            }
        }
    }

    @Override // defpackage.iri
    public final boolean b(Object obj, Object obj2) {
        ejc ejcVar = this.a;
        return ffkj.e(ejcVar.a(obj), ejcVar.a(obj2));
    }
}
