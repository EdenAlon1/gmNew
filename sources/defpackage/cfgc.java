package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfgt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgc(cfgt cfgtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cfgtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfgc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        cfgb cfgbVar = cfgb.b;
        this.a = 1;
        Object d = cfgtVar.d(cfgbVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfgc(this.b, ffguVar);
    }
}
