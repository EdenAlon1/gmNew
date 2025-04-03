package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwe extends bve {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public bwe(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.bve
    public final int a() {
        return this.e;
    }

    @Override // defpackage.bve
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bve
    public final int d() {
        return this.d;
    }

    @Override // defpackage.bve
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bve) {
            bve bveVar = (bve) obj;
            if (this.b == bveVar.b() && this.c == bveVar.e() && this.d == bveVar.d() && this.e == bveVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "AudioSettings{audioSource=" + this.b + ", sampleRate=" + this.c + ", channelCount=" + this.d + ", audioFormat=" + this.e + "}";
    }
}
