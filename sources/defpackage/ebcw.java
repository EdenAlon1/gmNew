package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebcw extends ebff {
    public final Drawable a;
    public final int b;
    public final emxc c;
    private final boolean d;

    public ebcw(Drawable drawable, int i, boolean z, emxc emxcVar) {
        this.a = drawable;
        this.b = i;
        this.d = z;
        this.c = emxcVar;
    }

    @Override // defpackage.ebff
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ebff
    public final Drawable b() {
        return this.a;
    }

    @Override // defpackage.ebff
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.ebff
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebff) {
            ebff ebffVar = (ebff) obj;
            Drawable drawable = this.a;
            if (drawable != null ? drawable.equals(ebffVar.b()) : ebffVar.b() == null) {
                if (this.b == ebffVar.a() && this.d == ebffVar.d() && this.c.equals(ebffVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int hashCode = drawable == null ? 0 : drawable.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "TintAwareIcon{icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", useTint=" + this.d + ", iconContentDescription=" + String.valueOf(emxcVar) + "}";
    }
}
