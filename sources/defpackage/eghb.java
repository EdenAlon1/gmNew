package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eghb extends eggb {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final Bitmap f;

    public eghb(int i, int i2, int i3, int i4, String str, Bitmap bitmap) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = bitmap;
    }

    @Override // defpackage.eggb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eggb
    public final int b() {
        return this.d;
    }

    @Override // defpackage.eggb
    public final int c() {
        return this.c;
    }

    @Override // defpackage.eggb
    public final int d() {
        return this.a;
    }

    @Override // defpackage.eggb
    public final Bitmap e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eggb) {
            eggb eggbVar = (eggb) obj;
            if (this.a == eggbVar.d() && this.b == eggbVar.a() && this.c == eggbVar.c() && this.d == eggbVar.b() && this.e.equals(eggbVar.f()) && this.f.equals(eggbVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eggb
    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "ArtSkinTone{skinTone=" + this.a + ", hue=" + this.b + ", saturation=" + this.c + ", lightness=" + this.d + ", url=" + this.e + ", bitmap=" + this.f.toString() + "}";
    }
}
