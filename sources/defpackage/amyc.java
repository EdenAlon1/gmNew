package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amyi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyc(ffgu ffguVar, amyi amyiVar) {
        super(2, ffguVar);
        this.b = amyiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amyc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amyi amyiVar = this.b;
        elfl a = amyiVar.b.a(amyiVar.c.l().a);
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amyc amycVar = new amyc(ffguVar, this.b);
        amycVar.c = obj;
        return amycVar;
    }
}
