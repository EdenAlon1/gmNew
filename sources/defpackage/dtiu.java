package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtiu {
    public final fgdj a;
    public final ffix b;

    public dtiu(fgdj fgdjVar, ffix ffixVar) {
        this.a = fgdjVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtiu)) {
            return false;
        }
        dtiu dtiuVar = (dtiu) obj;
        return ffkj.e(this.a, dtiuVar.a) && ffkj.e(this.b, dtiuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "NoiseCancellationUiData(noiseCancellationEnabledFlow=" + this.a + ", onNoiseCancellationClick=" + this.b + ")";
    }
}
