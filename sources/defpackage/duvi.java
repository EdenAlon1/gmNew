package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvi extends duvq {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final engw e;
    public final boolean f;
    public final boolean g;

    public duvi(String str, int i, int i2, int i3, engw engwVar, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = engwVar;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.duvq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.duvq
    public final int b() {
        return this.d;
    }

    @Override // defpackage.duvq
    public final int c() {
        return this.b;
    }

    @Override // defpackage.duvq
    public final engw d() {
        return this.e;
    }

    @Override // defpackage.duvq
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duvq) {
            duvq duvqVar = (duvq) obj;
            if (this.a.equals(duvqVar.e()) && this.b == duvqVar.c() && this.c == duvqVar.a() && this.d == duvqVar.b() && enkr.h(this.e, duvqVar.d()) && this.f == duvqVar.f() && this.g == duvqVar.g()) {
                duvqVar.h();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.duvq
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.duvq
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "EmojiViewItem{emoji=" + this.a + ", positionInCategory=" + this.b + ", categoryIndex=" + this.c + ", categorySize=" + this.d + ", variants=" + String.valueOf(this.e) + ", inVariantsPopup=" + this.f + ", isSelected=" + this.g + ", isActivated=false}";
    }

    @Override // defpackage.duvq
    public final void h() {
    }
}
