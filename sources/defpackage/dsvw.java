package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvw {
    public final drnl a;
    public final ffix b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final ffix f;
    private final boolean g;

    public /* synthetic */ dsvw(drnl drnlVar, ffix ffixVar, String str, boolean z, boolean z2, int i) {
        this.a = drnlVar;
        this.b = (i & 2) != 0 ? null : ffixVar;
        this.c = (i & 4) != 0 ? null : str;
        this.d = ((i & 8) == 0) & z;
        this.f = null;
        this.e = ((i & 32) == 0) & z2;
        this.g = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsvw)) {
            return false;
        }
        dsvw dsvwVar = (dsvw) obj;
        if (!ffkj.e(this.a, dsvwVar.a) || !ffkj.e(this.b, dsvwVar.b) || !ffkj.e(this.c, dsvwVar.c) || this.d != dsvwVar.d) {
            return false;
        }
        ffix ffixVar = dsvwVar.f;
        if (!ffkj.e(null, null) || this.e != dsvwVar.e) {
            return false;
        }
        boolean z = dsvwVar.g;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffix ffixVar = this.b;
        int hashCode2 = (hashCode + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31;
        String str = this.c;
        return ((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + dsvv.a(this.d)) * 961) + dsvv.a(this.e)) * 31) + dsvv.a(false);
    }

    public final String toString() {
        return "LocalVideoRendererUiAdapterArgs(attachment=" + this.a + ", onDeleteButtonClick=" + this.b + ", contentDescription=" + this.c + ", canToggleFocusMode=" + this.d + ", onTuneButtonClick=null, useSeekBarControls=" + this.e + ", hideSeekBarWhenPaused=false)";
    }
}
