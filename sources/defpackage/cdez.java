package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdez {
    public final List a;
    public final List b;

    public cdez(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdez)) {
            return false;
        }
        cdez cdezVar = (cdez) obj;
        return ffkj.e(this.a, cdezVar.a) && ffkj.e(this.b, cdezVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ItemsIgnoredInBatchBackup(messagesIgnored=" + this.a + ", conversationsIgnored=" + this.b + ")";
    }
}
