package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacg extends batb {
    private final Optional a;
    private final String b = "";
    private final String c = "";
    private final String d = "";
    private final String e = "";

    public bacg(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.batb
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.batb
    public final String b() {
        return this.c;
    }

    @Override // defpackage.batb
    public final String c() {
        return this.d;
    }

    @Override // defpackage.batb
    public final String d() {
        return this.e;
    }

    @Override // defpackage.batb
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof batb) {
            batb batbVar = (batb) obj;
            batbVar.i();
            if (this.a.equals(batbVar.a()) && this.b.equals(batbVar.e())) {
                batbVar.f();
                batbVar.g();
                if (this.c.equals(batbVar.b()) && this.d.equals(batbVar.c())) {
                    batbVar.h();
                    if (this.e.equals(batbVar.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((~((~((((this.a.hashCode() ^ 385623362) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((int) (-4294967296L))) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "VerifiedSmsEligibilityResult{eligible=false, senderMessagingIdentity=" + this.a.toString() + ", messageBody=" + this.b + ", mcc=-1, mnc=-1, existingBrandId=" + this.c + ", existingBrandVersionToken=" + this.d + ", startTimeMs=-1, imsi=" + this.e + "}";
    }

    @Override // defpackage.batb
    public final void f() {
    }

    @Override // defpackage.batb
    public final void g() {
    }

    @Override // defpackage.batb
    public final void h() {
    }

    @Override // defpackage.batb
    public final void i() {
    }
}
