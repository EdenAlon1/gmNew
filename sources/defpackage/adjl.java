package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjl {
    public final String a;
    public final Drawable b;
    private final String c;

    public adjl(String str, Drawable drawable) {
        this.c = null;
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adjl)) {
            return false;
        }
        adjl adjlVar = (adjl) obj;
        String str = adjlVar.c;
        return ffkj.e(null, null) && ffkj.e(this.a, adjlVar.a) && ffkj.e(this.b, adjlVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Drawable drawable = this.b;
        return (hashCode * 31) + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "OneGoogleEducationTooltipModel(title=null, subTitle=" + this.a + ", icon=" + this.b + ")";
    }

    public adjl() {
        this(null, null);
    }
}
