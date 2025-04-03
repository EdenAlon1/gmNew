package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngp implements dngx {
    public final dnym a;
    public final String b;
    public final String c;
    public final List d;
    public final ffix e;
    public final dngq f;
    private final String g;

    public /* synthetic */ dngp(dnym dnymVar, String str, String str2, List list, ffix ffixVar, dngq dngqVar, int i) {
        list = (i & 16) != 0 ? ffel.a : list;
        ffixVar = (i & 32) != 0 ? new ffix() { // from class: dngo
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        dngqVar = (i & 64) != 0 ? new dngq((char[]) null) : dngqVar;
        str2 = (i & 4) != 0 ? null : str2;
        list.getClass();
        ffixVar.getClass();
        dngqVar.getClass();
        this.a = dnymVar;
        this.b = str;
        this.c = str2;
        this.g = null;
        this.d = list;
        this.e = ffixVar;
        this.f = dngqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dngp)) {
            return false;
        }
        dngp dngpVar = (dngp) obj;
        if (!ffkj.e(this.a, dngpVar.a) || !ffkj.e(this.b, dngpVar.b) || !ffkj.e(this.c, dngpVar.c)) {
            return false;
        }
        String str = dngpVar.g;
        return ffkj.e(null, null) && ffkj.e(this.d, dngpVar.d) && ffkj.e(this.e, dngpVar.e) && ffkj.e(this.f, dngpVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 961) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "Basic(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", tertiaryText=null, annotations=" + this.d + ", onClick=" + this.e + ", flags=" + this.f + ")";
    }
}
