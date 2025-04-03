package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvhv extends dviw {
    public final enip a;
    public final enip b;
    public final enip c;
    public final enip d;

    public dvhv(enip enipVar, enip enipVar2, enip enipVar3, enip enipVar4) {
        this.a = enipVar;
        this.b = enipVar2;
        this.c = enipVar3;
        this.d = enipVar4;
    }

    @Override // defpackage.dviw
    public final enip a() {
        return this.c;
    }

    @Override // defpackage.dviw
    public final enip b() {
        return this.a;
    }

    @Override // defpackage.dviw
    public final enip c() {
        return this.d;
    }

    @Override // defpackage.dviw
    public final enip d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dviw) {
            dviw dviwVar = (dviw) obj;
            if (this.a.equals(dviwVar.b()) && this.b.equals(dviwVar.d()) && this.c.equals(dviwVar.a()) && this.d.equals(dviwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        enip enipVar = this.d;
        enip enipVar2 = this.c;
        enip enipVar3 = this.b;
        return "TargetingData{clearcutEvents=" + String.valueOf(this.a) + ", veEvents=" + String.valueOf(enipVar3) + ", appStateIds=" + String.valueOf(enipVar2) + ", requestedPermissions=" + String.valueOf(enipVar) + "}";
    }
}
