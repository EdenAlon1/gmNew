package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmy {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zmy(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmy)) {
            return false;
        }
        zmy zmyVar = (zmy) obj;
        return this.a == zmyVar.a && this.b == zmyVar.b && this.c == zmyVar.c && this.d == zmyVar.d;
    }

    public final int hashCode() {
        int a = zmx.a(this.a);
        boolean z = this.d;
        return (((((a * 31) + zmx.a(this.b)) * 31) + zmx.a(this.c)) * 31) + zmx.a(z);
    }

    public final String toString() {
        return "Flags(includeRbmHeaderIfAvailable=" + this.a + ", enableSwipeToShowTimestamps=" + this.b + ", disableNewTimestampsForTalkback=" + this.c + ", enableSwipeToShowTimestampsHoldFix=" + this.d + ")";
    }

    public zmy() {
        this(false, false, false, false);
    }
}
