package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrp {
    public final ffix a;
    public final ffix b;
    public final ffix c;

    public dmrp(ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        this.a = ffixVar;
        this.b = ffixVar2;
        this.c = ffixVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrp)) {
            return false;
        }
        dmrp dmrpVar = (dmrp) obj;
        return ffkj.e(this.a, dmrpVar.a) && ffkj.e(this.b, dmrpVar.b) && ffkj.e(this.c, dmrpVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SwipeUpToLockRecordingUiData(onPrepare=" + this.a + ", onDispose=" + this.b + ", onSwipeToLockRecording=" + this.c + ")";
    }
}
