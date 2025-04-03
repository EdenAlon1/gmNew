package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axni {
    public final ffhd a;
    private final ffhd b;

    public axni() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axni)) {
            return false;
        }
        axni axniVar = (axni) obj;
        return ffkj.e(this.a, axniVar.a) && ffkj.e(this.b, axniVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CompositionLocalTikTokCoroutineContext(lightweight=" + this.a + ", background=" + this.b + ")";
    }

    public axni(ffhd ffhdVar, ffhd ffhdVar2) {
        this.a = ffhdVar;
        this.b = ffhdVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ axni(byte[] r1) {
        /*
            r0 = this;
            ffhe r1 = defpackage.ffhe.a
            r0.<init>(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axni.<init>(byte[]):void");
    }
}
