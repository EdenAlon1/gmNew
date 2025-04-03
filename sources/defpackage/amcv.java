package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amcv extends ameq {
    public final Optional a;
    public final epdh b;
    public final int c;
    public final int d;

    public amcv(Optional optional, epdh epdhVar, int i, int i2) {
        this.a = optional;
        this.b = epdhVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ameq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ameq
    public final epdh b() {
        return this.b;
    }

    @Override // defpackage.ameq
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.ameq
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ameq) {
            ameq ameqVar = (ameq) obj;
            if (this.a.equals(ameqVar.c()) && this.b.equals(ameqVar.b()) && this.c == ameqVar.a() && this.d == ameqVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.d;
        epdh epdhVar = this.b;
        return "MessagesBatchFailureContext{rawTelephonyStatus=" + String.valueOf(this.a) + ", reason=" + epdhVar.toString() + ", terminalStatus=" + this.c + ", canFallback=" + epdf.a(i) + "}";
    }
}
