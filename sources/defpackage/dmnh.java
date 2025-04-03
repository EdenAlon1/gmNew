package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmnh {
    public final dmne a;
    public final dmsk b;
    public final dmkg c;
    public final dmrd d;
    public final dmqf e;
    public final boolean f;
    public final ffji g;
    public final dmng h;
    public final ffji i;

    public /* synthetic */ dmnh(dmne dmneVar, dmsk dmskVar, dmkg dmkgVar, dmrd dmrdVar, boolean z, ffji ffjiVar, dmng dmngVar, ffji ffjiVar2, int i) {
        dmqf dmqfVar = (i & 16) != 0 ? new dmqf(null) : null;
        boolean z2 = z & ((i & 32) == 0);
        ffjiVar = (i & 64) != 0 ? null : ffjiVar;
        dmngVar = (i & 128) != 0 ? new dmng(null) : dmngVar;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        dmrdVar = i2 != 0 ? null : dmrdVar;
        dmkgVar = i3 != 0 ? null : dmkgVar;
        dmskVar = i4 != 0 ? null : dmskVar;
        dmneVar = 1 == i5 ? null : dmneVar;
        dmngVar.getClass();
        this.a = dmneVar;
        this.b = dmskVar;
        this.c = dmkgVar;
        this.d = dmrdVar;
        this.e = dmqfVar;
        this.f = z2;
        this.g = ffjiVar;
        this.h = dmngVar;
        this.i = ffjiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmnh)) {
            return false;
        }
        dmnh dmnhVar = (dmnh) obj;
        return ffkj.e(this.a, dmnhVar.a) && ffkj.e(this.b, dmnhVar.b) && ffkj.e(this.c, dmnhVar.c) && ffkj.e(this.d, dmnhVar.d) && ffkj.e(this.e, dmnhVar.e) && this.f == dmnhVar.f && ffkj.e(this.g, dmnhVar.g) && ffkj.e(this.h, dmnhVar.h) && ffkj.e(this.i, dmnhVar.i);
    }

    public final int hashCode() {
        dmne dmneVar = this.a;
        int hashCode = dmneVar == null ? 0 : dmneVar.hashCode();
        dmsk dmskVar = this.b;
        int hashCode2 = ((hashCode * 31) + (dmskVar == null ? 0 : dmskVar.hashCode())) * 31;
        dmkg dmkgVar = this.c;
        int hashCode3 = (((((((hashCode2 + (dmkgVar == null ? 0 : dmkgVar.hashCode())) * 31) + (this.d == null ? 0 : 1231)) * 31) + (this.e == null ? 0 : 1231)) * 31) + (true != this.f ? 1237 : 1231)) * 31;
        ffji ffjiVar = this.g;
        return ((((hashCode3 + (ffjiVar != null ? ffjiVar.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "ComposeRowInputsUiData(currentInput=" + this.a + ", voiceInputUiData=" + this.b + ", cameraGalleryInputUiData=" + this.c + ", shortcutsInputUiData=" + this.d + ", emotiveInputUiData=" + this.e + ", isAiConversation=" + this.f + ", onDisabledClick=" + this.g + ", flags=" + this.h + ", onClick=" + this.i + ")";
    }
}
