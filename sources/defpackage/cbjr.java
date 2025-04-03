package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cbiq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbjr(ffgu ffguVar, cbiq cbiqVar) {
        super(2, ffguVar);
        this.b = cbiqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbjr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl c = this.b.c();
        c.getClass();
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cbjr cbjrVar = new cbjr(ffguVar, this.b);
        cbjrVar.c = obj;
        return cbjrVar;
    }
}
