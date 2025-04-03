package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrc {
    public final Optional a;
    public final Optional b;
    public final esqd c;

    /* JADX WARN: Multi-variable type inference failed */
    public esrc() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean a() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esrc)) {
            return false;
        }
        esrc esrcVar = (esrc) obj;
        return ffkj.e(this.a, esrcVar.a) && ffkj.e(this.b, esrcVar.b) && ffkj.e(this.c, esrcVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        esqd esqdVar = this.c;
        return (hashCode * 31) + (esqdVar == null ? 0 : esqdVar.hashCode());
    }

    public final String toString() {
        return "GroupPropertiesUpdate(name=" + this.a + ", icon=" + this.b + ", traceId=" + this.c + ")";
    }

    public /* synthetic */ esrc(Optional optional, Optional optional2, esqd esqdVar, int i) {
        optional = (i & 1) != 0 ? Optional.empty() : optional;
        optional2 = (i & 2) != 0 ? Optional.empty() : optional2;
        esqdVar = (i & 4) != 0 ? null : esqdVar;
        optional.getClass();
        optional2.getClass();
        this.a = optional;
        this.b = optional2;
        this.c = esqdVar;
    }
}
