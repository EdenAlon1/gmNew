package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmt implements xik {
    public final ffbr a;
    public final ffbr b;
    public final enru c;
    private final ffbr d;
    private final ffsk e;

    public wmt(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.d = ffbrVar2;
        this.b = ffbrVar3;
        this.e = ffskVar;
        this.c = enru.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger");
    }

    @Override // defpackage.xik
    public final void a(xhu xhuVar) {
        if (((wmu) this.d.b()).o()) {
            eyfy build = ((wmu) this.d.b()).a().build();
            build.getClass();
            eqss eqssVar = (eqss) build;
            ((wmu) this.d.b()).i();
            if ((!((Boolean) ctjd.bs.e()).booleanValue() || eqssVar.c > 0 || eqssVar.d > 0) && ((Boolean) ctjd.aP.e()).booleanValue()) {
                if (((Number) ctjd.bl.e()).longValue() > 0) {
                    axol.k(this.e, null, new wms(this, eqssVar, null), 3);
                } else {
                    ((enrr) this.c.f().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger", "onSendClickedBeforeQueued", 86, "MagicComposeSendClickedLogger.kt")).q("Not delaying logging");
                    ((wmf) this.a.b()).n(eqssVar);
                }
            }
        }
    }
}
