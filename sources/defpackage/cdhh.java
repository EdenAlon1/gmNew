package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdhh {
    public final boolean a;
    public final List b;

    public cdhh(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdhh)) {
            return false;
        }
        cdhh cdhhVar = (cdhh) obj;
        return this.a == cdhhVar.a && ffkj.e(this.b, cdhhVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MediaRetryResult(itemIsDone=" + this.a + ", newWorkItems=" + this.b + ")";
    }
}
