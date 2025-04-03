package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ueo extends ufi {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final String d;
    private final long e;

    public ueo(String str, Uri uri, eohh eohhVar, String str2, long j) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.apph
    public final long a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ufi, defpackage.apmq
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
        if (obj instanceof ufi) {
            ufi ufiVar = (ufi) obj;
            if (this.a.equals(ufiVar.b()) && this.b.equals(ufiVar.e()) && this.c.equals(ufiVar.i()) && this.d.equals(ufiVar.h()) && this.e == ufiVar.a()) {
                ufiVar.c();
                ufiVar.fk();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ufi, defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apph
    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return ((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959);
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    public final String toString() {
        eohh eohhVar = this.c;
        return "FileContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", fileName=" + this.d + ", fileSize=" + this.e + ", originalUri=null, progress=null}";
    }
}
