package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kif {
    public kiu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public final HashMap r;
    khh s;

    public kif() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
    }

    public final void a(kif kifVar) {
        if (kifVar == null) {
            return;
        }
        this.f = kifVar.f;
        this.g = kifVar.g;
        this.h = kifVar.h;
        this.i = kifVar.i;
        this.j = kifVar.j;
        this.k = kifVar.k;
        this.l = kifVar.l;
        this.m = kifVar.m;
        this.n = kifVar.n;
        this.o = kifVar.o;
        this.p = kifVar.p;
        this.q = kifVar.q;
        this.s = kifVar.s;
        this.r.clear();
        for (khf khfVar : kifVar.r.values()) {
            this.r.put(khfVar.a, new khf(khfVar));
        }
    }

    public kif(kif kifVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
        this.a = kifVar.a;
        this.b = kifVar.b;
        this.c = kifVar.c;
        this.d = kifVar.d;
        this.e = kifVar.e;
        a(kifVar);
    }

    public kif(kiu kiuVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap();
        this.a = kiuVar;
    }
}
