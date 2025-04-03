package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmg {
    public final jmf a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public jmg(jmf jmfVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = jmfVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final float a(float f) {
        return f + this.f;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final int c(int i) {
        return i + this.b;
    }

    public final int d(int i) {
        return i + this.d;
    }

    public final int e(int i) {
        int i2 = this.b;
        return ffmk.i(i, i2, this.c) - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmg)) {
            return false;
        }
        jmg jmgVar = (jmg) obj;
        return ffkj.e(this.a, jmgVar.a) && this.b == jmgVar.b && this.c == jmgVar.c && this.d == jmgVar.d && this.e == jmgVar.e && Float.compare(this.f, jmgVar.f) == 0 && Float.compare(this.g, jmgVar.g) == 0;
    }

    public final int f(int i) {
        return i - this.d;
    }

    public final long g(long j, boolean z) {
        if (z) {
            long j2 = jpm.a;
            if (jpm.h(j, j2)) {
                return j2;
            }
        }
        return jpn.a(c(jpm.e(j)), c(jpm.a(j)));
    }

    public final iam h(iam iamVar) {
        return iamVar.f((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final iam i(iam iamVar) {
        return iamVar.f((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-this.f) & 4294967295L));
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}
