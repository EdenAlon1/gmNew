package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fdz implements fcu, ffke {
    private final /* synthetic */ ffix a;

    public fdz(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.fcu
    public final /* synthetic */ long a() {
        return ((iak) this.a.invoke()).a;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fcu) && (obj instanceof ffke)) {
            return ffkj.e(this.a, ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
