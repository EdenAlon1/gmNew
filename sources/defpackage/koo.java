package defpackage;

import android.content.LocusId;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koo {
    public final String a;
    public final LocusId b;

    public koo(String str) {
        ksw.j(str);
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new LocusId(str);
        } else {
            this.b = null;
        }
    }

    public static koo a(LocusId locusId) {
        String id;
        ksw.i(locusId, "locusId cannot be null");
        id = locusId.getId();
        ksw.j(id);
        return new koo(id);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.a;
        String str2 = ((koo) obj).a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
