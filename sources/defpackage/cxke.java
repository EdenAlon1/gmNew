package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxke extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxkk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxke(ffgu ffguVar, cxkk cxkkVar) {
        super(2, ffguVar);
        this.b = cxkkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxke) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cxkk cxkkVar = this.b;
        this.a = 1;
        Object c = cxkkVar.a.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cxke cxkeVar = new cxke(ffguVar, this.b);
        cxkeVar.c = obj;
        return cxkeVar;
    }
}
