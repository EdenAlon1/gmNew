package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctzm extends ctzz {
    public final int a;
    private final Optional b;
    private final dixw c;

    public ctzm(Optional optional, int i, dixw dixwVar) {
        this.b = optional;
        this.a = i;
        if (dixwVar == null) {
            throw new NullPointerException("Null appProperties");
        }
        this.c = dixwVar;
    }

    @Override // defpackage.ctzz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ctzz
    public final dixw b() {
        return this.c;
    }

    @Override // defpackage.ctzz
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctzz) {
            ctzz ctzzVar = (ctzz) obj;
            if (this.b.equals(ctzzVar.c()) && this.a == ctzzVar.a() && this.c.equals(ctzzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dixw dixwVar = this.c;
        return "PhenotypeRegistrationData{phenotypeReregistrationTimer=" + this.b.toString() + ", subId=" + this.a + ", appProperties=" + dixwVar.toString() + "}";
    }
}
