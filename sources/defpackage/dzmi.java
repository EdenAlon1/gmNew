package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmi extends dzjq {
    public final engw a;
    public final Long b;
    public final Long c;
    private final dzjp d;

    public dzmi(engw engwVar, Long l, Long l2, dzjp dzjpVar) {
        this.a = engwVar;
        this.b = l;
        this.c = l2;
        this.d = dzjpVar;
    }

    @Override // defpackage.dzjq
    public final dzjp b() {
        return this.d;
    }

    @Override // defpackage.dzjq
    public final engw c() {
        return this.a;
    }

    @Override // defpackage.dzjq
    public final Long d() {
        return this.b;
    }

    @Override // defpackage.dzjq
    public final Long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzjq) {
            dzjq dzjqVar = (dzjq) obj;
            if (enkr.h(this.a, dzjqVar.c()) && this.b.equals(dzjqVar.d()) && this.c.equals(dzjqVar.e()) && this.d.equals(dzjqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dzjp dzjpVar = this.d;
        return "AuthToken{tachyonToken=" + String.valueOf(this.a) + ", expireAt=" + this.b + ", refreshedAt=" + this.c + ", oneOfId=" + String.valueOf(dzjpVar) + "}";
    }
}
