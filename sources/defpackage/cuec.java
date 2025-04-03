package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuec extends ffhv implements ffjm {
    final /* synthetic */ cued a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuec(cued cuedVar, String str, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cuedVar;
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuec) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.b.b()).e(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuec(this.a, this.b, this.c, ffguVar);
    }
}
