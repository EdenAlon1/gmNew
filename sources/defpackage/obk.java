package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class obk implements llh, ffke {
    private final /* synthetic */ ffji a;

    public obk(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.llh
    public final /* synthetic */ void a(Object obj) {
        this.a.invoke(obj);
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof llh) && (obj instanceof ffke)) {
            return ffkj.e(this.a, ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
