package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayhg extends ayvl {
    public final Optional a;
    public final Optional b;
    public final String c;

    public ayhg(Optional optional, Optional optional2, String str) {
        this.a = optional;
        this.b = optional2;
        this.c = str;
    }

    @Override // defpackage.ayvl
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.ayvl
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.ayvl
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayvl) {
            ayvl ayvlVar = (ayvl) obj;
            if (this.a.equals(ayvlVar.b()) && this.b.equals(ayvlVar.a()) && this.c.equals(ayvlVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "AnonymizedPhoneNumber{implicitCountryCode=" + this.a.toString() + ", explicitCountryCode=" + optional.toString() + ", nationalNumber=" + this.c + "}";
    }
}
