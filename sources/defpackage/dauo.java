package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dauo extends cslh {
    final /* synthetic */ qpt a;
    final /* synthetic */ dauv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dauo(dauv dauvVar, qpt qptVar) {
        super("Bugle.Async.DebugUtils.clearGlideCache.Duration");
        this.a = qptVar;
        this.b = dauvVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        this.a.g();
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ((ddzb) this.b.Y.b()).l("Glide cache cleared.");
    }
}
