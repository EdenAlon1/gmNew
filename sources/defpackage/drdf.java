package defpackage;

import android.net.Uri;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdf implements drdh {
    public final Uri a;
    public final ffud b;
    public final OutputStream c;

    public drdf(Uri uri, ffud ffudVar, OutputStream outputStream) {
        uri.getClass();
        outputStream.getClass();
        this.a = uri;
        this.b = ffudVar;
        this.c = outputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drdf)) {
            return false;
        }
        drdf drdfVar = (drdf) obj;
        return ffkj.e(this.a, drdfVar.a) && ffkj.e(this.b, drdfVar.b) && ffkj.e(this.c, drdfVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Started(gifUri=" + this.a + ", bitmapJob=" + this.b + ", outputStream=" + this.c + ")";
    }
}
