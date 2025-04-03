package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cueh extends ffhv implements ffjm {
    final /* synthetic */ cuem a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cueh(cuem cuemVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cuemVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cueh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return cuem.e(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cueh(this.a, this.b, ffguVar);
    }
}
