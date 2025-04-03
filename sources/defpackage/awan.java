package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awan {
    public final awat a;
    public final awai b;
    public final ffss c;

    public awan(awat awatVar, awai awaiVar, ffss ffssVar) {
        awatVar.getClass();
        this.a = awatVar;
        this.b = awaiVar;
        this.c = ffssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awan)) {
            return false;
        }
        awan awanVar = (awan) obj;
        return ffkj.e(this.a, awanVar.a) && ffkj.e(this.b, awanVar.b) && ffkj.e(this.c, awanVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PipelineInfo(entryPoint=" + this.a + ", pipelineContext=" + this.b + ", pipelineExecution=" + this.c + ")";
    }
}
