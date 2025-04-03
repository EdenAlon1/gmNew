package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxp extends cai {
    private final int f;
    private final int g;
    private final int h;

    public bxp(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.cai
    public final int a() {
        return this.h;
    }

    @Override // defpackage.cai
    public final int b() {
        return this.f;
    }

    @Override // defpackage.cai
    public final int c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cai) {
            cai caiVar = (cai) obj;
            if (this.f == caiVar.b() && this.g == caiVar.c() && this.h == caiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f + ", transfer=" + this.g + ", range=" + this.h + "}";
    }
}
