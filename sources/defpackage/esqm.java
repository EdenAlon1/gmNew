package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqm {
    public final esqu a;
    public final esrb b;
    public final enip c;
    public final esqd d;

    public esqm(esqu esquVar, esrb esrbVar, enip enipVar, esqd esqdVar) {
        enipVar.getClass();
        this.a = esquVar;
        this.b = esrbVar;
        this.c = enipVar;
        this.d = esqdVar;
        if (esrd.a == esrbVar.b) {
            throw new IllegalStateException("Must specify a valid GroupType.");
        }
        if (enipVar.isEmpty()) {
            throw new IllegalStateException("Must specify at least 1 group member.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esqm)) {
            return false;
        }
        esqm esqmVar = (esqm) obj;
        return ffkj.e(this.a, esqmVar.a) && ffkj.e(this.b, esqmVar.b) && ffkj.e(this.c, esqmVar.c) && ffkj.e(this.d, esqmVar.d);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        esqd esqdVar = this.d;
        return (hashCode * 31) + (esqdVar == null ? 0 : esqdVar.hashCode());
    }

    public final String toString() {
        return "CreateGroupRequest(id=" + this.a + ", properties=" + this.b + ", members=" + this.c + ", traceId=" + this.d + ")";
    }
}
