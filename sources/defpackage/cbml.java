package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbml extends cboy {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public cbml(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    @Override // defpackage.cboy
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cboy
    public final int b() {
        return this.h;
    }

    @Override // defpackage.cboy
    public final int c() {
        return this.e;
    }

    @Override // defpackage.cboy
    public final int d() {
        return this.f;
    }

    @Override // defpackage.cboy
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cboy) {
            cboy cboyVar = (cboy) obj;
            if (this.a == cboyVar.a() && this.b == cboyVar.e() && this.c == cboyVar.f() && this.d == cboyVar.h() && this.e == cboyVar.c() && this.f == cboyVar.d() && this.g == cboyVar.g() && this.h == cboyVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cboy
    public final int f() {
        return this.c;
    }

    @Override // defpackage.cboy
    public final int g() {
        return this.g;
    }

    @Override // defpackage.cboy
    public final int h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    public final String toString() {
        return "Limits{chatLimit=" + this.a + ", messageLimit=" + this.b + ", photoLimit=" + this.c + ", videoLimit=" + this.d + ", linkLimit=" + this.e + ", locationLimit=" + this.f + ", starredLimit=" + this.g + ", contactLimit=" + this.h + "}";
    }
}
