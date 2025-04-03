package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckm {
    public final dtry a;
    public final dtry b;
    public final bckn c;
    public final boolean d;

    public bckm(dtry dtryVar, dtry dtryVar2, bckn bcknVar, boolean z) {
        bcknVar.getClass();
        this.a = dtryVar;
        this.b = dtryVar2;
        this.c = bcknVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bckm)) {
            return false;
        }
        bckm bckmVar = (bckm) obj;
        return ffkj.e(this.a, bckmVar.a) && ffkj.e(this.b, bckmVar.b) && ffkj.e(this.c, bckmVar.c) && this.d == bckmVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ForeignKeySpec(backupFkColumn=" + this.a + ", bugleFkColumn=" + this.b + ", referencedTable=" + this.c + ", nullable=" + this.d + ")";
    }

    public /* synthetic */ bckm(dtry dtryVar, dtry dtryVar2, bckn bcknVar) {
        this(dtryVar, dtryVar2, bcknVar, false);
    }
}
