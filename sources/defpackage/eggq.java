package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggq extends egfi {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final int e;
    private final int f;
    private final int g;
    private final Bitmap h;
    private final engw i;

    public eggq(String str, String str2, boolean z, String str3, int i, int i2, int i3, Bitmap bitmap, engw engwVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = bitmap;
        this.i = engwVar;
    }

    @Override // defpackage.egfi
    public final int a() {
        return this.e;
    }

    @Override // defpackage.egfi
    public final int b() {
        return this.g;
    }

    @Override // defpackage.egfi
    public final int c() {
        return this.f;
    }

    @Override // defpackage.egfi
    public final Bitmap d() {
        return this.h;
    }

    @Override // defpackage.egfi
    public final engw e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egfi) {
            egfi egfiVar = (egfi) obj;
            if (this.a.equals(egfiVar.g()) && this.b.equals(egfiVar.h()) && this.c == egfiVar.i() && this.d.equals(egfiVar.f()) && this.e == egfiVar.a() && this.f == egfiVar.c() && this.g == egfiVar.b() && this.h.equals(egfiVar.d()) && enkr.h(this.i, egfiVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egfi
    public final String f() {
        return this.d;
    }

    @Override // defpackage.egfi
    public final String g() {
        return this.a;
    }

    @Override // defpackage.egfi
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.egfi
    public final boolean i() {
        return this.c;
    }

    public final String toString() {
        engw engwVar = this.i;
        return "ArtLayer{name=" + this.a + ", url=" + this.b + ", customizable=" + this.c + ", displayName=" + this.d + ", hue=" + this.e + ", saturation=" + this.f + ", lightness=" + this.g + ", bitmap=" + this.h.toString() + ", skinTones=" + engwVar.toString() + "}";
    }
}
