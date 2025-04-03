package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avuq extends avvd {
    public final cqpn a;
    public final int b;
    public final enhk c;
    public final String d;
    public final Optional e;
    private final Optional g;

    public avuq(cqpn cqpnVar, int i, enhk enhkVar, String str, Optional optional, Optional optional2) {
        this.a = cqpnVar;
        this.b = i;
        this.c = enhkVar;
        this.d = str;
        this.g = optional;
        this.e = optional2;
    }

    @Override // defpackage.avvd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.avvd
    public final cqpn b() {
        return this.a;
    }

    @Override // defpackage.avvd
    public final enhk c() {
        return this.c;
    }

    @Override // defpackage.avvd
    public final Optional d() {
        return this.g;
    }

    @Override // defpackage.avvd
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avvd) {
            avvd avvdVar = (avvd) obj;
            if (this.a.equals(avvdVar.b()) && this.b == avvdVar.a() && this.c.equals(avvdVar.c()) && this.d.equals(avvdVar.f()) && this.g.equals(avvdVar.d()) && this.e.equals(avvdVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avvd
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.g;
        enhk enhkVar = this.c;
        return "FileTransferFailure{reason=" + String.valueOf(this.a) + ", httpResponseCode=" + this.b + ", httpHeaders=" + String.valueOf(enhkVar) + ", transactionId=" + this.d + ", cronetException=" + String.valueOf(optional2) + ", genericException=" + String.valueOf(optional) + "}";
    }
}
