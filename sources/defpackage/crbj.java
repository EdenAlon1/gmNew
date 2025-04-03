package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crbj extends crek {
    public final bdhg a;
    public final Optional b;
    public final Optional c;
    public final awvd d;

    public crbj(bdhg bdhgVar, Optional optional, Optional optional2, awvd awvdVar) {
        this.a = bdhgVar;
        this.b = optional;
        this.c = optional2;
        this.d = awvdVar;
    }

    @Override // defpackage.crek
    public final awvd a() {
        return this.d;
    }

    @Override // defpackage.crek
    public final bdhg b() {
        return this.a;
    }

    @Override // defpackage.crek
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.crek
    public final Optional d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crek) {
            crek crekVar = (crek) obj;
            if (this.a.equals(crekVar.b()) && this.b.equals(crekVar.d()) && this.c.equals(crekVar.c()) && this.d.equals(crekVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        awvd awvdVar = this.d;
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "SendFileTransferResponse{rcsMessageId=" + this.a.toString() + ", fallbackUriString=" + String.valueOf(optional2) + ", expiry=" + String.valueOf(optional) + ", fileUploadResponse=" + awvdVar.toString() + "}";
    }
}
