package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azla extends azop {
    private final enip a;
    private final Optional b;
    private final azon c;
    private final Optional d;
    private final azsu e;
    private final Optional f;
    private final String g;
    private final Optional h;
    private final boolean i;

    public azla(enip enipVar, Optional optional, azon azonVar, Optional optional2, azsu azsuVar, Optional optional3, String str, Optional optional4, boolean z) {
        this.a = enipVar;
        this.b = optional;
        this.c = azonVar;
        this.d = optional2;
        this.e = azsuVar;
        this.f = optional3;
        this.g = str;
        this.h = optional4;
        this.i = z;
    }

    @Override // defpackage.azop
    public final azon a() {
        return this.c;
    }

    @Override // defpackage.azop
    public final azsu b() {
        return this.e;
    }

    @Override // defpackage.azop
    public final enip c() {
        return this.a;
    }

    @Override // defpackage.azop
    public final Optional d() {
        return this.b;
    }

    @Override // defpackage.azop
    public final Optional e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azop) {
            azop azopVar = (azop) obj;
            if (this.a.equals(azopVar.c()) && this.b.equals(azopVar.d()) && this.c.equals(azopVar.a()) && this.d.equals(azopVar.f()) && this.e.equals(azopVar.b()) && this.f.equals(azopVar.e()) && this.g.equals(azopVar.h()) && this.h.equals(azopVar.g()) && this.i == azopVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azop
    @Deprecated
    public final Optional f() {
        return this.d;
    }

    @Override // defpackage.azop
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.azop
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231);
    }

    @Override // defpackage.azop
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        Optional optional = this.h;
        Optional optional2 = this.f;
        azsu azsuVar = this.e;
        Optional optional3 = this.d;
        azon azonVar = this.c;
        Optional optional4 = this.b;
        return "MyIdentity{allSubs=" + String.valueOf(this.a) + ", address=" + String.valueOf(optional4) + ", addressType=" + azonVar.toString() + ", messagingIdentity=" + String.valueOf(optional3) + ", token=" + azsuVar.toString() + ", canonicalToken=" + String.valueOf(optional2) + ", displayName=" + this.g + ", provisioningId=" + String.valueOf(optional) + ", isVerified=" + this.i + "}";
    }
}
