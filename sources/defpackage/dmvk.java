package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvk implements dmvt {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d = true;
    public final doas e;
    public final doas f;
    public final ffix g;

    public dmvk(String str, String str2, List list, doas doasVar, doas doasVar2, ffix ffixVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.e = doasVar;
        this.f = doasVar2;
        this.g = ffixVar;
    }

    @Override // defpackage.dmvt
    public final /* synthetic */ dmvt a(boolean z, ffix ffixVar) {
        return dmvb.a(this, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvk)) {
            return false;
        }
        dmvk dmvkVar = (dmvk) obj;
        if (!ffkj.e(this.a, dmvkVar.a) || !ffkj.e(this.b, dmvkVar.b) || !ffkj.e(this.c, dmvkVar.c)) {
            return false;
        }
        boolean z = dmvkVar.d;
        return ffkj.e(this.e, dmvkVar.e) && ffkj.e(this.f, dmvkVar.f) && ffkj.e(this.g, dmvkVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + 1) * 31) + 1231) * 31) + this.e.hashCode();
        doas doasVar = this.f;
        return (((hashCode * 31) + (doasVar != null ? doasVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Preview(title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", stretchInLandscape=true, confirmButton=" + this.e + ", dismissButton=" + this.f + ", onDismissRequest=" + this.g + ")";
    }
}
