package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtly extends ffhv implements ffjm {
    final /* synthetic */ dtma a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtly(dtma dtmaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dtmaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtly) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        System.loadLibrary(this.a.c.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtly(this.a, ffguVar);
    }
}
