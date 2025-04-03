package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpso implements ffxy, ffke {
    final /* synthetic */ dptb a;

    public dpso(dptb dptbVar) {
        this.a = dptbVar;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffju(2, this.a, dptb.class, "onZoomStateEvent", "onZoomStateEvent(Landroidx/camera/core/ZoomState;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ffxy) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        this.a.b((axz) obj);
        return ffcu.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
