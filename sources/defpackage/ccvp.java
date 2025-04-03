package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvp implements ccvm {
    public final String a;

    public ccvp(String str) {
        this.a = str;
    }

    @Override // defpackage.ccvm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccvp) && ffkj.e(this.a, ((ccvp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateResult(cmsId=" + this.a + ")";
    }
}
