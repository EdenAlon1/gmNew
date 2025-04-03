package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jic {
    private final Resources.Theme a;
    private final int b;

    public jic(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jic)) {
            return false;
        }
        jic jicVar = (jic) obj;
        return ffkj.e(this.a, jicVar.a) && this.b == jicVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ')';
    }
}
