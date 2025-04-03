package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfds extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfdt b;
    final /* synthetic */ ffji c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfds(ffgu ffguVar, cfdt cfdtVar, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = cfdtVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfds) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cfdt cfdtVar = this.b;
        ffji ffjiVar = this.c;
        this.a = 1;
        Object a = cfdtVar.a(ffjiVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfds cfdsVar = new cfds(ffguVar, this.b, this.c);
        cfdsVar.d = obj;
        return cfdsVar;
    }
}
