package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobl implements dobm {
    public final Uri a;

    public dobl(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dobl) && ffkj.e(this.a, ((dobl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RichCardActionIconUri(iconUri=" + this.a + ")";
    }
}
