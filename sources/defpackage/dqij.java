package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqij extends dqkb {
    public final Object a;
    public final dqgm b;
    public final Instant c;
    public final String d;

    public dqij(Object obj, dqgm dqgmVar, Instant instant, String str) {
        dqgmVar.getClass();
        instant.getClass();
        this.a = obj;
        this.b = dqgmVar;
        this.c = instant;
        this.d = str;
    }

    @Override // defpackage.dqkb
    public final dqgm a() {
        return this.b;
    }

    @Override // defpackage.dqkb
    public final Instant b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqij)) {
            return false;
        }
        dqij dqijVar = (dqij) obj;
        return ffkj.e(this.a, dqijVar.a) && ffkj.e(this.b, dqijVar.b) && ffkj.e(this.c, dqijVar.c) && ffkj.e(this.d, dqijVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "EntityUsage(entity=" + this.a + ", context=" + this.b + ", time=" + this.c + ", searchTerm=" + this.d + ")";
    }
}
