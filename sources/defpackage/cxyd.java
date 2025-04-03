package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxyd extends cyak {
    public final int a;
    public final int b;
    private final Drawable c;

    public cxyd(Drawable drawable, int i, int i2) {
        this.c = drawable;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cyak
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cyak
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cyak
    public final Drawable c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyak) {
            cyak cyakVar = (cyak) obj;
            if (this.c.equals(cyakVar.c()) && this.a == cyakVar.a() && this.b == cyakVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "IconParams{drawable=" + this.c.toString() + ", drawableResId=" + this.a + ", tintColor=" + this.b + "}";
    }
}
