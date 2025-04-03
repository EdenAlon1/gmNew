package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class gqt implements ibz, ffke {
    private final /* synthetic */ ffix a;

    public gqt(ffix ffixVar) {
        this.a = ffixVar;
    }

    @Override // defpackage.ibz
    public final /* synthetic */ long a() {
        return ((ibw) ((ffks) this.a).a()).i;
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ibz) && (obj instanceof ffke)) {
            return ffkj.e(this.a, ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
