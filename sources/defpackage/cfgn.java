package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgn extends ffhv implements ffji {
    int a;
    final /* synthetic */ cfgt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgn(cfgt cfgtVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cfgtVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cfgt cfgtVar = this.b;
        cfgm cfgmVar = new cfgm(null);
        this.a = 1;
        Object b = cfgtVar.e.b(cfgmVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfgn(this.b, (ffgu) obj).b(ffcu.a);
    }
}
