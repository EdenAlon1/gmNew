package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqm implements ajqq {
    public final Long a;
    public final emyg b;

    public ajqm(Long l, emyg emygVar) {
        this.a = l;
        this.b = emygVar;
    }

    @Override // defpackage.ajqq
    public final emyg a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajqm)) {
            return false;
        }
        ajqm ajqmVar = (ajqm) obj;
        return ffkj.e(this.a, ajqmVar.a) && ffkj.e(this.b, ajqmVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return ((l == null ? 0 : l.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OpenedDraftToken(usageStatsLoggingId=" + this.a + ", stopwatch=" + this.b + ")";
    }
}
