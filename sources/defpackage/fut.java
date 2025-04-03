package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fut extends ffkk implements ffjm {
    final /* synthetic */ gmk a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fut(gmk gmkVar, float f) {
        super(2);
        this.a = gmkVar;
        this.b = f;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        long j = ((kaf) obj).a;
        hbq d = gyu.d(new fus(this.a, jzk.a(((jzk) obj2).a), this.b, kaf.a(j)));
        gml gmlVar = (gml) this.a.d.j();
        int ordinal = gmlVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                if (d.e(gml.c)) {
                    gmlVar = gml.c;
                } else if (d.e(gml.b)) {
                    gmlVar = gml.b;
                } else if (d.e(gml.a)) {
                    gmlVar = gml.a;
                }
            } else if (d.e(gml.b)) {
                gmlVar = gml.b;
            } else if (d.e(gml.c)) {
                gmlVar = gml.c;
            } else if (d.e(gml.a)) {
                gmlVar = gml.a;
            }
        } else if (d.e(gml.a)) {
            gmlVar = gml.a;
        }
        return new ffcf(d, gmlVar);
    }
}
