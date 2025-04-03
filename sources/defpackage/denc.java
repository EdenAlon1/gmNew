package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class denc {
    public final String a;
    public final dxq b;
    public final dltp c;
    public final boolean d;

    public denc(String str, dxq dxqVar, dltp dltpVar, boolean z) {
        this.a = str;
        this.b = dxqVar;
        this.c = dltpVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof denc)) {
            return false;
        }
        denc dencVar = (denc) obj;
        return ffkj.e(this.a, dencVar.a) && ffkj.e(this.b, dencVar.b) && ffkj.e(this.c, dencVar.c) && this.d == dencVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dltp dltpVar = this.c;
        return (((hashCode * 31) + (dltpVar == null ? 0 : dltpVar.hashCode())) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "NoticeAnnotation(text=" + this.a + ", arrangement=" + this.b + ", urlAnnotation=" + this.c + ", useLargeFontSize=" + this.d + ")";
    }

    public /* synthetic */ denc(String str, dxq dxqVar, dltp dltpVar, int i) {
        this(str, dxqVar, (i & 4) != 0 ? null : dltpVar, false);
    }
}
