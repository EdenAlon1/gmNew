package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apzf extends apzi {
    private final String a;
    private final Uri b;
    private final Size c;
    private final String d = "custom_sticker";
    private final String e;

    public apzf(String str, Uri uri, Size size, String str2) {
        this.a = str;
        this.b = uri;
        this.c = size;
        this.e = str2;
    }

    @Override // defpackage.apzi, defpackage.appt
    public final String a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apzi, defpackage.apmq
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
        if (obj instanceof apzi) {
            apzi apziVar = (apzi) obj;
            if (this.a.equals(apziVar.b()) && this.b.equals(apziVar.e()) && this.c.equals(apziVar.f())) {
                apziVar.k();
                apziVar.c();
                apziVar.fk();
                if (this.d.equals(apziVar.g()) && this.e.equals(apziVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.c;
    }

    @Override // defpackage.apzi, defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apzi, defpackage.appt
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1525764945) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
    }

    public final String toString() {
        Size size = this.c;
        return "EmotifyReactionContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", size=" + size.toString() + ", caption=null, originalUri=null, progress=null, stickerSetId=" + this.d + ", stickerId=" + this.e + "}";
    }
}
