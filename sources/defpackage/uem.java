package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uem extends ufg {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final Size d;
    private final String e;

    public uem(String str, Uri uri, eohh eohhVar, Size size, String str2) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = size;
        this.e = str2;
    }

    @Override // defpackage.ufg
    public final String a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ufg, defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufg) {
            ufg ufgVar = (ufg) obj;
            if (this.a.equals(ufgVar.b()) && this.b.equals(ufgVar.e()) && this.c.equals(ufgVar.i()) && this.d.equals(ufgVar.f())) {
                ufgVar.k();
                if (this.e.equals(ufgVar.a())) {
                    ufgVar.c();
                    ufgVar.fk();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.d;
    }

    @Override // defpackage.ufg, defpackage.apmq
    public final apra fk() {
        return null;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode()) * (-721379959);
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
    }

    public final String toString() {
        Size size = this.d;
        eohh eohhVar = this.c;
        return "ExpressiveStickerContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", size=" + size.toString() + ", caption=null, stickerName=" + this.e + ", originalUri=null, progress=null}";
    }
}
