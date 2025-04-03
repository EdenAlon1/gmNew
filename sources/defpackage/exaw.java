package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exaw extends exby {
    private final int a;
    private final int b;
    private final int c;
    private final CharSequence d;
    private final Drawable e;
    private final exbx f;
    private final CharSequence g;
    private final int h;

    public exaw(int i, int i2, int i3, CharSequence charSequence, Drawable drawable, exbx exbxVar, CharSequence charSequence2, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = charSequence;
        this.e = drawable;
        this.f = exbxVar;
        this.g = charSequence2;
        this.h = i4;
    }

    @Override // defpackage.exby
    public final int a() {
        return this.b;
    }

    @Override // defpackage.exby
    public final int b() {
        return this.a;
    }

    @Override // defpackage.exby
    public final int c() {
        return this.c;
    }

    @Override // defpackage.exby
    public final int d() {
        return this.h;
    }

    @Override // defpackage.exby
    public final Drawable e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof exby) {
            exby exbyVar = (exby) obj;
            if (this.a == exbyVar.b() && this.b == exbyVar.a() && this.c == exbyVar.c() && this.d.equals(exbyVar.h()) && ((drawable = this.e) != null ? drawable.equals(exbyVar.e()) : exbyVar.e() == null) && this.f.equals(exbyVar.f())) {
                exbyVar.i();
                CharSequence charSequence = this.g;
                if (charSequence != null ? charSequence.equals(exbyVar.g()) : exbyVar.g() == null) {
                    if (this.h == exbyVar.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.exby
    public final exbx f() {
        return this.f;
    }

    @Override // defpackage.exby
    public final CharSequence g() {
        return this.g;
    }

    @Override // defpackage.exby
    public final CharSequence h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        Drawable drawable = this.e;
        int hashCode2 = (((hashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003) ^ this.f.hashCode();
        CharSequence charSequence = this.g;
        return (((hashCode2 * (-721379959)) ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003) ^ this.h;
    }

    public final String toString() {
        CharSequence charSequence = this.g;
        exbx exbxVar = this.f;
        Drawable drawable = this.e;
        return "FloatingToolbarMenuItem{itemId=" + this.a + ", groupId=" + this.b + ", order=" + this.c + ", title=" + this.d.toString() + ", icon=" + String.valueOf(drawable) + ", onMenuItemClickListener=" + exbxVar.toString() + ", tooltipText=null, contentDescription=" + String.valueOf(charSequence) + ", showAsAction=" + this.h + "}";
    }

    @Override // defpackage.exby
    public final void i() {
    }
}
