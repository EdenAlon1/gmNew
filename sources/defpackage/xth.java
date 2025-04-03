package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xth {
    public final xye a;
    public final List b;

    public xth(xye xyeVar, List list) {
        this.a = xyeVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xth)) {
            return false;
        }
        xth xthVar = (xth) obj;
        return this.a == xthVar.a && ffkj.e(this.b, xthVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AddAttachmentResult(validation=" + this.a + ", updatedList=" + this.b + ")";
    }
}
