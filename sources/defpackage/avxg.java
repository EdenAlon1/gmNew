package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avxg extends avxo {
    public final File a;
    public final Uri b;

    public avxg(File file, Uri uri) {
        if (file == null) {
            throw new NullPointerException("Null destinationFile");
        }
        this.a = file;
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.b = uri;
    }

    @Override // defpackage.avxo
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.avxo
    public final File b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avxo) {
            avxo avxoVar = (avxo) obj;
            if (this.a.equals(avxoVar.b()) && this.b.equals(avxoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Uri uri = this.b;
        return "DestinationFileAndUri{destinationFile=" + this.a.toString() + ", outputUri=" + uri.toString() + "}";
    }
}
