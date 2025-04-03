package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbd extends ckex {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    private final Optional g;

    public ckbd(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.g = optional6;
        this.f = optional7;
    }

    @Override // defpackage.ckex
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.ckex
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.ckex
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.ckex
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.ckex
    public final Optional e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckex) {
            ckex ckexVar = (ckex) obj;
            if (this.a.equals(ckexVar.d()) && this.b.equals(ckexVar.a()) && this.c.equals(ckexVar.f()) && this.d.equals(ckexVar.b()) && this.e.equals(ckexVar.e()) && this.g.equals(ckexVar.g()) && this.f.equals(ckexVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ckex
    public final Optional f() {
        return this.c;
    }

    @Override // defpackage.ckex
    public final Optional g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.g;
        Optional optional3 = this.e;
        Optional optional4 = this.d;
        Optional optional5 = this.c;
        Optional optional6 = this.b;
        return "TransactionId{mmsMessage=" + this.a.toString() + ", legacyConferenceUri=" + optional6.toString() + ", rcsMessage=" + optional5.toString() + ", legacyTransactionId=" + optional4.toString() + ", mmsMessageProto=" + optional3.toString() + ", smsMessage=" + optional2.toString() + ", messagePersistenceId=" + optional.toString() + "}";
    }
}
