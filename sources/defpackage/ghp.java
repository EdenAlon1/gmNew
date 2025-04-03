package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghp extends ffkk implements ffjm {
    final /* synthetic */ gmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghp(gmk gmkVar) {
        super(2);
        this.a = gmkVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        gml gmlVar;
        hbq d = gyu.d(new gho(jzk.a(((jzk) obj2).a), ((kaf) obj).a, this.a));
        int ordinal = ((gml) this.a.d.j()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                gmlVar = d.e(gml.c) ? gml.c : d.e(gml.b) ? gml.b : gml.a;
            } else if (d.e(gml.b)) {
                gmlVar = gml.b;
            }
            return new ffcf(d, gmlVar);
        }
        gmlVar = gml.a;
        return new ffcf(d, gmlVar);
    }
}
