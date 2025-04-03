package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjc {
    public final xhf a;
    public final List b;
    public final apcs c;

    public yjc(apcs apcsVar, xhf xhfVar, List list) {
        apcsVar.getClass();
        this.c = apcsVar;
        this.a = xhfVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjc)) {
            return false;
        }
        yjc yjcVar = (yjc) obj;
        return ffkj.e(this.c, yjcVar.c) && ffkj.e(this.a, yjcVar.a) && ffkj.e(this.b, yjcVar.b);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        List list = this.b;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LoggingEnvelope(analyticsId=" + this.c + ", annotateDraft=" + this.a + ", attachmentAnalyticsIds=" + this.b + ")";
    }
}
