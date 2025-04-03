package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikq implements aihs {
    public final String a;
    public final boolean b;

    public aikq() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aikq)) {
            return false;
        }
        aikq aikqVar = (aikq) obj;
        return ffkj.e(this.a, aikqVar.a) && this.b == aikqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ExitRenameGroup(newName=" + this.a + ", groupRenamed=" + this.b + ")";
    }

    public aikq(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public /* synthetic */ aikq(int i) {
        this(1 != (i & 1) ? null : "", false);
    }
}
