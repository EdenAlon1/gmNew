package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzmv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;
    final /* synthetic */ bzlz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmv(bznk bznkVar, bzlz bzlzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
        this.c = bzlzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        if (bznk.r(this.c)) {
            cgvo cgvoVar = (cgvo) bznk.c.get(this.c);
            if (cgvoVar != null) {
                ((cgvp) this.b.h.b()).b(cgvoVar);
            }
            this.b.q();
        }
        bznk bznkVar = this.b;
        final bzlz bzlzVar = this.c;
        comc n = bznkVar.n();
        ffji ffjiVar = new ffji() { // from class: bzmu
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                bzma bzmaVar = (bzma) obj2;
                bzmaVar.getClass();
                bzly bzlyVar = (bzly) bzmaVar.toBuilder();
                bzlyVar.getClass();
                bzmb.f(bzlz.this, bzlyVar);
                return bzmb.b(bzlyVar);
            }
        };
        this.a = 1;
        Object d = n.d(ffjiVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzmv(this.b, this.c, ffguVar);
    }
}
