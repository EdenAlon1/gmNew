package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjj extends djjs {
    private final Optional a;
    private final Optional b;
    private final boolean c;

    public djjj(Optional optional, Optional optional2, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = z;
    }

    @Override // defpackage.djjs
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.djjs
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.djjs
    @Deprecated
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djjs) {
            djjs djjsVar = (djjs) obj;
            if (this.a.equals(djjsVar.a()) && this.b.equals(djjsVar.b()) && this.c == djjsVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        Optional optional = this.b;
        return "ImsNetworkInfo{ipAddress=" + this.a.toString() + ", network=" + optional.toString() + ", registered=" + this.c + "}";
    }
}
