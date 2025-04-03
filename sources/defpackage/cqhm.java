package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqhm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqhq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqhm(ffgu ffguVar, cqhq cqhqVar) {
        super(2, ffguVar);
        this.b = cqhqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqhm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl h = this.b.a().h();
        this.a = 1;
        Object c = fgfz.c(h, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqhm cqhmVar = new cqhm(ffguVar, this.b);
        cqhmVar.c = obj;
        return cqhmVar;
    }
}
