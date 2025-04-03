package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxo extends cah {
    public final String a;
    public final int b;
    public final Size c;
    public final int d;
    public final cai e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public bxo(String str, int i, int i2, Size size, int i3, cai caiVar, int i4, int i5, int i6) {
        this.a = str;
        this.b = i;
        this.i = i2;
        this.c = size;
        this.d = i3;
        this.e = caiVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    @Override // defpackage.cah
    public final int a() {
        return this.h;
    }

    @Override // defpackage.cah
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cah
    public final int c() {
        return this.f;
    }

    @Override // defpackage.cah
    public final int d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cah) {
            cah cahVar = (cah) obj;
            if (this.a.equals(cahVar.g()) && this.b == cahVar.f()) {
                int i = this.i;
                int h = cahVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == h && this.c.equals(cahVar.i()) && this.d == cahVar.b() && this.e.equals(cahVar.k()) && this.f == cahVar.c() && this.g == cahVar.d() && this.h == cahVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cah
    public final int f() {
        return this.b;
    }

    @Override // defpackage.cah, defpackage.byc
    public final String g() {
        return this.a;
    }

    @Override // defpackage.cah, defpackage.byc
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.i;
        bgx.b(i);
        return (((((((((((((((hashCode * 1000003) ^ this.b) * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    @Override // defpackage.cah
    public final Size i() {
        return this.c;
    }

    @Override // defpackage.cah
    public final cag j() {
        return new bxn(this);
    }

    @Override // defpackage.cah
    public final cai k() {
        return this.e;
    }

    public final String toString() {
        return "VideoEncoderConfig{mimeType=" + this.a + ", profile=" + this.b + ", inputTimebase=" + ((Object) bgx.a(this.i)) + ", resolution=" + this.c + ", colorFormat=" + this.d + ", dataSpace=" + this.e + ", frameRate=" + this.f + ", IFrameInterval=" + this.g + ", bitrate=" + this.h + "}";
    }
}
