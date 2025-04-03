package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzr extends ffhv implements ffjm {
    final /* synthetic */ gvi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzr(gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gzr(this.a, ffguVar);
    }
}
