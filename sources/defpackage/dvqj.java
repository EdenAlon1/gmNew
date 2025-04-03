package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvqj extends ffhv implements ffjm {
    final /* synthetic */ Exception a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvqj(Exception exc, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvqj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((ensz) ((ensz) dvqk.a.j()).g(this.a)).q("Failed to install security provider, GNP in-app sync can't run.");
        return new ealc(2, this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvqj(this.a, ffguVar);
    }
}
