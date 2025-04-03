package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amct extends amde {
    private final int a;
    private final Optional b;
    private final int c;
    private final Optional d;
    private final int e;

    public amct(int i, Optional optional, int i2, int i3, Optional optional2) {
        this.a = i;
        this.b = optional;
        this.e = i2;
        this.c = i3;
        this.d = optional2;
    }

    @Override // defpackage.amde
    public final int a() {
        return this.a;
    }

    @Override // defpackage.amde
    public final int b() {
        return this.c;
    }

    @Override // defpackage.amde
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.amde
    public final Optional d() {
        return this.b;
    }

    @Override // defpackage.amde
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amde) {
            amde amdeVar = (amde) obj;
            if (this.a == amdeVar.a() && this.b.equals(amdeVar.d()) && this.e == amdeVar.e() && this.c == amdeVar.b() && this.d.equals(amdeVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.e;
        eopg.c(i);
        return (((((hashCode * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        int i = this.e;
        return "LogContent{httpStatusCode=" + this.a + ", rcsDiagnostics=" + this.b.toString() + ", mmsApi=" + eopg.b(i) + ", lastConnectionFailureCauseCode=" + this.c + ", formatType=" + optional.toString() + "}";
    }
}
