package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfgt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgq(ffgu ffguVar, cfgt cfgtVar) {
        super(2, ffguVar);
        this.b = cfgtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfgq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        Object b = cfgtVar.b(this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfgq cfgqVar = new cfgq(ffguVar, this.b);
        cfgqVar.c = obj;
        return cfgqVar;
    }
}
