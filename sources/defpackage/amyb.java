package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amyi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyb(ffgu ffguVar, amyi amyiVar) {
        super(2, ffguVar);
        this.b = amyiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amyb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl b = this.b.c.n().b();
        b.getClass();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amyb amybVar = new amyb(ffguVar, this.b);
        amybVar.c = obj;
        return amybVar;
    }
}
