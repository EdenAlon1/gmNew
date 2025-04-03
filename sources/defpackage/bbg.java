package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbg extends bef {
    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public bbg(int i, String str, int i2, int i3, int i4, int i5) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // defpackage.bef
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bef
    public final int b() {
        return this.e;
    }

    @Override // defpackage.bef
    public final int c() {
        return this.a;
    }

    @Override // defpackage.bef
    public final int d() {
        return this.f;
    }

    @Override // defpackage.bef
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bef) {
            bef befVar = (bef) obj;
            if (this.a == befVar.c() && this.b.equals(befVar.f()) && this.c == befVar.a() && this.d == befVar.e() && this.e == befVar.b() && this.f == befVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bef
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "AudioProfileProxy{codec=" + this.a + ", mediaType=" + this.b + ", bitrate=" + this.c + ", sampleRate=" + this.d + ", channels=" + this.e + ", profile=" + this.f + "}";
    }
}
