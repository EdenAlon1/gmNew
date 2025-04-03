package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ues extends ufm {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final Size d;
    private final String e;
    private final Uri f;

    public ues(String str, Uri uri, eohh eohhVar, Size size, String str2, Uri uri2) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = size;
        this.e = str2;
        this.f = uri2;
    }

    @Override // defpackage.ufm
    public final String a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ufm, defpackage.apmq
    public final Uri c() {
        return this.f;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufm) {
            ufm ufmVar = (ufm) obj;
            if (this.a.equals(ufmVar.b()) && this.b.equals(ufmVar.e()) && this.c.equals(ufmVar.i()) && this.d.equals(ufmVar.f()) && this.e.equals(ufmVar.a()) && ((uri = this.f) != null ? uri.equals(ufmVar.c()) : ufmVar.c() == null)) {
                ufmVar.fk();
                ufmVar.k();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.d;
    }

    @Override // defpackage.ufm, defpackage.apmq
    public final apra fk() {
        return null;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Uri uri = this.f;
        return ((hashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * (-721379959);
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    @Override // defpackage.ufm, defpackage.apqd
    public final String k() {
        return null;
    }

    public final String toString() {
        Uri uri = this.f;
        Size size = this.d;
        eohh eohhVar = this.c;
        return "GifContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", size=" + size.toString() + ", domain=" + this.e + ", originalUri=" + String.valueOf(uri) + ", progress=null, caption=null}";
    }
}
