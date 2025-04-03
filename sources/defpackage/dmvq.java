package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvq implements dmvt {
    public final String a;
    public final String b;
    public final List c;
    public final doas d;
    public final doas e;
    public final ffix f;
    public final dmvp g;

    public dmvq(dmvp dmvpVar, String str, String str2, List list, doas doasVar, doas doasVar2, ffix ffixVar) {
        str2.getClass();
        this.g = dmvpVar;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = doasVar;
        this.e = doasVar2;
        this.f = ffixVar;
    }

    @Override // defpackage.dmvt
    public final /* synthetic */ dmvt a(boolean z, ffix ffixVar) {
        return dmvb.a(this, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvq)) {
            return false;
        }
        dmvq dmvqVar = (dmvq) obj;
        return ffkj.e(this.g, dmvqVar.g) && ffkj.e(this.a, dmvqVar.a) && ffkj.e(this.b, dmvqVar.b) && ffkj.e(this.c, dmvqVar.c) && ffkj.e(this.d, dmvqVar.d) && ffkj.e(this.e, dmvqVar.e) && ffkj.e(this.f, dmvqVar.f);
    }

    public final int hashCode() {
        int hashCode = (((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        doas doasVar = this.e;
        return (((hashCode * 31) + (doasVar == null ? 0 : doasVar.hashCode())) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Verification(icon=" + this.g + ", title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", confirmButton=" + this.d + ", dismissButton=" + this.e + ", onDismissRequest=" + this.f + ")";
    }
}
