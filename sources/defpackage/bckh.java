package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckh {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bckh(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bckh)) {
            return false;
        }
        bckh bckhVar = (bckh) obj;
        return this.a == bckhVar.a && this.b == bckhVar.b && this.c == bckhVar.c;
    }

    public final int hashCode() {
        return (((bckg.a(this.a) * 31) + bckg.a(this.b)) * 31) + bckg.a(this.c);
    }

    public final String toString() {
        return "DatabaseRestoreConfig(enableBasicXmsMessageDeduplication=" + this.a + ", enableDuplicatePartMapping=" + this.b + ", throwDatabaseRestoreExceptions=" + this.c + ")";
    }
}
