package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkv extends djkx {
    public final Optional a;
    public final String b;
    public final eyss c;
    public final eejk d;
    public final int e;
    public final String f;
    public final Optional g;
    public final enip h;

    public djkv(Optional optional, String str, eyss eyssVar, eejk eejkVar, int i, String str2, Optional optional2, enip enipVar) {
        this.a = optional;
        this.b = str;
        this.c = eyssVar;
        this.d = eejkVar;
        this.e = i;
        this.f = str2;
        this.g = optional2;
        this.h = enipVar;
    }

    @Override // defpackage.djkx
    public final int a() {
        return this.e;
    }

    @Override // defpackage.djkx
    public final eejk b() {
        return this.d;
    }

    @Override // defpackage.djkx
    public final enip c() {
        return this.h;
    }

    @Override // defpackage.djkx
    public final eyss d() {
        return this.c;
    }

    @Override // defpackage.djkx
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djkx) {
            djkx djkxVar = (djkx) obj;
            if (this.a.equals(djkxVar.f()) && this.b.equals(djkxVar.h()) && this.c.equals(djkxVar.d()) && this.d.equals(djkxVar.b()) && this.e == djkxVar.a() && this.f.equals(djkxVar.g()) && this.g.equals(djkxVar.e()) && this.h.equals(djkxVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.djkx
    public final Optional f() {
        return this.a;
    }

    @Override // defpackage.djkx
    public final String g() {
        return this.f;
    }

    @Override // defpackage.djkx
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        enip enipVar = this.h;
        Optional optional = this.g;
        eejk eejkVar = this.d;
        eyss eyssVar = this.c;
        return "RegistrationContext{publicGruu=" + String.valueOf(this.a) + ", username=" + this.b + ", localIpAddress=" + eyssVar.toString() + ", proxyProtocol=" + eejkVar.toString() + ", listeningPort=" + this.e + ", instance=" + this.f + ", accessNetworkInfoHeader=" + String.valueOf(optional) + ", registeredFeatureTags=" + enipVar.toString() + "}";
    }
}
