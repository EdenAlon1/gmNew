package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akxj extends akxn {
    public akyo a;
    public int b;
    private eolu c;
    private alal d;
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();

    @Override // defpackage.akxn
    public final akxn a(eolu eoluVar) {
        if (eoluVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = eoluVar;
        return this;
    }

    @Override // defpackage.akxn
    public final akxo b() {
        alal alalVar;
        int i;
        akyo akyoVar;
        eolu eoluVar = this.c;
        if (eoluVar != null && (alalVar = this.d) != null && (i = this.b) != 0 && (akyoVar = this.a) != null) {
            return new akxk(eoluVar, alalVar, i, this.e, akyoVar, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" event");
        }
        if (this.d == null) {
            sb.append(" logSpec");
        }
        if (this.b == 0) {
            sb.append(" logPurpose");
        }
        if (this.a == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.akxn
    public final akyo c() {
        akyo akyoVar = this.a;
        if (akyoVar != null) {
            return akyoVar;
        }
        throw new IllegalStateException("Property \"logger\" has not been set");
    }

    @Override // defpackage.akxn
    public final void d(epyw epywVar) {
        this.g = Optional.of(epywVar);
    }

    @Override // defpackage.akxn
    public final void e(alal alalVar) {
        if (alalVar == null) {
            throw new NullPointerException("Null logSpec");
        }
        this.d = alalVar;
    }

    @Override // defpackage.akxn
    public final void f(akzo akzoVar) {
        this.f = Optional.of(akzoVar);
    }

    @Override // defpackage.akxn
    public final void g(Optional optional) {
        this.e = optional;
    }
}
