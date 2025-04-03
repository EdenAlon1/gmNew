package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yrl extends ffhv implements ffjm {
    final /* synthetic */ yrn a;
    final /* synthetic */ xhl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrl(yrn yrnVar, xhl xhlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yrnVar;
        this.b = xhlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yrl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((xto) this.a.d.b()).a(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yrl(this.a, this.b, ffguVar);
    }
}
