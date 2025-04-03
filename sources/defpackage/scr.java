package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scr extends scw {
    private final engw a;
    private final rwh b;

    public scr(engw engwVar, rwh rwhVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null results");
        }
        this.a = engwVar;
        this.b = rwhVar;
    }

    @Override // defpackage.scw
    public final rwh a() {
        return this.b;
    }

    @Override // defpackage.scw
    public final engw b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        rwh rwhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof scw) {
            scw scwVar = (scw) obj;
            if (enkr.h(this.a, scwVar.b()) && ((rwhVar = this.b) != null ? rwhVar.equals(scwVar.a()) : scwVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        rwh rwhVar = this.b;
        return (hashCode * 1000003) ^ (rwhVar == null ? 0 : rwhVar.hashCode());
    }

    public final String toString() {
        rwh rwhVar = this.b;
        return "MagicRewriteResult{results=" + this.a.toString() + ", inferenceEventTraceResult=" + String.valueOf(rwhVar) + "}";
    }
}
