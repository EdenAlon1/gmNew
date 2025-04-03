package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsk {
    public final dlzq a;
    public final boolean b;
    public final dmrp c;
    public final ffji d;
    public final ffix e;
    public final ffji f;
    public final ffji g;
    public final dmsj h;

    public dmsk(dlzq dlzqVar, boolean z, dmrp dmrpVar, ffji ffjiVar, ffix ffixVar, ffji ffjiVar2, ffji ffjiVar3, dmsj dmsjVar) {
        dlzqVar.getClass();
        this.a = dlzqVar;
        this.b = z;
        this.c = dmrpVar;
        this.d = ffjiVar;
        this.e = ffixVar;
        this.f = ffjiVar2;
        this.g = ffjiVar3;
        this.h = dmsjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmsk)) {
            return false;
        }
        dmsk dmskVar = (dmsk) obj;
        return ffkj.e(this.a, dmskVar.a) && this.b == dmskVar.b && ffkj.e(this.c, dmskVar.c) && ffkj.e(this.d, dmskVar.d) && ffkj.e(this.e, dmskVar.e) && ffkj.e(this.f, dmskVar.f) && ffkj.e(this.g, dmskVar.g) && ffkj.e(this.h, dmskVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmrp dmrpVar = this.c;
        int hashCode2 = (((((((((hashCode + (true != this.b ? 1237 : 1231)) * 31) + (dmrpVar == null ? 0 : dmrpVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        ffji ffjiVar = this.g;
        int hashCode3 = (hashCode2 + (ffjiVar == null ? 0 : ffjiVar.hashCode())) * 31;
        dmsj dmsjVar = this.h;
        return hashCode3 + (dmsjVar != null ? dmsjVar.hashCode() : 0);
    }

    public final String toString() {
        return "VoiceInputUiData(timerUiData=" + this.a + ", isEnabled=" + this.b + ", swipeUpToLockUiData=" + this.c + ", onLongPress=" + this.d + ", onPressReleased=" + this.e + ", onSwipeToCancelRecording=" + this.f + ", onSwipeUp=" + this.g + ", errorUiData=" + this.h + ")";
    }
}
