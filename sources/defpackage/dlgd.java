package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgd extends dlaf {
    public static final dlgd a = new dlgd(null, 0 == true ? 1 : 0, false, 127);
    public final Set b;
    public final dlgo c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARN: Multi-variable type inference failed */
    public dlgd() {
        this(null, 0 == true ? 1 : 0, false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlgd)) {
            return false;
        }
        dlgd dlgdVar = (dlgd) obj;
        if (!ffkj.e(this.b, dlgdVar.b) || !ffkj.e(this.c, dlgdVar.c) || this.d != dlgdVar.d || this.e != dlgdVar.e) {
            return false;
        }
        int i = dlgdVar.f;
        int i2 = dlgdVar.g;
        int i3 = dlgdVar.h;
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + dlgc.a(this.d)) * 31) + dlgc.a(this.e)) * 31) + 1) * 31) + 1) * 31) + 1;
    }

    public /* synthetic */ dlgd(Set set, dlgo dlgoVar, boolean z, int i) {
        set = (i & 1) != 0 ? ffen.a : set;
        dlgoVar = (i & 2) != 0 ? dlge.a : dlgoVar;
        boolean z2 = (i & 4) != 0;
        boolean z3 = (i & 8) == 0;
        set.getClass();
        dlgoVar.getClass();
        this.b = set;
        this.c = dlgoVar;
        this.d = z2;
        this.e = z | (!z3);
        this.f = 1;
        this.g = 1;
        this.h = 1;
    }
}
