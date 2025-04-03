package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class hdc implements hbe, ffke {
    private final /* synthetic */ ffix a;

    public hdc(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.hbe
    public final /* synthetic */ float a() {
        return ((Number) this.a.invoke()).floatValue();
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof hbe) && (obj instanceof ffke)) {
            return ffkj.e(this.a, ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
