package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afp extends amo {
    public final int a;
    public final boolean b;
    public final boolean c;

    public afp(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.amo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.amo
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.amo
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amo) {
            amo amoVar = (amo) obj;
            amoVar.e();
            if (this.a == amoVar.a() && this.b == amoVar.b() && this.c == amoVar.c()) {
                amoVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.b ? 1237 : 1231) ^ (((-721379959) ^ this.a) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "FeatureSettings{cameraMode=0, requiredMaxBitDepth=" + this.a + ", previewStabilizationOn=" + this.b + ", ultraHdrOn=" + this.c + ", highSpeedOn=false}";
    }

    @Override // defpackage.amo
    public final void d() {
    }

    @Override // defpackage.amo
    public final void e() {
    }
}
