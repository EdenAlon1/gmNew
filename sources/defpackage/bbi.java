package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbi extends beh {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    private final int j;

    public bbi(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.j = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    @Override // defpackage.beh
    public final int a() {
        return this.g;
    }

    @Override // defpackage.beh
    public final int b() {
        return this.j;
    }

    @Override // defpackage.beh
    public final int c() {
        return this.h;
    }

    @Override // defpackage.beh
    public final int d() {
        return this.a;
    }

    @Override // defpackage.beh
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beh) {
            beh behVar = (beh) obj;
            if (this.a == behVar.d() && this.b.equals(behVar.j()) && this.j == behVar.b() && this.c == behVar.e() && this.d == behVar.i() && this.e == behVar.g() && this.f == behVar.h() && this.g == behVar.a() && this.h == behVar.c() && this.i == behVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.beh
    public final int f() {
        return this.i;
    }

    @Override // defpackage.beh
    public final int g() {
        return this.e;
    }

    @Override // defpackage.beh
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // defpackage.beh
    public final int i() {
        return this.d;
    }

    @Override // defpackage.beh
    public final String j() {
        return this.b;
    }

    public final String toString() {
        return "VideoProfileProxy{codec=" + this.a + ", mediaType=" + this.b + ", bitrate=" + this.j + ", frameRate=" + this.c + ", width=" + this.d + ", height=" + this.e + ", profile=" + this.f + ", bitDepth=" + this.g + ", chromaSubsampling=" + this.h + ", hdrFormat=" + this.i + "}";
    }
}
