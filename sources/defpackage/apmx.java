package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apmx extends apns {
    private final String a;
    private final Uri b;
    private final String c;
    private final long d;
    private final apra e;

    public apmx(String str, Uri uri, String str2, long j, apra apraVar) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = j;
        this.e = apraVar;
    }

    @Override // defpackage.apph
    public final long a() {
        return this.d;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apns, defpackage.apmq
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
        if (obj instanceof apns) {
            apns apnsVar = (apns) obj;
            if (this.a.equals(apnsVar.b()) && this.b.equals(apnsVar.e()) && this.c.equals(apnsVar.h()) && this.d == apnsVar.a()) {
                apnsVar.c();
                apra apraVar = this.e;
                if (apraVar != null ? apraVar.equals(apnsVar.fk()) : apnsVar.fk() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apns, defpackage.apmq
    public final apra fk() {
        return this.e;
    }

    @Override // defpackage.apph
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        apra apraVar = this.e;
        int hashCode2 = apraVar == null ? 0 : apraVar.hashCode();
        long j = this.d;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ hashCode2;
    }

    public final String toString() {
        apra apraVar = this.e;
        return "BugleFileContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", fileName=" + this.c + ", fileSize=" + this.d + ", originalUri=null, progress=" + String.valueOf(apraVar) + "}";
    }
}
