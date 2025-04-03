package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfgt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgr(ffgu ffguVar, cfgt cfgtVar) {
        super(2, ffguVar);
        this.b = cfgtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfgr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        this.a = 1;
        Object a = cfgtVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfgr cfgrVar = new cfgr(ffguVar, this.b);
        cfgrVar.c = obj;
        return cfgrVar;
    }
}
