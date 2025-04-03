package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvra extends dvrc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    public dvra(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.c = i7;
        this.d = i8;
        this.l = i9;
        this.e = i10;
        this.f = i11;
        this.m = i12;
        this.g = i13;
    }

    @Override // defpackage.dvrc
    public final int a() {
        return this.m;
    }

    @Override // defpackage.dvrc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dvrc
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dvrc
    public final int d() {
        return this.f;
    }

    @Override // defpackage.dvrc
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvrc) {
            dvrc dvrcVar = (dvrc) obj;
            if (this.a == dvrcVar.f() && this.b == dvrcVar.b() && this.h == dvrcVar.g() && this.i == dvrcVar.h() && this.j == dvrcVar.i() && this.k == dvrcVar.j() && this.c == dvrcVar.k() && this.d == dvrcVar.l() && this.l == dvrcVar.m() && this.e == dvrcVar.c() && this.f == dvrcVar.d() && this.m == dvrcVar.a() && this.g == dvrcVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dvrc
    public final int f() {
        return this.a;
    }

    @Override // defpackage.dvrc
    public final int g() {
        return this.h;
    }

    @Override // defpackage.dvrc
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.l) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.m) * 1000003) ^ this.g;
    }

    @Override // defpackage.dvrc
    public final int i() {
        return this.j;
    }

    @Override // defpackage.dvrc
    public final int j() {
        return this.k;
    }

    @Override // defpackage.dvrc
    public final int k() {
        return this.c;
    }

    @Override // defpackage.dvrc
    public final int l() {
        return this.d;
    }

    @Override // defpackage.dvrc
    public final int m() {
        return this.l;
    }

    public final String toString() {
        return "PaletteColors{primaryColor=" + this.a + ", onPrimaryColor=" + this.b + ", secondaryColor=" + this.h + ", surfaceColor=" + this.i + ", surfaceColor1=" + this.j + ", surfaceColor2=" + this.k + ", surfaceColor3=" + this.c + ", surfaceColor4=" + this.d + ", surfaceColor5=" + this.l + ", onSurfaceColor=" + this.e + ", onSurfaceVariantColor=" + this.f + ", backgroundColor=" + this.m + ", outlineColor=" + this.g + "}";
    }
}
