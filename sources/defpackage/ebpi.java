package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebpi extends ebpo {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public ebpi(int i, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = i4;
        this.f = f2;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    @Override // defpackage.ebpo
    public final float a() {
        return this.d;
    }

    @Override // defpackage.ebpo
    public final float b() {
        return this.f;
    }

    @Override // defpackage.ebpo
    public final int c() {
        return this.b;
    }

    @Override // defpackage.ebpo
    public final int d() {
        return this.c;
    }

    @Override // defpackage.ebpo
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebpo) {
            ebpo ebpoVar = (ebpo) obj;
            if (this.a == ebpoVar.e() && this.b == ebpoVar.c() && this.c == ebpoVar.d() && Float.floatToIntBits(this.d) == Float.floatToIntBits(ebpoVar.a()) && this.e == ebpoVar.g() && Float.floatToIntBits(this.f) == Float.floatToIntBits(ebpoVar.b()) && this.g == ebpoVar.h() && this.h == ebpoVar.f() && this.i == ebpoVar.i() && this.j == ebpoVar.j() && this.k == ebpoVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ebpo
    public final int f() {
        return this.h;
    }

    @Override // defpackage.ebpo
    public final int g() {
        return this.e;
    }

    @Override // defpackage.ebpo
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    @Override // defpackage.ebpo
    public final int i() {
        return this.i;
    }

    @Override // defpackage.ebpo
    public final int j() {
        return this.j;
    }

    @Override // defpackage.ebpo
    public final int k() {
        return this.k;
    }

    public final String toString() {
        return "ExpressSignInAttributes{contentContainerPaddingTop=" + this.a + ", containerExternalHorizontalSpacing=" + this.b + ", containerInternalAdditionalHorizontalSpacing=" + this.c + ", dialogCornerRadius=" + this.d + ", importantBoxBackgroundColor=" + this.e + ", importantBoxCornerRadius=" + this.f + ", importantBoxMarginTop=" + this.g + ", dialogMarginBottom=" + this.h + ", legalDisclaimerBottomPadding=" + this.i + ", legalDisclaimerTopPadding=" + this.j + ", selectedAccountViewMarginVertical=" + this.k + "}";
    }
}
