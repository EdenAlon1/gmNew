package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqke extends dqkb {
    public final String a;
    private final dqgm b;
    private final Instant c;

    public dqke(dqgm dqgmVar, Instant instant, String str) {
        this.b = dqgmVar;
        this.c = instant;
        this.a = str;
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
        if (!(obj instanceof dqke)) {
            return false;
        }
        dqke dqkeVar = (dqke) obj;
        return ffkj.e(this.b, dqkeVar.b) && ffkj.e(this.c, dqkeVar.c) && ffkj.e(this.a, dqkeVar.a);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        String str = this.a;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UsageMetadata(context=" + this.b + ", time=" + this.c + ", searchTerm=" + this.a + ")";
    }
}
