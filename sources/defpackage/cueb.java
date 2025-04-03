package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cueb extends ffhv implements ffjm {
    final /* synthetic */ cued a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cueb(cued cuedVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cuedVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cueb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.b.b()).c(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cueb(this.a, this.b, ffguVar);
    }
}
