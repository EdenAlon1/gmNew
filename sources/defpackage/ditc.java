package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditc extends ditj {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final Optional o;
    private final Optional p;

    public ditc(String str, long j, String str2, String str3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = optional5;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = optional9;
        this.n = optional10;
        this.o = optional11;
        this.p = optional12;
    }

    @Override // defpackage.ditj
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ditj
    public final Optional b() {
        return this.j;
    }

    @Override // defpackage.ditj
    public final Optional c() {
        return this.g;
    }

    @Override // defpackage.ditj
    public final Optional d() {
        return this.l;
    }

    @Override // defpackage.ditj
    public final Optional e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ditj) {
            ditj ditjVar = (ditj) obj;
            if (this.a.equals(ditjVar.p()) && this.b == ditjVar.a() && this.c.equals(ditjVar.n()) && this.d.equals(ditjVar.o()) && this.e.equals(ditjVar.j()) && this.f.equals(ditjVar.i()) && this.g.equals(ditjVar.c()) && this.h.equals(ditjVar.m()) && this.i.equals(ditjVar.g()) && this.j.equals(ditjVar.b()) && this.k.equals(ditjVar.e()) && this.l.equals(ditjVar.d()) && this.m.equals(ditjVar.k()) && this.n.equals(ditjVar.l()) && this.o.equals(ditjVar.f()) && this.p.equals(ditjVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ditj
    public final Optional f() {
        return this.o;
    }

    @Override // defpackage.ditj
    public final Optional g() {
        return this.i;
    }

    @Override // defpackage.ditj
    public final Optional h() {
        return this.p;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((((((((((((((((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.ditj
    public final Optional i() {
        return this.f;
    }

    @Override // defpackage.ditj
    public final Optional j() {
        return this.e;
    }

    @Override // defpackage.ditj
    public final Optional k() {
        return this.m;
    }

    @Override // defpackage.ditj
    public final Optional l() {
        return this.n;
    }

    @Override // defpackage.ditj
    public final Optional m() {
        return this.h;
    }

    @Override // defpackage.ditj
    public final String n() {
        return this.c;
    }

    @Override // defpackage.ditj
    public final String o() {
        return this.d;
    }

    @Override // defpackage.ditj
    public final String p() {
        return this.a;
    }

    public final String toString() {
        Optional optional = this.p;
        Optional optional2 = this.o;
        Optional optional3 = this.n;
        Optional optional4 = this.m;
        Optional optional5 = this.l;
        Optional optional6 = this.k;
        Optional optional7 = this.j;
        Optional optional8 = this.i;
        Optional optional9 = this.h;
        Optional optional10 = this.g;
        Optional optional11 = this.f;
        return "FileTransferParameters{rcsMessageId=" + this.a + ", fileSize=" + this.b + ", contentType=" + this.c + ", fileUrl=" + this.d + ", remoteUserId=" + String.valueOf(this.e) + ", remoteInstance=" + String.valueOf(optional11) + ", brandedUrl=" + String.valueOf(optional10) + ", validityTimestamp=" + String.valueOf(optional9) + ", fileTransferSessionId=" + String.valueOf(optional8) + ", associatedSessionId=" + String.valueOf(optional7) + ", fileName=" + String.valueOf(optional6) + ", downloadedFileUri=" + String.valueOf(optional5) + ", thumbnailContentType=" + String.valueOf(optional4) + ", thumbnailData=" + String.valueOf(optional3) + ", fileTransferPushMessageXml=" + String.valueOf(optional2) + ", opaqueData=" + optional.toString() + "}";
    }
}
