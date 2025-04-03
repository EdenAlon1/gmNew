package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuk {
    public final drni a;
    public final ffix b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ dsuk(drni drniVar, ffix ffixVar, String str, boolean z, boolean z2, int i) {
        this.a = drniVar;
        this.b = (i & 2) != 0 ? null : ffixVar;
        this.c = (i & 4) != 0 ? null : str;
        this.d = ((i & 8) == 0) & z;
        this.e = ((i & 16) == 0) & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsuk)) {
            return false;
        }
        dsuk dsukVar = (dsuk) obj;
        return ffkj.e(this.a, dsukVar.a) && ffkj.e(this.b, dsukVar.b) && ffkj.e(this.c, dsukVar.c) && this.d == dsukVar.d && this.e == dsukVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffix ffixVar = this.b;
        int hashCode2 = (hashCode + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31;
        String str = this.c;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + dsuj.a(this.d)) * 31) + dsuj.a(this.e);
    }

    public final String toString() {
        return "LocalImageRendererUiAdapterArgs(attachment=" + this.a + ", onDeleteButtonClick=" + this.b + ", contentDescription=" + this.c + ", canToggleFocusMode=" + this.d + ", canZoom=" + this.e + ")";
    }
}
