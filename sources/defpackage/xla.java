package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xla extends ffhv implements ffjm {
    final /* synthetic */ aqux a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(ffgu ffguVar, aqux aquxVar) {
        super(2, ffguVar);
        this.a = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xla) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.t());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xla xlaVar = new xla(ffguVar, this.a);
        xlaVar.b = obj;
        return xlaVar;
    }
}
