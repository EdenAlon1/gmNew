package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uex extends ufr {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final apra d;
    private final long e;

    public uex(String str, Uri uri, eohh eohhVar, apra apraVar, long j) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = apraVar;
        this.e = j;
    }

    @Override // defpackage.ufr
    public final long a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ufr, defpackage.apmq
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
        if (obj instanceof ufr) {
            ufr ufrVar = (ufr) obj;
            if (this.a.equals(ufrVar.b()) && this.b.equals(ufrVar.e()) && this.c.equals(ufrVar.i())) {
                ufrVar.c();
                apra apraVar = this.d;
                if (apraVar != null ? apraVar.equals(ufrVar.fk()) : ufrVar.fk() == null) {
                    if (this.e == ufrVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ufr, defpackage.apmq
    public final apra fk() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        apra apraVar = this.d;
        int hashCode2 = apraVar == null ? 0 : apraVar.hashCode();
        long j = this.e;
        return (((hashCode * (-721379959)) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    public final String toString() {
        apra apraVar = this.d;
        eohh eohhVar = this.c;
        return "VCardContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", originalUri=null, progress=" + String.valueOf(apraVar) + ", fileSize=" + this.e + "}";
    }
}
