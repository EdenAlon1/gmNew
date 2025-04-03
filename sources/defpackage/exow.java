package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exow extends expd {
    public final int a;
    public final int b;
    public final exos c;

    public exow(int i, int i2, exos exosVar) {
        this.a = i;
        this.b = i2;
        this.c = exosVar;
    }

    @Override // defpackage.expd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.expd
    public final int b() {
        return this.a;
    }

    @Override // defpackage.expd
    public final exos c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof expd) {
            expd expdVar = (expd) obj;
            if (this.a == expdVar.b() && this.b == expdVar.a() && this.c.equals(expdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "SegmentationOptions{outputWidth=" + this.a + ", outputHeight=" + this.b + ", imageProcessingOptions=" + this.c.toString() + "}";
    }
}
