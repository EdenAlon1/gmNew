package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrg {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final lpo i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final nrd p;
    final engw q;

    public nrg(engw engwVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, lpo lpoVar, int i5, int i6, int i7, String str3, String str4, int i8, nrd nrdVar) {
        this.q = engwVar;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = lpoVar;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = nrdVar;
        a(str2, i8, engwVar, 1);
        a(str4, i8, engwVar, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, List list, int i2) {
        if (str == null || i == 1) {
            return;
        }
        enqv it = ((engw) list).iterator();
        char c = 0;
        while (it.hasNext()) {
            nrf nrfVar = (nrf) it.next();
            if ((i2 == 1 ? nrfVar.a : nrfVar.b) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrg)) {
            return false;
        }
        nrg nrgVar = (nrg) obj;
        return Objects.equals(this.q, nrgVar.q) && this.a == nrgVar.a && this.b == nrgVar.b && this.c == nrgVar.c && this.d == nrgVar.d && this.e == nrgVar.e && Objects.equals(this.f, nrgVar.f) && Objects.equals(this.g, nrgVar.g) && this.h == nrgVar.h && Objects.equals(this.i, nrgVar.i) && this.j == nrgVar.j && this.k == nrgVar.k && this.l == nrgVar.l && Objects.equals(this.m, nrgVar.m) && Objects.equals(this.n, nrgVar.n) && this.o == nrgVar.o && Objects.equals(this.p, nrgVar.p);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.q) * 31;
        String str = this.f;
        return ((((((((((((((((((((((((((((((hashCode + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Objects.hashCode(str)) * 31) + Objects.hashCode(this.g)) * 31) + this.h) * 31) + Objects.hashCode(this.i)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + Objects.hashCode(this.m)) * 31) + Objects.hashCode(this.n)) * 31) + this.o) * 31) + Objects.hashCode(this.p);
    }
}
