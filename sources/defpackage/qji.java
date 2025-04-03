package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qji {
    public final List a;
    public final qci b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final qig h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final qie p;
    public final qif q;
    public final qhw r;
    public final List s;
    public final boolean t;
    public final qij u;
    public final qkd v;
    public final int w;
    public final int x;

    public qji(List list, qci qciVar, String str, long j, int i, long j2, String str2, List list2, qig qigVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, qie qieVar, qif qifVar, List list3, int i5, qhw qhwVar, boolean z, qij qijVar, qkd qkdVar) {
        this.a = list;
        this.b = qciVar;
        this.c = str;
        this.d = j;
        this.w = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = qigVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = qieVar;
        this.q = qifVar;
        this.s = list3;
        this.x = i5;
        this.r = qhwVar;
        this.t = z;
        this.u = qijVar;
        this.v = qkdVar;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        qji d = this.b.d(this.e);
        if (d != null) {
            sb.append("\t\tParents: ");
            sb.append(d.c);
            qji d2 = this.b.d(d.e);
            while (d2 != null) {
                sb.append("->");
                sb.append(d2.c);
                d2 = this.b.d(d2.e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.g.size());
            sb.append("\n");
        }
        if (this.i != 0 && this.j != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
