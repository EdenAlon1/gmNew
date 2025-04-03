package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenr extends ffhv implements ffjm {
    final /* synthetic */ cenv a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cenr(ffgu ffguVar, cenv cenvVar, String str) {
        super(2, ffguVar);
        this.a = cenvVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cenr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cenv cenvVar = this.a;
        return csjx.c(cenvVar.c, cenvVar.d, "restore_timing_stats", this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cenr cenrVar = new cenr(ffguVar, this.a, this.b);
        cenrVar.c = obj;
        return cenrVar;
    }
}
