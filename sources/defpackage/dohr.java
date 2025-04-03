package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohr {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ffix e;

    public dohr(boolean z, String str, String str2, boolean z2, ffix ffixVar) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = ffixVar;
    }

    public static /* synthetic */ dohr a(dohr dohrVar, boolean z, String str, String str2, ffix ffixVar, int i) {
        if ((i & 1) != 0) {
            z = dohrVar.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = dohrVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dohrVar.c;
        }
        String str4 = str2;
        boolean z3 = (i & 8) != 0 ? dohrVar.d : false;
        if ((i & 16) != 0) {
            ffixVar = dohrVar.e;
        }
        ffix ffixVar2 = ffixVar;
        ffixVar2.getClass();
        return new dohr(z2, str3, str4, z3, ffixVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dohr)) {
            return false;
        }
        dohr dohrVar = (dohr) obj;
        return this.a == dohrVar.a && ffkj.e(this.b, dohrVar.b) && ffkj.e(this.c, dohrVar.c) && this.d == dohrVar.d && ffkj.e(this.e, dohrVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        boolean z = this.a;
        String str2 = this.c;
        return (((((((dohq.a(z) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + dohq.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ScrollToBottomUiData(isVisible=" + this.a + ", contentDescription=" + this.b + ", text=" + this.c + ", useSurfaceContainer=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ dohr(String str, String str2, boolean z, ffix ffixVar, int i) {
        this(false, str, (i & 4) != 0 ? null : str2, ((i & 8) == 0) & z, ffixVar);
    }
}
