package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akxk extends akxo {
    public final eolu a;
    public final alal b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final int f;
    private final akyo g;

    public akxk(eolu eoluVar, alal alalVar, int i, Optional optional, akyo akyoVar, Optional optional2, Optional optional3) {
        this.a = eoluVar;
        this.b = alalVar;
        this.f = i;
        this.c = optional;
        this.g = akyoVar;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // defpackage.akxo
    public final akyo a() {
        return this.g;
    }

    @Override // defpackage.akxo
    public final alal b() {
        return this.b;
    }

    @Override // defpackage.akxo
    public final eolu c() {
        return this.a;
    }

    @Override // defpackage.akxo
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.akxo
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxo) {
            akxo akxoVar = (akxo) obj;
            if (this.a.equals(akxoVar.c()) && this.b.equals(akxoVar.b()) && this.f == akxoVar.g() && this.c.equals(akxoVar.f()) && this.g.equals(akxoVar.a()) && this.d.equals(akxoVar.e()) && this.e.equals(akxoVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akxo
    public final Optional f() {
        return this.c;
    }

    @Override // defpackage.akxo
    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        Optional optional = this.e;
        Optional optional2 = this.d;
        akyo akyoVar = this.g;
        Optional optional3 = this.c;
        alal alalVar = this.b;
        return "BugleClearcutLoggerChain{event=" + this.a.toString() + ", logSpec=" + alalVar.toString() + ", logPurpose=" + Integer.toString(i - 1) + ", stacktrace=" + String.valueOf(optional3) + ", logger=" + akyoVar.toString() + ", overrideTimestamp=" + String.valueOf(optional2) + ", eventCode=" + String.valueOf(optional) + "}";
    }
}
