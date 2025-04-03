package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpak implements dpae {
    public static final dpak a = new dpak();
    private final /* synthetic */ dpai b;

    private dpak() {
        enpx enpxVar = new enpx(dpab.c);
        this.b = new dpai(enpxVar, enpxVar);
    }

    @Override // defpackage.dpae
    public final String[] a(dpad dpadVar) {
        dpadVar.getClass();
        return this.b.a(dpadVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpak)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 125327243;
    }

    public final String toString() {
        return "SizeBytesStrategy";
    }
}
