package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngv implements dngx {
    public final dnym a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final ffix f;
    public final dngq g;

    public dngv(dnym dnymVar, String str, String str2, boolean z, List list, ffix ffixVar, dngq dngqVar) {
        str2.getClass();
        list.getClass();
        dngqVar.getClass();
        this.a = dnymVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
        this.f = ffixVar;
        this.g = dngqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dngv)) {
            return false;
        }
        dngv dngvVar = (dngv) obj;
        return ffkj.e(this.a, dngvVar.a) && ffkj.e(this.b, dngvVar.b) && ffkj.e(this.c, dngvVar.c) && this.d == dngvVar.d && ffkj.e(this.e, dngvVar.e) && ffkj.e(this.f, dngvVar.f) && ffkj.e(this.g, dngvVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "Selectable(monogram=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", isSelected=" + this.d + ", annotations=" + this.e + ", onToggle=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ dngv(dnym dnymVar, String str, String str2, boolean z, List list, ffix ffixVar, dngq dngqVar, int i) {
        this(dnymVar, str, str2, z, (i & 16) != 0 ? ffel.a : list, (i & 32) != 0 ? new ffix() { // from class: dngu
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar, (i & 64) != 0 ? new dngq((char[]) null) : dngqVar);
    }
}
