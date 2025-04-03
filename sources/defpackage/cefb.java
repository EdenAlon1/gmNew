package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cefb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cefc b;
    final /* synthetic */ elfl c;
    final /* synthetic */ ffji d;
    final /* synthetic */ Class e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cefb(cefc cefcVar, elfl elflVar, ffji ffjiVar, Class cls, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cefcVar;
        this.c = elflVar;
        this.d = ffjiVar;
        this.e = cls;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cefb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cefc cefcVar = this.b;
        elfl elflVar = this.c;
        ffji ffjiVar = this.d;
        Class cls = this.e;
        this.a = 1;
        Object c = cefcVar.c(elflVar, ffjiVar, cls, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cefb(this.b, this.c, this.d, this.e, ffguVar);
    }
}
