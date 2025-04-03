package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimc implements aihs {
    public final Uri a;
    private final Integer b;
    private final int c = 6;

    public aimc(Uri uri, Integer num) {
        this.a = uri;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aimc)) {
            return false;
        }
        aimc aimcVar = (aimc) obj;
        int i = aimcVar.c;
        return ffkj.e(this.a, aimcVar.a) && ffkj.e(this.b, aimcVar.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        return (((uri == null ? 0 : uri.hashCode()) + 186) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PenPalMagicEdit(openingSource=" + ((Object) eqac.b(6)) + ", uri=" + this.a + ", position=" + this.b + ")";
    }
}
