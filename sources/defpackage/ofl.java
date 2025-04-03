package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ofl implements odu, ffke {
    final /* synthetic */ ofp a;

    public ofl(ofp ofpVar) {
        this.a = ofpVar;
    }

    @Override // defpackage.odu
    public final void a() {
        this.a.e();
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffkh(0, this.a, ofp.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof odu) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
