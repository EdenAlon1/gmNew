package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jxx implements jyr {
    private final long a;

    public jxx(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        jwo.b("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.jyr
    public final float a() {
        return ibw.a(this.a);
    }

    @Override // defpackage.jyr
    public final long b() {
        return this.a;
    }

    @Override // defpackage.jyr
    public final ibq c() {
        return null;
    }

    @Override // defpackage.jyr
    public final /* synthetic */ jyr d(jyr jyrVar) {
        return jym.a(this, jyrVar);
    }

    @Override // defpackage.jyr
    public final /* synthetic */ jyr e(ffix ffixVar) {
        return jym.b(this, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxx)) {
            return false;
        }
        long j = this.a;
        long j2 = ((jxx) obj).a;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    public final int hashCode() {
        long j = ibw.a;
        return ffco.a(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) ibw.g(this.a)) + ')';
    }
}
