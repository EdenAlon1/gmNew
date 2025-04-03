package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycp extends ffhv implements ffjm {
    final /* synthetic */ aycs a;
    final /* synthetic */ ayds b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aycp(ffgu ffguVar, aycs aycsVar, ayds aydsVar) {
        super(2, ffguVar);
        this.a = aycsVar;
        this.b = aydsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aycp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = aycs.e;
        this.a.d.a(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aycp aycpVar = new aycp(ffguVar, this.a, this.b);
        aycpVar.c = obj;
        return aycpVar;
    }
}
