package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqo extends brh {
    private final Uri a;

    public bqo(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.a = uri;
    }

    @Override // defpackage.brh
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brh) {
            return this.a.equals(((brh) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
