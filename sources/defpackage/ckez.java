package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckez extends ckgd {
    private final eqwf a;
    private final ckgb b;
    private final Optional c;
    private final Optional d;

    public ckez(eqwf eqwfVar, ckgb ckgbVar, Optional optional, Optional optional2) {
        if (eqwfVar == null) {
            throw new NullPointerException("Null availability");
        }
        this.a = eqwfVar;
        if (ckgbVar == null) {
            throw new NullPointerException("Null hint");
        }
        this.b = ckgbVar;
        this.c = optional;
        this.d = optional2;
    }

    @Override // defpackage.ckgd
    public final ckgb a() {
        return this.b;
    }

    @Override // defpackage.ckgd
    public final eqwf b() {
        return this.a;
    }

    @Override // defpackage.ckgd
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.ckgd
    public final Optional d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckgd) {
            ckgd ckgdVar = (ckgd) obj;
            if (this.a.equals(ckgdVar.b()) && this.b.equals(ckgdVar.a()) && this.c.equals(ckgdVar.d()) && this.d.equals(ckgdVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        ckgb ckgbVar = this.b;
        return "RcsAvailabilityUpdate{availability=" + this.a.toString() + ", hint=" + ckgbVar.toString() + ", subId=" + optional2.toString() + ", rcsProvisioningId=" + optional.toString() + "}";
    }
}
