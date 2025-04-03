package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edzd extends edzg {
    public final long a;
    private final Context b;
    private final Uri c;

    public edzd(Context context, Uri uri, long j) {
        this.b = context;
        this.c = uri;
        this.a = j;
    }

    @Override // defpackage.edzg
    public final long a() {
        return this.a;
    }

    @Override // defpackage.edzg
    public final Context b() {
        return this.b;
    }

    @Override // defpackage.edzg
    public final Uri c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edzg) {
            edzg edzgVar = (edzg) obj;
            if (this.b.equals(edzgVar.b()) && this.c.equals(edzgVar.c()) && this.a == edzgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        long j = this.a;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Uri uri = this.c;
        return "FileContent{context=" + this.b.toString() + ", contentUri=" + uri.toString() + ", contentLength=" + this.a + "}";
    }
}
