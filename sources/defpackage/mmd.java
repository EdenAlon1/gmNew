package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmd {
    public static final mmd a = new mmc().a();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public mmd(mmc mmcVar) {
        this.b = mmcVar.a;
        this.c = mmcVar.b;
        this.d = mmcVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mmd mmdVar = (mmd) obj;
            if (this.b == mmdVar.b && this.c == mmdVar.c && this.d == mmdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.b;
        boolean z2 = this.c;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.d ? 1 : 0);
    }
}
