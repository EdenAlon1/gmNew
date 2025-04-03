package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djus extends djux {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Optional h;

    public djus(String str, String str2, String str3, String str4, String str5, String str6, String str7, Optional optional) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = optional;
    }

    @Override // defpackage.djux
    public final Optional a() {
        return this.h;
    }

    @Override // defpackage.djux
    public final String b() {
        return this.e;
    }

    @Override // defpackage.djux
    public final String c() {
        return this.d;
    }

    @Override // defpackage.djux
    public final String d() {
        return this.g;
    }

    @Override // defpackage.djux
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djux) {
            djux djuxVar = (djux) obj;
            if (this.a.equals(djuxVar.e()) && this.b.equals(djuxVar.f()) && this.c.equals(djuxVar.g()) && this.d.equals(djuxVar.c()) && this.e.equals(djuxVar.b()) && this.f.equals(djuxVar.h()) && this.g.equals(djuxVar.d()) && this.h.equals(djuxVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.djux
    public final String f() {
        return this.b;
    }

    @Override // defpackage.djux
    public final String g() {
        return this.c;
    }

    @Override // defpackage.djux
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "DroidGuardContentBinding{imsi=" + this.a + ", msisdn=" + this.b + ", msisdnToken=" + this.c + ", gmsCoreIidToken=" + this.d + ", cookie=" + this.e + ", salt=" + this.f + ", imei=" + this.g + ", provisioningSessionId=" + String.valueOf(this.h) + "}";
    }
}
