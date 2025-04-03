package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfkh extends ffhv implements ffjm {
    final /* synthetic */ Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkh(Throwable th, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = th;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        axnw.d(this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfkh(this.a, ffguVar);
    }
}
