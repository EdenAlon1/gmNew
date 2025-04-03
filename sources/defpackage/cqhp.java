package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqhp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqhq b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqhp(ffgu ffguVar, cqhq cqhqVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = cqhqVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqhp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cqhq cqhqVar = this.b;
        ffji ffjiVar = this.c;
        comc a = cqhqVar.a();
        final cqho cqhoVar = new cqho(ffjiVar);
        elfl j = a.j(new emwl() { // from class: cqii
            @Override // defpackage.emwl
            public final /* synthetic */ Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }
        });
        this.a = 1;
        Object c = fgfz.c(j, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqhp cqhpVar = new cqhp(ffguVar, this.b, this.c);
        cqhpVar.d = obj;
        return cqhpVar;
    }
}
