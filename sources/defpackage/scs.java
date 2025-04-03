package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scs extends scz {
    public final sak a;
    public final saq b;
    public final emdl c;

    public scs(sak sakVar, emdl emdlVar, saq saqVar) {
        this.a = sakVar;
        this.c = emdlVar;
        this.b = saqVar;
    }

    @Override // defpackage.scz
    public final sak a() {
        return this.a;
    }

    @Override // defpackage.scz
    public final saq b() {
        return this.b;
    }

    @Override // defpackage.scz
    public final emdl c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof scz) {
            scz sczVar = (scz) obj;
            if (this.a.equals(sczVar.a()) && this.c.equals(sczVar.c()) && this.b.equals(sczVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        saq saqVar = this.b;
        emdl emdlVar = this.c;
        return "MagicRewriteServiceOptions{aiCoreClient=" + this.a.toString() + ", downloadCallback=" + emdlVar.toString() + ", feature=" + saqVar.toString() + "}";
    }
}
