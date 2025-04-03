package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmig extends ffhv implements ffjm {
    final /* synthetic */ iir a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmig(iir iirVar, ffix ffixVar, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = iirVar;
        this.b = ffixVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmig) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (dmio.e(this.c)) {
            this.a.a(0);
            this.b.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmig(this.a, this.b, this.c, ffguVar);
    }
}
