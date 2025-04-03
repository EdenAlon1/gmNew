package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dptx {
    private final boolean a;
    private final boolean b;

    public dptx(boolean z) {
        this.a = false;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dptx)) {
            return false;
        }
        dptx dptxVar = (dptx) obj;
        boolean z = dptxVar.a;
        return this.b == dptxVar.b;
    }

    public final int hashCode() {
        return (dptw.a(false) * 31) + dptw.a(this.b);
    }

    public final String toString() {
        return "FullScreenCameraContentConfiguration(enableScreenFlash=false, useTopAppBarComponent=" + this.b + ")";
    }

    public dptx() {
        this(false);
    }
}
