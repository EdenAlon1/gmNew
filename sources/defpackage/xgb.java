package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgb {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentUsageLogger");
    public final ffsk b;
    public final ffbr c;
    public final atcf d;
    private final ffhd e;
    private final xfu f;
    private final aldw g;

    public xgb(ffsk ffskVar, ffhd ffhdVar, xfu xfuVar, aldw aldwVar, ffbr ffbrVar, atcf atcfVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        this.b = ffskVar;
        this.e = ffhdVar;
        this.f = xfuVar;
        this.g = aldwVar;
        this.c = ffbrVar;
        this.d = atcfVar;
    }

    public final Object a(xhp xhpVar, ffgu ffguVar) {
        return ffra.a(this.e, new xfw(xhpVar, this, null), ffguVar);
    }

    @ffbs
    public final void b(xhp xhpVar, int i) {
        xhpVar.getClass();
        axol.k(this.b, null, new xfx(this, xhpVar, i, null), 3);
    }

    public final void c(xhp xhpVar, int i) {
        xhpVar.getClass();
        axol.k(this.b, null, new xfy(this, xhpVar, i, null), 3);
    }

    public final void d(int i, xfs xfsVar, int i2) {
        aldw.b(this.g, i, xfu.a(xfsVar), Integer.valueOf(i2), null, 24);
    }
}
