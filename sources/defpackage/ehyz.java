package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyz extends eibm {
    private final String a;
    private final eica b;
    private final eibk c;
    private final Optional d;
    private final Optional e;
    private final engw f;

    public ehyz(String str, eica eicaVar, eibk eibkVar, Optional optional, Optional optional2, engw engwVar) {
        this.a = str;
        this.b = eicaVar;
        this.c = eibkVar;
        this.d = optional;
        this.e = optional2;
        this.f = engwVar;
    }

    @Override // defpackage.eibm
    public final eibk a() {
        return this.c;
    }

    @Override // defpackage.eibm
    public final eica b() {
        return this.b;
    }

    @Override // defpackage.eibm
    public final engw c() {
        return this.f;
    }

    @Override // defpackage.eibm
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.eibm
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eibm) {
            eibm eibmVar = (eibm) obj;
            if (this.a.equals(eibmVar.f()) && this.b.equals(eibmVar.b()) && this.c.equals(eibmVar.a()) && this.d.equals(eibmVar.e()) && this.e.equals(eibmVar.d()) && enkr.h(this.f, eibmVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eibm
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
