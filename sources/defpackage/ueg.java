package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ueg extends uef {
    private final String a;
    private final Uri b;
    private final eohh c;
    private final long d;
    private final dteh e;

    public ueg(String str, Uri uri, eohh eohhVar, long j, dteh dtehVar) {
        this.a = str;
        this.b = uri;
        this.c = eohhVar;
        this.d = j;
        this.e = dtehVar;
    }

    @Override // defpackage.uef
    public final long a() {
        return this.d;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.uef, defpackage.apmq
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
        if (obj instanceof uef) {
            uef uefVar = (uef) obj;
            if (this.a.equals(uefVar.b()) && this.b.equals(uefVar.e()) && this.c.equals(uefVar.i()) && this.d == uefVar.a() && this.e.equals(uefVar.h())) {
                uefVar.c();
                uefVar.fk();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uef, defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.uef
    public final dteh h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * (-721379959);
    }

    @Override // defpackage.ufd
    public final eohh i() {
        return this.c;
    }

    public final String toString() {
        dteh dtehVar = this.e;
        eohh eohhVar = this.c;
        return "AudioContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + eohhVar.toString() + ", duration=" + this.d + ", voiceMetadata=" + dtehVar.toString() + ", originalUri=null, progress=null}";
    }
}
