package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgik extends ffhv implements ffjm {
    final /* synthetic */ cgis a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgik(cgis cgisVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cgisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgik) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.i.b()).c("Bugle.Kids.AllowlistUpdate.Listener.Notified");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgik(this.a, ffguVar);
    }
}
