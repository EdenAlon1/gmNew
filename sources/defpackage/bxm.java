package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxm extends bxj {
    public final String a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public bxm(String str, int i, int i2, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.f = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    @Override // defpackage.bxj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bxj
    public final int b() {
        return this.e;
    }

    @Override // defpackage.bxj
    public final int c() {
        return this.b;
    }

    @Override // defpackage.bxj
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxj) {
            bxj bxjVar = (bxj) obj;
            if (this.a.equals(bxjVar.g()) && this.b == bxjVar.c()) {
                int i = this.f;
                int h = bxjVar.h();
                if (i == 0) {
                    throw null;
                }
                if (h == 1 && this.c == bxjVar.a() && this.d == bxjVar.d() && this.e == bxjVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bxj, defpackage.byc
    public final String g() {
        return this.a;
    }

    @Override // defpackage.bxj, defpackage.byc
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.f;
        bgx.b(i);
        return (((((((((hashCode * 1000003) ^ this.b) * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "AudioEncoderConfig{mimeType=" + this.a + ", profile=" + this.b + ", inputTimebase=" + ((Object) bgx.a(this.f)) + ", bitrate=" + this.c + ", sampleRate=" + this.d + ", channelCount=" + this.e + "}";
    }
}
