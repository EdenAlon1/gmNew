package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctcq extends ctci {
    public final ctch a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public ctcq(ctch ctchVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.a = ctchVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
    }

    @Override // defpackage.ctci
    public final ctch a() {
        return this.a;
    }

    @Override // defpackage.ctci
    public final Optional b() {
        return this.e;
    }

    @Override // defpackage.ctci
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.ctci
    public final Optional d() {
        return this.b;
    }

    @Override // defpackage.ctci
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctci) {
            ctci ctciVar = (ctci) obj;
            if (this.a.equals(ctciVar.a()) && this.b.equals(ctciVar.d()) && this.c.equals(ctciVar.f()) && this.d.equals(ctciVar.e()) && this.e.equals(ctciVar.b()) && this.f.equals(ctciVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctci
    public final Optional f() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "AudioPlaybackRequest{dataSource=" + this.a.toString() + ", fallbackDataSource=" + String.valueOf(optional5) + ", volume=" + String.valueOf(optional4) + ", looping=" + optional3.toString() + ", audioAttributes=" + String.valueOf(optional2) + ", audioFocusParameters=" + String.valueOf(optional) + "}";
    }
}
