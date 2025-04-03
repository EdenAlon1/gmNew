package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgdi implements fgcz {
    public final long b;
    private final long c = Long.MAX_VALUE;

    public fgdi(long j) {
        this.b = j;
    }

    @Override // defpackage.fgcz
    public final ffxx a(fgdj fgdjVar) {
        fgdg fgdgVar = new fgdg(this, null);
        int i = fgau.a;
        return ffyy.a(new ffzu(new fgen(fgdgVar, fgdjVar), new fgdh(null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fgdi)) {
            return false;
        }
        fgdi fgdiVar = (fgdi) obj;
        if (this.b != fgdiVar.b) {
            return false;
        }
        long j = fgdiVar.c;
        return true;
    }

    public final int hashCode() {
        return (fgdf.a(this.b) * 31) + fgdf.a(Long.MAX_VALUE);
    }

    public final String toString() {
        fffs fffsVar = new fffs(2);
        long j = this.b;
        if (j > 0) {
            fffsVar.add(a.y(j, "stopTimeout=", "ms"));
        }
        return "SharingStarted.WhileSubscribed(" + ffdx.aA(ffdx.a(fffsVar), null, null, null, null, 63) + ")";
    }
}
