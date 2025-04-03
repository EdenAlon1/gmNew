package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apnj extends apom {
    private final String a;
    private final Uri b;
    private final long c;
    private final boolean d;
    private final apra e;

    public apnj(String str, Uri uri, long j, boolean z, apra apraVar) {
        this.a = str;
        this.b = uri;
        this.c = j;
        this.d = z;
        this.e = apraVar;
    }

    @Override // defpackage.apqb
    public final long a() {
        return this.c;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apom, defpackage.apmq
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
        if (obj instanceof apom) {
            apom apomVar = (apom) obj;
            if (this.a.equals(apomVar.b()) && this.b.equals(apomVar.e()) && this.c == apomVar.a() && this.d == apomVar.g()) {
                apomVar.c();
                apra apraVar = this.e;
                if (apraVar != null ? apraVar.equals(apomVar.fk()) : apomVar.fk() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apom, defpackage.apmq
    public final apra fk() {
        return this.e;
    }

    @Override // defpackage.apqb
    public final boolean g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        apra apraVar = this.e;
        int hashCode2 = apraVar == null ? 0 : apraVar.hashCode();
        long j = this.c;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959)) ^ hashCode2;
    }

    public final String toString() {
        apra apraVar = this.e;
        return "BugleUnknownPendingAttachmentContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", fileSize=" + this.c + ", canRedownload=" + this.d + ", originalUri=null, progress=" + String.valueOf(apraVar) + "}";
    }
}
