package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnvh extends ffhv implements ffjm {
    final /* synthetic */ cnvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnvh(cnvp cnvpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cnvpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnvh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.c();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnvh(this.a, ffguVar);
    }
}
