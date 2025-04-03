package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjob extends cjod {
    public final cjoe a;
    public final int b;
    public final int c;

    public cjob(cjoe cjoeVar, int i, int i2) {
        this.a = cjoeVar;
        this.c = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjob)) {
            return false;
        }
        cjob cjobVar = (cjob) obj;
        return ffkj.e(this.a, cjobVar.a) && this.c == cjobVar.c && this.b == cjobVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b;
    }

    public final String toString() {
        return "PipelineResult(sendingMessageData=" + this.a + ", result=" + ((Object) cjkn.a(this.c)) + ", sendStatus=" + this.b + ")";
    }
}
