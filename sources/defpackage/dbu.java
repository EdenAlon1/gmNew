package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbu implements cyl {
    private final int a;
    private final int b;
    private final cym c;

    public dbu() {
        this(0, (cym) null, 7);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ dcr a(dbv dbvVar) {
        return c();
    }

    @Override // defpackage.cyl
    public final /* bridge */ /* synthetic */ dcw b(dbv dbvVar) {
        return c();
    }

    public final ddg c() {
        return new ddg(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbu)) {
            return false;
        }
        dbu dbuVar = (dbu) obj;
        return dbuVar.a == this.a && dbuVar.b == this.b && ffkj.e(dbuVar.c, this.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public dbu(int i, int i2, cym cymVar) {
        this.a = i;
        this.b = i2;
        this.c = cymVar;
    }

    public /* synthetic */ dbu(int i, cym cymVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? cyp.a : cymVar);
    }
}
